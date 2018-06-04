package com.yeepay.service.sendAuthorizeNum.db;

import com.yeepay.dao.sendAuthorizeNum.SendAuthorizeNumRequest;
import com.yeepay.dao.sendAuthorizeNum.SendAuthorizeNumResult;
import org.springframework.stereotype.Service;

@Service
public interface SendAuthorizeNumDb {
    void sendAuthorizeNumDb(SendAuthorizeNumRequest request, SendAuthorizeNumResult result);
}
