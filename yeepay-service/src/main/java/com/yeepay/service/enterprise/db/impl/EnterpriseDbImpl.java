package com.yeepay.service.enterprise.db.impl;

import com.yeepay.common.utils.JsonUtils;
import com.yeepay.dao.enterprise.EnterpriseRequest;
import com.yeepay.dao.enterprise.EnterpriseResult;
import com.yeepay.dao.enterprise.domain.Enterprise;
import com.yeepay.dao.enterprise.mapper.EnterpriseMapper;
import com.yeepay.dao.merchantCopy.domain.MerchantCopy;
import com.yeepay.dao.merchantCopy.mapper.MerchantCopyMapper;
import com.yeepay.service.enterprise.db.EnterpriseDb;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Random;

@Service
public class EnterpriseDbImpl implements EnterpriseDb {
    @Autowired
    MerchantCopy merchantCopy;

    @Autowired
    MerchantCopyMapper merchantCopyMapper;

    @Autowired
    EnterpriseMapper enterpriseMapper;

    @Override
    public String enterpriseDb(EnterpriseRequest request, EnterpriseResult result) {
        Enterprise enterprise = JsonUtils.toObj(JsonUtils.toJson(request),Enterprise.class);
        enterprise = JsonUtils.toObj(JsonUtils.toJson(result),Enterprise.class);
        enterpriseMapper.insertSelective(enterprise);
        Random random = new Random();
        merchantCopy.setMerchantNoCopy(enterprise.getMerchantNo());
        merchantCopy.setMerchantNo(random.nextInt(1000000)+"JS");
        merchantCopyMapper.insertSelective(merchantCopy);
        return merchantCopy.getMerchantNo();
    }
}
