package com.yeepay.service.bankBranchInfo.db.impl;

import com.yeepay.common.utils.JsonUtils;
import com.yeepay.dao.bankBranchInfo.BankBranchInfoRequest;
import com.yeepay.dao.bankBranchInfo.BankBranchInfoResult;
import com.yeepay.dao.bankBranchInfo.domain.BankBranchInfo;
import com.yeepay.dao.bankBranchInfo.mapper.BankBranchInfoMapper;
import com.yeepay.service.bankBranchInfo.db.BankBranchInfoDb;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BankBranchInfoDbImpl implements BankBranchInfoDb {

    @Autowired
    BankBranchInfoMapper bankBranchInfoMapper;

    @Override
    public void bankBranchInfoDb(BankBranchInfoRequest request, BankBranchInfoResult result) {
        BankBranchInfo bankBranchInfo = JsonUtils.toObj(JsonUtils.toJson(request),BankBranchInfo.class);
        bankBranchInfo = JsonUtils.toObj(JsonUtils.toJson(result),BankBranchInfo.class);
        bankBranchInfoMapper.insertSelective(bankBranchInfo);
    }
}
