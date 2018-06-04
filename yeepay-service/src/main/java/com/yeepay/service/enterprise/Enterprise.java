package com.yeepay.service.enterprise;

import com.yeepay.dao.enterprise.EnterprisePost;
import org.springframework.stereotype.Service;

import java.io.IOException;

@Service
public interface Enterprise {
    String enterprise(EnterprisePost post) throws IOException;
}
