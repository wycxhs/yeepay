package com.yeepay.service.regStatusQuery;

import com.yeepay.dao.regStatusQuery.RegStatusQueryRequest;
import org.springframework.stereotype.Service;

import java.io.IOException;

@Service
public interface RegStatusQuery {
    String regStatusQuery(RegStatusQueryRequest request) throws IOException;
}
