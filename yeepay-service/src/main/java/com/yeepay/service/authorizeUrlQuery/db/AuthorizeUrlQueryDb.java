package com.yeepay.service.authorizeUrlQuery.db;

import com.yeepay.dao.authorizeUrlQuery.AuthorizeUrlQueryRequest;
import com.yeepay.dao.authorizeUrlQuery.AuthorizeUrlQueryResult;
import org.springframework.stereotype.Service;

@Service
public interface AuthorizeUrlQueryDb {
    void authorizeUrlQueryDb(AuthorizeUrlQueryRequest request, AuthorizeUrlQueryResult result);
}
