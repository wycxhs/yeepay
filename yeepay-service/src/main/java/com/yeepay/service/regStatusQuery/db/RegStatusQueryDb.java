package com.yeepay.service.regStatusQuery.db;

import com.yeepay.dao.regStatusQuery.RegStatusQueryRequest;
import com.yeepay.dao.regStatusQuery.RegStatusQueryResult;
import org.springframework.stereotype.Service;

@Service
public interface RegStatusQueryDb {
    void regStatusQueryDb(RegStatusQueryRequest request, RegStatusQueryResult result);
}
