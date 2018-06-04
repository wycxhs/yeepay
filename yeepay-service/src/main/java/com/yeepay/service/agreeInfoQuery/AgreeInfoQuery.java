package com.yeepay.service.agreeInfoQuery;

import com.yeepay.dao.agreeInfoQuery.AgreeInfoQueryRequest;
import org.springframework.stereotype.Service;

import java.io.IOException;

@Service
public interface AgreeInfoQuery {
    String agreeInfoQuery(AgreeInfoQueryRequest request) throws IOException;
}
