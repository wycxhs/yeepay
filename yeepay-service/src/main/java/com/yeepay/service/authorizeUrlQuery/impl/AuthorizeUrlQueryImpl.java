package com.yeepay.service.authorizeUrlQuery.impl;

import com.yeepay.common.swith.ReturnCode;
import com.yeepay.common.utils.JsonUtils;
import com.yeepay.dao.authorizeUrlQuery.AuthorizeUrlQueryRequest;
import com.yeepay.dao.authorizeUrlQuery.AuthorizeUrlQueryResult;
import com.yeepay.dao.dealResult.DealResultFalse;
import com.yeepay.service.authorizeUrlQuery.AuthorizeUrlQuery;
import com.yeepay.service.authorizeUrlQuery.db.AuthorizeUrlQueryDb;
import com.yeepay.service.merchantNoDb.MerchantNoDb;
import com.yeepay.service.yeepay.YeepayService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.io.IOException;
import java.util.Map;

@Service
public class AuthorizeUrlQueryImpl implements AuthorizeUrlQuery {
    @Autowired
    MerchantNoDb merchantNoDb;

    @Autowired
    AuthorizeUrlQueryDb authorizeUrlQueryDb;

    @Autowired
    DealResultFalse dealResultFalse;

    @Autowired
    ReturnCode returnCode;

    @Override
    public String authorizeUrlQuery(AuthorizeUrlQueryRequest request) throws IOException {
        request.setParentMerchantNo(YeepayService.getParentMerchantNo());
        String merchantNo = request.getMerchantNo();
        request.setMerchantNo(merchantNoDb.merchantNo(request.getMerchantNo()));
        Map<String,String> map = JsonUtils.toMap(request);
        String url = YeepayService.getUrl(YeepayService.AUTHORIZEURLQUERY_URL);
        Map<String, String> resultMap = YeepayService.requestYOP(map, url, YeepayService.AUTHORIZEURLQUERY);
        if(resultMap.get("returnCode").equals("REG00000")){
            AuthorizeUrlQueryResult result = JsonUtils.toObj(JsonUtils.toJson(resultMap),AuthorizeUrlQueryResult.class);
            authorizeUrlQueryDb.authorizeUrlQueryDb(request,result);
            resultMap.remove("parentMerchantNo");
            resultMap.replace("merchantNo",merchantNo);
            result = JsonUtils.toObj(JsonUtils.toJson(resultMap),AuthorizeUrlQueryResult.class);
            return JsonUtils.toJson(result);
        }else{
            dealResultFalse.setReturnCode(returnCode.code(resultMap.get("returnCode")));
            dealResultFalse.setReturnMsg(resultMap.get("returnMsg"));
            return JsonUtils.toJson(dealResultFalse);
        }
    }
}
