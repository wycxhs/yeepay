package com.yeepay.service.individualBusiness.impl;

import com.yeepay.common.config.CommonConfig;
import com.yeepay.common.swith.ReturnCode;
import com.yeepay.common.utils.JsonUtils;
import com.yeepay.dao.dealResult.DealResultFalse;
import com.yeepay.dao.individualBussiness.IndividualBusinessPost;
import com.yeepay.dao.individualBussiness.IndividualBusinessRequest;
import com.yeepay.dao.individualBussiness.IndividualBusinessResult;
import com.yeepay.service.createProductInfo.CreateFileInfo;
import com.yeepay.service.createProductInfo.CreateIndividualBusinessBusinessFunction;
import com.yeepay.service.createProductInfo.CreateIndividualBusinessProductInfo;
import com.yeepay.service.individualBusiness.IndividualBusiness;
import com.yeepay.service.individualBusiness.db.IndividualBusinessDb;
import com.yeepay.service.yeepay.YeepayService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.io.IOException;
import java.util.Map;

@Service
public class IndividualBusinessImpl implements IndividualBusiness {
    @Autowired
    IndividualBusinessDb individualBusinessDb;

    @Autowired
    ReturnCode returnCode;

    @Autowired
    DealResultFalse dealResultFalse;

    @Autowired
    CommonConfig commonConfig;

    @Autowired
    CreateIndividualBusinessBusinessFunction createIndividualBusinessBusinessFunction;

    @Override
    public String individualBusiness(IndividualBusinessPost post) throws IOException {
        String productInfo = CreateIndividualBusinessProductInfo.createIndividualBusinessProductInfo(post);
        String fileInfo = CreateFileInfo.createFileInfo(post.getFileInfo());
        String businessFuntion = createIndividualBusinessBusinessFunction.createIndividualBusinessBusinessFunction(post);
        IndividualBusinessRequest individualRequest = JsonUtils.toObj(JsonUtils.toJson(post),IndividualBusinessRequest.class);
        individualRequest.setProductInfo(productInfo);
        individualRequest.setFileInfo(fileInfo);
        individualRequest.setBusinessFunction(businessFuntion);
        individualRequest.setParentMerchantNo(YeepayService.getParentMerchantNo());
        String notifyUrl = individualRequest.getNotifyUrl();
        individualRequest.setNotifyUrl(commonConfig.individualBusinessNotifyUrl);
        Map<String,String> map = JsonUtils.toMap(individualRequest);
        String url = YeepayService.getUrl(YeepayService.INDIVIDUAL_URL);
        Map<String,String> resultMap = YeepayService.requestYOP(map,url,YeepayService.INDIVIDUAL);
        IndividualBusinessResult result = JsonUtils.toObj(JsonUtils.toJson(resultMap),IndividualBusinessResult.class);
        if(result.equals("REG00000")){
            individualRequest.setNotifyUrl(notifyUrl);
            String merchantNo = individualBusinessDb.individualBusinessDb(individualRequest,result);
            resultMap.remove("parentMerchantNo");
            resultMap.replace("merchantNo",merchantNo);
            result = JsonUtils.toObj(JsonUtils.toJson(resultMap),IndividualBusinessResult.class);
            return JsonUtils.toJson(result);
        }else{
            dealResultFalse.setReturnCode(returnCode.code(resultMap.get("returnCode")));
            dealResultFalse.setReturnMsg(resultMap.get("returnMsg"));
            return JsonUtils.toJson(dealResultFalse);
        }
    }
}
