package com.yeepay.service.enterprise.db;

import com.yeepay.dao.enterprise.EnterpriseRequest;
import com.yeepay.dao.enterprise.EnterpriseResult;
import org.springframework.stereotype.Service;

@Service
public interface EnterpriseDb {
    String enterpriseDb(EnterpriseRequest request,EnterpriseResult result);
}
