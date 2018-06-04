package com.yeepay.service.merProductFeeUpdate.impl;

import com.yeepay.common.swith.ReturnCode;
import com.yeepay.common.utils.JsonUtils;
import com.yeepay.dao.dealResult.DealResultFalse;
import com.yeepay.dao.merProductFeeUpdate.MerProductFeeUpdateRequest;
import com.yeepay.dao.merProductFeeUpdate.MerProductFeeUpdateResult;
import com.yeepay.service.merProductFeeUpdate.MerProductFeeUpdate;
import com.yeepay.service.merProductFeeUpdate.db.MerProductFeeUpdateDb;
import com.yeepay.service.merchantNoDb.MerchantNoDb;
import com.yeepay.service.yeepay.YeepayService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.io.IOException;
import java.util.Map;

@Service
public class MerProductFeeUpdateImpl implements MerProductFeeUpdate {

    @Autowired
    MerchantNoDb merchantNoDb;

    @Autowired
    MerProductFeeUpdateDb merProductFeeUpdateDb;

    @Autowired
    ReturnCode returnCode;

    @Autowired
    DealResultFalse dealResultFalse;

    @Override
    public String merProductFeeUpdate(MerProductFeeUpdateRequest request) throws IOException {
        request.setParentMerchantNo(YeepayService.getParentMerchantNo());
        String merchantNo = request.getMerchantNo();
        request.setMerchantNo(merchantNoDb.merchantNo(request.getMerchantNo()));
        Map<String,String> map = JsonUtils.toMap(request);
        String url = YeepayService.getUrl(YeepayService.MERPRODUCTFEEUPDATEFORO2O_URL);
        Map<String, String> resultMap = YeepayService.requestYOP(map, url, YeepayService.MERPRODUCTFEEUPDATEFORO2O);
        if(resultMap.get("returnCode").equals("REG00000")){
            MerProductFeeUpdateResult result = JsonUtils.toObj(JsonUtils.toJson(resultMap),MerProductFeeUpdateResult.class);
            merProductFeeUpdateDb.merProductFeeUpdateDb(request,result);
            resultMap.replace("merchantNo",merchantNo);
            result = JsonUtils.toObj(JsonUtils.toJson(resultMap),MerProductFeeUpdateResult.class);
            return JsonUtils.toJson(result);
        }else{
            dealResultFalse.setReturnCode(returnCode.code(resultMap.get("returnCode")));
            dealResultFalse.setReturnMsg(resultMap.get("returnMsg"));
            return JsonUtils.toJson(dealResultFalse);
        }
    }
}
