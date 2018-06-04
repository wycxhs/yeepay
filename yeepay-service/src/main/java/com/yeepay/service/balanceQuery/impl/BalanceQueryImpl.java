package com.yeepay.service.balanceQuery.impl;

import com.yeepay.common.swith.ReturnCode;
import com.yeepay.common.utils.JsonUtils;
import com.yeepay.dao.balanceQuery.BalanceQueryRequest;
import com.yeepay.dao.balanceQuery.BalanceQueryResult;
import com.yeepay.dao.dealResult.DealResultFalse;
import com.yeepay.service.balanceQuery.BalanceQuery;
import com.yeepay.service.balanceQuery.db.BalanceQueryDb;
import com.yeepay.service.merchantNoDb.MerchantNoDb;
import com.yeepay.service.yeepay.YeepayService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.io.IOException;
import java.util.Map;

@Service
public class BalanceQueryImpl implements BalanceQuery {

    @Autowired
    MerchantNoDb merchantNoDb;

    @Autowired
    BalanceQueryDb balanceQueryDb;

    @Autowired
    DealResultFalse dealResultFalse;

    @Autowired
    ReturnCode returnCode;

    @Override
    public String balanceQuery(BalanceQueryRequest request) throws IOException {
        request.setParentMerchantNo(YeepayService.getParentMerchantNo());
        String merchantNo = request.getMerchantNo();
        request.setMerchantNo(merchantNoDb.merchantNo(request.getMerchantNo()));
        Map<String,String> map = JsonUtils.toMap(request);
        String url = YeepayService.getUrl(YeepayService.BALANCEQUERY_URL);
        Map<String, String> resultMap = YeepayService.requestYOP(map, url, YeepayService.BALANCEQUERY);
        if(resultMap.get("returnCode").equals("REG00000")){
            BalanceQueryResult result = JsonUtils.toObj(JsonUtils.toJson(resultMap),BalanceQueryResult.class);
            balanceQueryDb.balanceQueryDb(request,result);
            return JsonUtils.toJson(result);
        }else{
            dealResultFalse.setReturnCode(returnCode.code(resultMap.get("returnCode")));
            dealResultFalse.setReturnMsg(resultMap.get("returnMsg"));
            return JsonUtils.toJson(dealResultFalse);
        }
    }
}
