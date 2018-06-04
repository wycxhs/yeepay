package com.yeepay.service.authorizeUrlQuery;

import com.yeepay.dao.authorizeUrlQuery.AuthorizeUrlQueryRequest;
import org.springframework.stereotype.Service;

import java.io.IOException;

@Service
public interface AuthorizeUrlQuery {
    String authorizeUrlQuery(AuthorizeUrlQueryRequest request) throws IOException;
}
