package com.yeepay.service.bankBranchInfo.db;

import com.yeepay.dao.bankBranchInfo.BankBranchInfoRequest;
import com.yeepay.dao.bankBranchInfo.BankBranchInfoResult;
import org.springframework.stereotype.Service;

@Service
public interface BankBranchInfoDb {
    void bankBranchInfoDb(BankBranchInfoRequest request, BankBranchInfoResult result);
}
