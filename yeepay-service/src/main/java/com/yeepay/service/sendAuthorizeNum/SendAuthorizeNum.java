package com.yeepay.service.sendAuthorizeNum;

import com.yeepay.dao.sendAuthorizeNum.SendAuthorizeNumRequest;
import org.springframework.stereotype.Service;

import java.io.IOException;

@Service
public interface SendAuthorizeNum {
    String sendAuthorizeNum(SendAuthorizeNumRequest request) throws IOException;
}
