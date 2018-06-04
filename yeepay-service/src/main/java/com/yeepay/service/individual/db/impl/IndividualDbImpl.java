package com.yeepay.service.individual.db.impl;

import com.yeepay.common.utils.JsonUtils;
import com.yeepay.dao.individual.IndividualRequest;
import com.yeepay.dao.individual.IndividualResult;
import com.yeepay.dao.individual.domain.Individual;
import com.yeepay.dao.individual.mapper.IndividualMapper;
import com.yeepay.dao.merchantCopy.domain.MerchantCopy;
import com.yeepay.dao.merchantCopy.mapper.MerchantCopyMapper;
import com.yeepay.service.individual.db.IndividualDb;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Random;

@Service
public class IndividualDbImpl implements IndividualDb {

    @Autowired
    MerchantCopy merchantCopy;

    @Autowired
    MerchantCopyMapper merchantCopyMapper;

    @Autowired
    IndividualMapper individualMapper;

    @Override
    public String individualDb(IndividualRequest request, IndividualResult result) {
        Individual individual = JsonUtils.toObj(JsonUtils.toJson(request),Individual.class);
        individual = JsonUtils.toObj(JsonUtils.toJson(result),Individual.class);
        individualMapper.insertSelective(individual);
        Random random = new Random();
        merchantCopy.setMerchantNoCopy(individual.getMerchantNo());
        merchantCopy.setMerchantNo(random.nextInt(1000000)+"JS");
        merchantCopyMapper.insertSelective(merchantCopy);
        return merchantCopy.getMerchantNo();
    }
}
