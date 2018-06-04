package com.yeepay.service.sendMerSmsNotify.db;

import com.yeepay.dao.dealResult.DealResultFalse;
import com.yeepay.dao.sendMerSmsNotify.SendMerSmsNotifyRequest;
import org.springframework.stereotype.Service;

@Service
public interface SendMerSmsNotifyDb {
    void sendMerSmsNotifyDb(SendMerSmsNotifyRequest request, DealResultFalse result);
}
