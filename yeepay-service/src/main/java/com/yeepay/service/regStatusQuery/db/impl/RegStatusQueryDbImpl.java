package com.yeepay.service.regStatusQuery.db.impl;

import com.yeepay.common.utils.JsonUtils;
import com.yeepay.dao.regStatusQuery.RegStatusQueryRequest;
import com.yeepay.dao.regStatusQuery.RegStatusQueryResult;
import com.yeepay.dao.regStatusQuery.domain.RegStatusQuery;
import com.yeepay.dao.regStatusQuery.mapper.RegStatusQueryMapper;
import com.yeepay.service.regStatusQuery.db.RegStatusQueryDb;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class RegStatusQueryDbImpl implements RegStatusQueryDb {

    @Autowired
    RegStatusQueryMapper regStatusQueryMapper;

    @Override
    public void regStatusQueryDb(RegStatusQueryRequest request, RegStatusQueryResult result) {
        RegStatusQuery regStatusQuery = JsonUtils.toObj(JsonUtils.toJson(request),RegStatusQuery.class);
        regStatusQuery = JsonUtils.toObj(JsonUtils.toJson(result),RegStatusQuery.class);
        regStatusQueryMapper.insertSelective(regStatusQuery);
    }
}
