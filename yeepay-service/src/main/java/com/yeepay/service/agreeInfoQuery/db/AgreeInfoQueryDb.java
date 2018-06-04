package com.yeepay.service.agreeInfoQuery.db;

import com.yeepay.dao.agreeInfoQuery.AgreeInfoQueryRequest;
import com.yeepay.dao.agreeInfoQuery.AgreeInfoQueryResult;
import org.springframework.stereotype.Service;

@Service
public interface AgreeInfoQueryDb {
    void agreeInfoQueryDb(AgreeInfoQueryRequest request, AgreeInfoQueryResult result);
}
