package com.yeepay.service.callBack;

import com.yeepay.common.utils.HttpUtils;
import com.yeepay.common.utils.JsonUtils;
import com.yeepay.dao.individual.domain.Individual;
import com.yeepay.dao.individual.domain.IndividualExample;
import com.yeepay.dao.individual.mapper.IndividualMapper;
import com.yeepay.dao.networkAuditNotify.NANResult;
import com.yeepay.dao.networkAuditNotify.domain.NetworkAuditNotify;
import com.yeepay.dao.networkAuditNotify.mapper.NetworkAuditNotifyMapper;
import com.yeepay.service.callBack.rabbitMq.RabbitMq;
import com.yeepay.service.encrypt.Encrypt;
import com.yeepay.service.merchantNoDb.MerchantNoDb;
import org.springframework.beans.factory.annotation.Autowired;

import java.io.IOException;
import java.util.List;
import java.util.Map;
import java.util.SortedMap;
import java.util.TreeMap;
import java.util.concurrent.TimeoutException;

public class IndividualNotify implements Runnable{
    @Autowired
    NetworkAuditNotifyMapper networkAuditNotifyMapper;

    @Autowired
    MerchantNoDb merchantNoDb;

    @Autowired
    IndividualMapper individualMapper;

    private NetworkAuditNotify request;

    public IndividualNotify(NetworkAuditNotify request) {
        this.request = request;
    }

    public void individualNotify(NetworkAuditNotify request) throws InterruptedException, TimeoutException, IOException {
        networkAuditNotifyMapper.insertSelective(request);
        IndividualExample example = new IndividualExample();
        example.createCriteria().andMerchantNoEqualTo(request.getMerNo());
        List<Individual> list = individualMapper.selectByExample(example);
        String url = list.get(0).getNotifyUrl();
        String merNo = merchantNoDb.merchantNoCopy(request.getMerNo());
        request.setMerNo(merNo);
        Map<String,String> resultMap = JsonUtils.toMap(request);
        resultMap.remove("agentNo");
        SortedMap map = new TreeMap(JsonUtils.toMap(request));
        String resultStr = Encrypt.createSign(map,merchantNoDb.key(request.getMerNo()));
        NANResult nanResult = JsonUtils.toObj(JsonUtils.toJson(request),NANResult.class);
        nanResult.setSign(resultStr);
        String[] rabbitArray = {"0", "15000", "15000", "30000", "180000", "1800000", "1800000", "1800000", "1800000", "3600000"};
        RabbitMq mq = new RabbitMq();
        String verity = null;
        for (String rabbit : rabbitArray) {
            if (rabbit.equals("0")) {
                verity = HttpUtils.doPost(url, JsonUtils.toJson(JsonUtils.toJson(nanResult)));
            } else {
                String coney = mq.queue(JsonUtils.toJson(JsonUtils.toJson(nanResult)), rabbit);
                verity = HttpUtils.doPost(url, coney);
            }
            if (verity.equalsIgnoreCase("SUCCESS")) {
                break;
            }
        }
    }

    @Override
    public void run() {
        try {
            this.individualNotify(request);
        } catch (InterruptedException e) {
            e.printStackTrace();
        } catch (TimeoutException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
