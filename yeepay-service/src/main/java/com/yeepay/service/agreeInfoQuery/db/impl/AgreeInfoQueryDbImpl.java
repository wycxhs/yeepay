package com.yeepay.service.agreeInfoQuery.db.impl;

import com.yeepay.common.utils.JsonUtils;
import com.yeepay.dao.agreeInfoQuery.AgreeInfoQueryRequest;
import com.yeepay.dao.agreeInfoQuery.AgreeInfoQueryResult;
import com.yeepay.dao.agreeInfoQuery.domain.AgreeInfoQuery;
import com.yeepay.dao.agreeInfoQuery.mapper.AgreeInfoQueryMapper;
import com.yeepay.service.agreeInfoQuery.db.AgreeInfoQueryDb;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AgreeInfoQueryDbImpl implements AgreeInfoQueryDb {

    @Autowired
    AgreeInfoQueryMapper agreeInfoQueryMapper;

    @Override
    public void agreeInfoQueryDb(AgreeInfoQueryRequest request, AgreeInfoQueryResult result) {
        AgreeInfoQuery agreeInfoQuery = JsonUtils.toObj(JsonUtils.toJson(request),AgreeInfoQuery.class);
        agreeInfoQuery = JsonUtils.toObj(JsonUtils.toJson(result),AgreeInfoQuery.class);
        agreeInfoQueryMapper.insertSelective(agreeInfoQuery);
    }
}
