package com.yeepay.service.receiveAuthorizeNum.impl;

import com.yeepay.common.swith.ReturnCode;
import com.yeepay.common.utils.JsonUtils;
import com.yeepay.dao.dealResult.DealResultFalse;
import com.yeepay.dao.receiveAuthorizeNum.ReceiveAuthorizeNumRequest;
import com.yeepay.service.merchantNoDb.MerchantNoDb;
import com.yeepay.service.receiveAuthorizeNum.ReceiveAuthorizeNum;
import com.yeepay.service.yeepay.YeepayService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.io.IOException;
import java.util.Map;

@Service
public class ReceiveAuthorizeNumImpl implements ReceiveAuthorizeNum {

    @Autowired
    MerchantNoDb merchantNoDb;
    @Autowired
    DealResultFalse dealResultFalse;
    @Autowired
    ReturnCode returnCode;

    @Override
    public String receiveAuthorizeNum(ReceiveAuthorizeNumRequest request) throws IOException {
        request.setParentMerchantNo(YeepayService.getParentMerchantNo());
        request.setMerchantNo(merchantNoDb.merchantNo(request.getMerchantNo()));
        Map<String,String> map = JsonUtils.toMap(request);
        String url = YeepayService.getUrl(YeepayService.RECEIVEAUTHORIZENUM_URL);
        Map<String, String> resultMap = YeepayService.requestYOP(map, url, YeepayService.RECEIVEAUTHORIZENUM);
        dealResultFalse.setReturnCode(returnCode.code(resultMap.get("returnCode")));
        dealResultFalse.setReturnMsg(resultMap.get("returnMsg"));
        return JsonUtils.toJson(dealResultFalse);
    }
}
