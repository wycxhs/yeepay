package com.yeepay.service.balanceQuery.db.impl;

import com.yeepay.common.utils.JsonUtils;
import com.yeepay.dao.balanceQuery.BalanceQueryRequest;
import com.yeepay.dao.balanceQuery.BalanceQueryResult;
import com.yeepay.dao.balanceQuery.domain.BalanceQuery;
import com.yeepay.dao.balanceQuery.mapper.BalanceQueryMapper;
import com.yeepay.service.balanceQuery.db.BalanceQueryDb;
import org.springframework.beans.factory.annotation.Autowired;

public class BalanceQueryDbImpl implements BalanceQueryDb {

    @Autowired
    BalanceQueryMapper balanceQueryMapper;

    @Override
    public void balanceQueryDb(BalanceQueryRequest request, BalanceQueryResult result) {
        BalanceQuery balanceQuery = JsonUtils.toObj(JsonUtils.toJson(request),BalanceQuery.class);
        balanceQuery = JsonUtils.toObj(JsonUtils.toJson(result),BalanceQuery.class);
        balanceQueryMapper.insertSelective(balanceQuery);
    }
}
