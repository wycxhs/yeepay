package com.yeepay.service.receiveAuthorizeNum.db;

import com.yeepay.dao.receiveAuthorizeNum.ReceiveAuthorizeNumRequest;
import com.yeepay.dao.receiveAuthorizeNum.ReceiveAuthorizeNumResult;
import org.springframework.stereotype.Service;

@Service
public interface ReceiveAuthorizeNumDb {
    void receiveAuthorizeNumDb(ReceiveAuthorizeNumRequest request, ReceiveAuthorizeNumResult result);
}
