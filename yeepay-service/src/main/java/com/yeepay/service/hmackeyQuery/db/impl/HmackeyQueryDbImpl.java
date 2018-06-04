package com.yeepay.service.hmackeyQuery.db.impl;

import com.yeepay.common.utils.JsonUtils;
import com.yeepay.dao.hmackeyQuery.HmackeyQueryRequest;
import com.yeepay.dao.hmackeyQuery.HmackeyQueryResult;
import com.yeepay.dao.hmackeyQuery.domain.HmackeyQuery;
import com.yeepay.dao.hmackeyQuery.mapper.HmackeyQueryMapper;
import com.yeepay.service.hmackeyQuery.db.HmackeyQueryDb;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class HmackeyQueryDbImpl implements HmackeyQueryDb {

    @Autowired
    HmackeyQueryMapper hmackeyQueryMapper;

    @Override
    public void hmackeyQueryDb(HmackeyQueryRequest request, HmackeyQueryResult result) {
        HmackeyQuery hmackeyQuery = JsonUtils.toObj(JsonUtils.toJson(request),HmackeyQuery.class);
        hmackeyQuery = JsonUtils.toObj(JsonUtils.toJson(result),HmackeyQuery.class);
        hmackeyQueryMapper.insertSelective(hmackeyQuery);
    }
}
