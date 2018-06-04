package com.yeepay.service.sendAuthorizeNum.impl;

import com.yeepay.common.swith.ReturnCode;
import com.yeepay.common.utils.JsonUtils;
import com.yeepay.dao.dealResult.DealResultFalse;
import com.yeepay.dao.sendAuthorizeNum.SendAuthorizeNumRequest;
import com.yeepay.dao.sendAuthorizeNum.SendAuthorizeNumResult;
import com.yeepay.service.merchantNoDb.MerchantNoDb;
import com.yeepay.service.sendAuthorizeNum.SendAuthorizeNum;
import com.yeepay.service.sendAuthorizeNum.db.SendAuthorizeNumDb;
import com.yeepay.service.yeepay.YeepayService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.io.IOException;
import java.util.Map;

@Service
public class SendAuthorizeNumImpl implements SendAuthorizeNum {

    @Autowired
    MerchantNoDb merchantNoDb;

    @Autowired
    SendAuthorizeNumDb sendAuthorizeNumDb;

    @Autowired
    ReturnCode returnCode;

    @Autowired
    DealResultFalse dealResultFalse;

    @Override
    public String sendAuthorizeNum(SendAuthorizeNumRequest request) throws IOException {
        request.setParentMerchantNo(YeepayService.getParentMerchantNo());
        request.setMerchantNo(merchantNoDb.merchantNo(request.getMerchantNo()));
        Map<String,String> map = JsonUtils.toMap(request);
        String url = YeepayService.getUrl(YeepayService.SENDAUTHORIZENUM_URL);
        Map<String, String> resultMap = YeepayService.requestYOP(map, url, YeepayService.SENDAUTHORIZENUM);
        if(resultMap.get("returnCode").equals("REG00000")){
            SendAuthorizeNumResult sendAuthorizeNumResult = JsonUtils.toObj(JsonUtils.toJson(resultMap),SendAuthorizeNumResult.class);
            sendAuthorizeNumDb.sendAuthorizeNumDb(request,sendAuthorizeNumResult);
            return JsonUtils.toJson(sendAuthorizeNumResult);
        }else{
            dealResultFalse.setReturnCode(returnCode.code(resultMap.get("returnCode")));
            dealResultFalse.setReturnMsg(resultMap.get("returnMsg"));
            return JsonUtils.toJson(dealResultFalse);
        }
    }
}
