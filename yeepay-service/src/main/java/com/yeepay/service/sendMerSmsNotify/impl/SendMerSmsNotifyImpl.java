package com.yeepay.service.sendMerSmsNotify.impl;

import com.yeepay.common.swith.ReturnCode;
import com.yeepay.common.utils.JsonUtils;
import com.yeepay.dao.dealResult.DealResultFalse;
import com.yeepay.dao.sendMerSmsNotify.SendMerSmsNotifyRequest;
import com.yeepay.service.merchantNoDb.MerchantNoDb;
import com.yeepay.service.sendMerSmsNotify.SendMerSmsNotify;
import com.yeepay.service.sendMerSmsNotify.db.SendMerSmsNotifyDb;
import com.yeepay.service.yeepay.YeepayService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.io.IOException;
import java.util.Map;

@Service
public class SendMerSmsNotifyImpl implements SendMerSmsNotify {

    @Autowired
    MerchantNoDb merchantNoDb;

    @Autowired
    DealResultFalse dealResultFalse;

    @Autowired
    ReturnCode returnCode;

    @Autowired
    SendMerSmsNotifyDb sendMerSmsNotifyDb;

    @Override
    public String sendMerSmsNotify(SendMerSmsNotifyRequest request) throws IOException {
        request.setParentMerchantNo(YeepayService.getParentMerchantNo());
        String merchantNo = request.getMerchantNo();
        request.setMerchantNo(merchantNoDb.merchantNo(request.getMerchantNo()));
        Map<String,String> map = JsonUtils.toMap(request);
        String url = YeepayService.getUrl(YeepayService.SENDMERSMSNOTIFY_URL);
        Map<String, String> resultMap = YeepayService.requestYOP(map, url, YeepayService.SENDMERSMSNOTIFY);
        dealResultFalse.setReturnCode(returnCode.code(resultMap.get("returnCode")));
        dealResultFalse.setReturnMsg(resultMap.get("returnMsg"));
        sendMerSmsNotifyDb.sendMerSmsNotifyDb(request,dealResultFalse);
        return JsonUtils.toJson(dealResultFalse);
    }
}

