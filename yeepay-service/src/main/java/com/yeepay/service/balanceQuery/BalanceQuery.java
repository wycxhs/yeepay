package com.yeepay.service.balanceQuery;

import com.yeepay.dao.balanceQuery.BalanceQueryRequest;
import org.springframework.stereotype.Service;

import java.io.IOException;

@Service
public interface BalanceQuery {
    String balanceQuery(BalanceQueryRequest request) throws IOException;
}
