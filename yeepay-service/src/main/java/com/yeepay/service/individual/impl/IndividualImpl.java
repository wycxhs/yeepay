package com.yeepay.service.individual.impl;

import com.yeepay.common.config.CommonConfig;
import com.yeepay.common.swith.ReturnCode;
import com.yeepay.common.utils.JsonUtils;
import com.yeepay.dao.dealResult.DealResultFalse;
import com.yeepay.dao.individual.IndividualPost;
import com.yeepay.dao.individual.IndividualRequest;
import com.yeepay.dao.individual.IndividualResult;
import com.yeepay.service.createProductInfo.CreateFileInfo;
import com.yeepay.service.createProductInfo.CreateIndividualBusinessFunction;
import com.yeepay.service.createProductInfo.CreateIndividualProductInfo;
import com.yeepay.service.individual.Individual;
import com.yeepay.service.individual.db.IndividualDb;
import com.yeepay.service.yeepay.YeepayService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.io.IOException;
import java.util.Map;

@Service
public class IndividualImpl implements Individual {

    @Autowired
    IndividualDb individualDb;

    @Autowired
    ReturnCode returnCode;

    @Autowired
    DealResultFalse dealResultFalse;

    @Autowired
    CommonConfig commonConfig;

    @Autowired
    CreateIndividualBusinessFunction createIndividualBusinessFunction;

    @Override
    public String individual(IndividualPost post) throws IOException {
        String productInfo = CreateIndividualProductInfo.createIndividualProductInfo(post);
        String fileInfo = CreateFileInfo.createFileInfo(post.getFileInfo());
        String businessFuntion = createIndividualBusinessFunction.createIndividualBusinessFunction(post);
        IndividualRequest individualRequest = JsonUtils.toObj(JsonUtils.toJson(post),IndividualRequest.class);
        individualRequest.setProductInfo(productInfo);
        individualRequest.setFileInfo(fileInfo);
        individualRequest.setBusinessFunction(businessFuntion);
        individualRequest.setParentMerchantNo(YeepayService.getParentMerchantNo());
        String notifyUrl = individualRequest.getNotifyUrl();
        individualRequest.setNotifyUrl(commonConfig.individualNotifyUrl);
        Map<String,String> map = JsonUtils.toMap(individualRequest);
        String url = YeepayService.getUrl(YeepayService.PERSON_URL);
        Map<String,String> resultMap = YeepayService.requestYOP(map,url,YeepayService.PERSON);
        IndividualResult result = JsonUtils.toObj(JsonUtils.toJson(resultMap),IndividualResult.class);
        if(result.equals("REG00000")){
            individualRequest.setNotifyUrl(notifyUrl);
            String merchantNo = individualDb.individualDb(individualRequest,result);
            resultMap.remove("parentMerchantNo");
            resultMap.replace("merchantNo",merchantNo);
            result = JsonUtils.toObj(JsonUtils.toJson(resultMap),IndividualResult.class);
            return JsonUtils.toJson(result);
        }else{
            dealResultFalse.setReturnCode(returnCode.code(resultMap.get("returnCode")));
            dealResultFalse.setReturnMsg(resultMap.get("returnMsg"));
            return JsonUtils.toJson(dealResultFalse);
        }
    }
}
