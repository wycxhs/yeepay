package com.yeepay.service.enterprise.impl;

import com.yeepay.common.config.CommonConfig;
import com.yeepay.common.swith.ReturnCode;
import com.yeepay.common.utils.JsonUtils;
import com.yeepay.dao.dealResult.DealResult;
import com.yeepay.dao.dealResult.DealResultFalse;
import com.yeepay.dao.enterprise.EnterprisePost;
import com.yeepay.dao.enterprise.EnterpriseRequest;
import com.yeepay.dao.enterprise.EnterpriseResult;
import com.yeepay.service.createProductInfo.CreateEnterpriseBusinessFunction;
import com.yeepay.service.createProductInfo.CreateEnterpriseProductInfo;
import com.yeepay.service.createProductInfo.CreateFileInfo;
import com.yeepay.service.enterprise.Enterprise;
import com.yeepay.service.enterprise.db.EnterpriseDb;
import com.yeepay.service.yeepay.YeepayService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.io.IOException;
import java.util.Map;

@Service
public class EnterpriseImpl implements Enterprise {

    @Autowired
    EnterpriseDb enterpriseDb;

    @Autowired
    DealResult dealResult;

    @Autowired
    ReturnCode returnCode;

    @Autowired
    DealResultFalse dealResultFalse;

    @Autowired
    CommonConfig commonConfig;

    @Autowired
    CreateEnterpriseBusinessFunction createEnterpriseBusinessFunction;

    @Override
    public String enterprise(EnterprisePost post) throws IOException {
        String productInfo = CreateEnterpriseProductInfo.createEnterpriseProductInfo(post);
        String fileInfo = CreateFileInfo.createFileInfo(post.getFileInfo());
        String businessFuntion = createEnterpriseBusinessFunction.createEnterpriseBusinessFunction(post);
        EnterpriseRequest request = JsonUtils.toObj(JsonUtils.toJson(post),EnterpriseRequest.class);
        request.setProductInfo(productInfo);
        request.setFileInfo(fileInfo);
        request.setBusinessFunction(businessFuntion);
        request.setParentMerchantNo(YeepayService.getParentMerchantNo());
        String notifyUrl = request.getNotifyUrl();
        request.setNotifyUrl(commonConfig.enterpriseNotifyUrl);
        Map<String,String> map = JsonUtils.toMap(request);
        String url = YeepayService.getUrl(YeepayService.ENTERPRISE_URL);
        Map<String,String> resultMap = YeepayService.requestYOP(map,url,YeepayService.ENTERPRISE);
        EnterpriseResult result = JsonUtils.toObj(JsonUtils.toJson(resultMap),EnterpriseResult.class);
        if(result.equals("REG00000")){
            request.setNotifyUrl(notifyUrl);
            String merchantNo = enterpriseDb.enterpriseDb(request,result);
            resultMap.remove("parentMerchantNo");
            resultMap.replace("merchantNo",merchantNo);
            result = JsonUtils.toObj(JsonUtils.toJson(resultMap),EnterpriseResult.class);
            return JsonUtils.toJson(result);
        }else{
            dealResultFalse.setReturnCode(returnCode.code(resultMap.get("returnCode")));
            dealResultFalse.setReturnMsg(resultMap.get("returnMsg"));
            return JsonUtils.toJson(dealResultFalse);
        }
    }
}
