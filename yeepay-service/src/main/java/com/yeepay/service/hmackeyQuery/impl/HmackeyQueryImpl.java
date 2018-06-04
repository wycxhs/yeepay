package com.yeepay.service.hmackeyQuery.impl;

import com.yeepay.common.swith.ReturnCode;
import com.yeepay.common.utils.JsonUtils;
import com.yeepay.dao.dealResult.DealResultFalse;
import com.yeepay.dao.hmackeyQuery.HmackeyQueryRequest;
import com.yeepay.dao.hmackeyQuery.HmackeyQueryResult;
import com.yeepay.service.hmackeyQuery.HmackeyQuery;
import com.yeepay.service.hmackeyQuery.db.HmackeyQueryDb;
import com.yeepay.service.merchantNoDb.MerchantNoDb;
import com.yeepay.service.yeepay.YeepayService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.io.IOException;
import java.util.Map;

@Service
public class HmackeyQueryImpl implements HmackeyQuery {
    @Autowired
    MerchantNoDb merchantNoDb;

    @Autowired
    HmackeyQueryDb hmackeyQueryDb;

    @Autowired
    DealResultFalse dealResultFalse;

    @Autowired
    ReturnCode returnCode;

    @Override
    public String hmackeyQuery(HmackeyQueryRequest request) throws IOException {
        request.setParentMerchantNo(YeepayService.getParentMerchantNo());
        String merchantNo = request.getMerchantNo();
        request.setMerchantNo(merchantNoDb.merchantNo(request.getMerchantNo()));
        Map<String,String> map = JsonUtils.toMap(request);
        String url = YeepayService.getUrl(YeepayService.HMACKEYQUERY_URL);
        Map<String, String> resultMap = YeepayService.requestYOP(map, url, YeepayService.HMACKEYQUERY);
        if(resultMap.get("returnCode").equals("REG00000")){
            HmackeyQueryResult result = JsonUtils.toObj(JsonUtils.toJson(resultMap),HmackeyQueryResult.class);
            hmackeyQueryDb.hmackeyQueryDb(request,result);
            return JsonUtils.toJson(result);
        }else{
            dealResultFalse.setReturnCode(returnCode.code(resultMap.get("returnCode")));
            dealResultFalse.setReturnMsg(resultMap.get("returnMsg"));
            return JsonUtils.toJson(dealResultFalse);
        }
    }
}
