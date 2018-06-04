package com.yeepay.service.bankBranchInfo;

import com.yeepay.dao.bankBranchInfo.BankBranchInfoRequest;
import org.springframework.stereotype.Service;

import java.io.IOException;

@Service
public interface BankBranchInfo {
    String bankBranchInfo(BankBranchInfoRequest request) throws IOException;
}
