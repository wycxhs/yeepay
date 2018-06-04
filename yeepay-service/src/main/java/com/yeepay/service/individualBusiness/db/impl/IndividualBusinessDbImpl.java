package com.yeepay.service.individualBusiness.db.impl;

import com.yeepay.common.utils.JsonUtils;
import com.yeepay.dao.individualBussiness.IndividualBusinessRequest;
import com.yeepay.dao.individualBussiness.IndividualBusinessResult;
import com.yeepay.dao.individualBussiness.domain.IndividualBussiness;
import com.yeepay.dao.individualBussiness.mapper.IndividualBussinessMapper;
import com.yeepay.dao.merchantCopy.domain.MerchantCopy;
import com.yeepay.dao.merchantCopy.mapper.MerchantCopyMapper;
import com.yeepay.service.individualBusiness.db.IndividualBusinessDb;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Random;

@Service
public class IndividualBusinessDbImpl implements IndividualBusinessDb {


    @Autowired
    MerchantCopy merchantCopy;

    @Autowired
    MerchantCopyMapper merchantCopyMapper;

    @Autowired
    IndividualBussinessMapper individualBussinessMapper;


    @Override
    public String individualBusinessDb(IndividualBusinessRequest request, IndividualBusinessResult result) {
        IndividualBussiness individualBussiness = JsonUtils.toObj(JsonUtils.toJson(request),IndividualBussiness.class);
        individualBussiness = JsonUtils.toObj(JsonUtils.toJson(result),IndividualBussiness.class);
        individualBussinessMapper.insertSelective(individualBussiness);
        Random random = new Random();
        merchantCopy.setMerchantNoCopy(individualBussiness.getMerchantNo());
        merchantCopy.setMerchantNo(random.nextInt(1000000)+"JS");
        merchantCopyMapper.insertSelective(merchantCopy);
        return merchantCopy.getMerchantNo();
    }
}
