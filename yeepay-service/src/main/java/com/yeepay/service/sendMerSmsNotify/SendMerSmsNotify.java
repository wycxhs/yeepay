package com.yeepay.service.sendMerSmsNotify;

import com.yeepay.dao.sendMerSmsNotify.SendMerSmsNotifyRequest;
import org.springframework.stereotype.Service;

import java.io.IOException;

@Service
public interface SendMerSmsNotify {
    String sendMerSmsNotify(SendMerSmsNotifyRequest request) throws IOException;
}
