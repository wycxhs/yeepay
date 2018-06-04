package com.yeepay.service.regStatusQuery.impl;

import com.yeepay.common.swith.ReturnCode;
import com.yeepay.common.utils.JsonUtils;
import com.yeepay.dao.dealResult.DealResultFalse;
import com.yeepay.dao.regStatusQuery.RegStatusQueryRequest;
import com.yeepay.dao.regStatusQuery.RegStatusQueryResult;
import com.yeepay.service.merchantNoDb.MerchantNoDb;
import com.yeepay.service.regStatusQuery.RegStatusQuery;
import com.yeepay.service.regStatusQuery.db.RegStatusQueryDb;
import com.yeepay.service.yeepay.YeepayService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.io.IOException;
import java.util.Map;

@Service
public class RegStatusQueryImpl implements RegStatusQuery {

    @Autowired
    MerchantNoDb merchantNoDb;

    @Autowired
    RegStatusQueryDb regStatusQueryDb;

    @Autowired
    DealResultFalse dealResultFalse;

    @Autowired
    ReturnCode returnCode;

    @Override
    public String regStatusQuery(RegStatusQueryRequest request) throws IOException {
        request.setParentMerchantNo(YeepayService.getParentMerchantNo());
        String merchantNo = request.getMerchantNo();
        request.setMerchantNo(merchantNoDb.merchantNo(request.getMerchantNo()));
        Map<String,String> map = JsonUtils.toMap(request);
        String url = YeepayService.getUrl(YeepayService.REGSTATUSQUERY_URL);
        Map<String, String> resultMap = YeepayService.requestYOP(map, url, YeepayService.REGSTATUSQUERY);
        if(resultMap.get("returnCode").equals("REG00000")){
            RegStatusQueryResult result = JsonUtils.toObj(JsonUtils.toJson(resultMap),RegStatusQueryResult.class);
            regStatusQueryDb.regStatusQueryDb(request,result);
            resultMap.remove("parentMerchantNo");
            resultMap.replace("merchantNo",merchantNo);
            result = JsonUtils.toObj(JsonUtils.toJson(resultMap),RegStatusQueryResult.class);
            return JsonUtils.toJson(result);
        }else{
            dealResultFalse.setReturnCode(returnCode.code(resultMap.get("returnCode")));
            dealResultFalse.setReturnMsg(resultMap.get("returnMsg"));
            return JsonUtils.toJson(dealResultFalse);
        }
    }
}
