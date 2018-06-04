package com.yeepay.service.receiveAuthorizeNum;

import com.yeepay.dao.receiveAuthorizeNum.ReceiveAuthorizeNumRequest;
import org.springframework.stereotype.Service;

import java.io.IOException;

@Service
public interface ReceiveAuthorizeNum {
    String receiveAuthorizeNum(ReceiveAuthorizeNumRequest request) throws IOException;
}
