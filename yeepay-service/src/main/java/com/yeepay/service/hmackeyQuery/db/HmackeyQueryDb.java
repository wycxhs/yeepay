package com.yeepay.service.hmackeyQuery.db;

import com.yeepay.dao.hmackeyQuery.HmackeyQueryRequest;
import com.yeepay.dao.hmackeyQuery.HmackeyQueryResult;
import org.springframework.stereotype.Service;

@Service
public interface HmackeyQueryDb {
    void hmackeyQueryDb(HmackeyQueryRequest request, HmackeyQueryResult result);
}
