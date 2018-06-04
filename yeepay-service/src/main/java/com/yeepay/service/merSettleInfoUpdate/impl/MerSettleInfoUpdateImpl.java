package com.yeepay.service.merSettleInfoUpdate.impl;

import com.yeepay.common.swith.ReturnCode;
import com.yeepay.common.utils.JsonUtils;
import com.yeepay.dao.dealResult.DealResultFalse;
import com.yeepay.dao.merSettleInfoUpdate.MerSettleInfoUpdateRequest;
import com.yeepay.dao.merSettleInfoUpdate.MerSettleInfoUpdateResult;
import com.yeepay.service.merSettleInfoUpdate.MerSettleInfoUpdate;
import com.yeepay.service.merSettleInfoUpdate.db.MerSettleInfoUpdateDb;
import com.yeepay.service.merchantNoDb.MerchantNoDb;
import com.yeepay.service.yeepay.YeepayService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.io.IOException;
import java.util.Map;

@Service
public class MerSettleInfoUpdateImpl implements MerSettleInfoUpdate {

    @Autowired
    MerchantNoDb merchantNoDb;

    @Autowired
    DealResultFalse dealResultFalse;

    @Autowired
    ReturnCode returnCode;

    @Autowired
    MerSettleInfoUpdateDb merSettleInfoUpdateDb;

    @Override
    public String merSettleInfoUpdate(MerSettleInfoUpdateRequest request) throws IOException {
        request.setParentMerchantNo(YeepayService.getParentMerchantNo());
        String merchantNo = request.getMerchantNo();
        request.setMerchantNo(merchantNoDb.merchantNo(request.getMerchantNo()));
        Map<String,String> map = JsonUtils.toMap(request);
        String url = YeepayService.getUrl(YeepayService.MERSETTLEINFOUPDATEFORO2O_URL);
        Map<String, String> resultMap = YeepayService.requestYOP(map, url, YeepayService.MERSETTLEINFOUPDATEFORO2O);
        if(resultMap.get("returnCode").equals("REG00000")){
            MerSettleInfoUpdateResult result = JsonUtils.toObj(JsonUtils.toJson(resultMap),MerSettleInfoUpdateResult.class);
            merSettleInfoUpdateDb.merSettleInfoUpdateDb(request,result);
            resultMap.replace("merchantNo",merchantNo);
            result = JsonUtils.toObj(JsonUtils.toJson(resultMap),MerSettleInfoUpdateResult.class);
            return JsonUtils.toJson(result);
        }else{
            dealResultFalse.setReturnCode(returnCode.code(resultMap.get("returnCode")));
            dealResultFalse.setReturnMsg(resultMap.get("returnMsg"));
            return JsonUtils.toJson(dealResultFalse);
        }
    }
}
