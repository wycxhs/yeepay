package com.yeepay.service.authorizeUrlQuery.db.impl;

import com.yeepay.common.utils.JsonUtils;
import com.yeepay.dao.authorizeUrlQuery.AuthorizeUrlQueryRequest;
import com.yeepay.dao.authorizeUrlQuery.AuthorizeUrlQueryResult;
import com.yeepay.dao.authorizeUrlQuery.domain.AuthorizeUrlQuery;
import com.yeepay.dao.authorizeUrlQuery.mapper.AuthorizeUrlQueryMapper;
import com.yeepay.service.authorizeUrlQuery.db.AuthorizeUrlQueryDb;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AuthorizeUrlQueryDbImpl implements AuthorizeUrlQueryDb {

    @Autowired
    AuthorizeUrlQueryMapper authorizeUrlQueryMapper;

    @Override
    public void authorizeUrlQueryDb(AuthorizeUrlQueryRequest request, AuthorizeUrlQueryResult result) {
        AuthorizeUrlQuery authorizeUrlQuery = JsonUtils.toObj(JsonUtils.toJson(request),AuthorizeUrlQuery.class);
        authorizeUrlQuery = JsonUtils.toObj(JsonUtils.toJson(result),AuthorizeUrlQuery.class);
        authorizeUrlQueryMapper.insertSelective(authorizeUrlQuery);
    }
}
