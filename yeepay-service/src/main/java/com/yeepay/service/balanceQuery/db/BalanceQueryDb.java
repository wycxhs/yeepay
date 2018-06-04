package com.yeepay.service.balanceQuery.db;

import com.yeepay.dao.balanceQuery.BalanceQueryRequest;
import com.yeepay.dao.balanceQuery.BalanceQueryResult;
import org.springframework.stereotype.Service;

@Service
public interface BalanceQueryDb {
    void balanceQueryDb(BalanceQueryRequest request, BalanceQueryResult result);
}
