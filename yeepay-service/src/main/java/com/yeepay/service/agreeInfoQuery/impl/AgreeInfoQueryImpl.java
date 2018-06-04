package com.yeepay.service.agreeInfoQuery.impl;

import com.yeepay.common.swith.ReturnCode;
import com.yeepay.common.utils.JsonUtils;
import com.yeepay.dao.agreeInfoQuery.AgreeInfoQueryRequest;
import com.yeepay.dao.agreeInfoQuery.AgreeInfoQueryResult;
import com.yeepay.dao.dealResult.DealResultFalse;
import com.yeepay.service.agreeInfoQuery.AgreeInfoQuery;
import com.yeepay.service.agreeInfoQuery.db.AgreeInfoQueryDb;
import com.yeepay.service.merchantNoDb.MerchantNoDb;
import com.yeepay.service.yeepay.YeepayService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.io.IOException;
import java.util.Map;

@Service
public class AgreeInfoQueryImpl implements AgreeInfoQuery {

    @Autowired
    MerchantNoDb merchantNoDb;

    @Autowired
    AgreeInfoQueryDb agreeInfoQueryDb;

    @Autowired
    ReturnCode returnCode;

    @Autowired
    DealResultFalse dealResultFalse;

    @Override
    public String agreeInfoQuery(AgreeInfoQueryRequest request) throws IOException {
        request.setParentMerchantNo(YeepayService.getParentMerchantNo());
        String merchantNo = request.getMerchantNo();
        request.setMerchantNo(merchantNoDb.merchantNo(request.getMerchantNo()));
        Map<String,String> map = JsonUtils.toMap(request);
        String url = YeepayService.getUrl(YeepayService.AGREEINFOQUERY_URL);
        Map<String, String> resultMap = YeepayService.requestYOP(map, url, YeepayService.AGREEINFOQUERY);
        if(resultMap.get("returnCode").equals("REG00000")){
            AgreeInfoQueryResult result = JsonUtils.toObj(JsonUtils.toJson(resultMap),AgreeInfoQueryResult.class);
            agreeInfoQueryDb.agreeInfoQueryDb(request,result);
            resultMap.remove("parentMerchantNo");
            resultMap.replace("merchantNo",merchantNo);
            result = JsonUtils.toObj(JsonUtils.toJson(resultMap),AgreeInfoQueryResult.class);
            return JsonUtils.toJson(result);
        }else{
            dealResultFalse.setReturnCode(returnCode.code(resultMap.get("returnCode")));
            dealResultFalse.setReturnMsg(resultMap.get("returnMsg"));
            return JsonUtils.toJson(dealResultFalse);
        }
    }
}
