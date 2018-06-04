package com.yeepay.service.receiveAuthorizeNum.db.impl;

import com.yeepay.common.utils.JsonUtils;
import com.yeepay.dao.receiveAuthorizeNum.ReceiveAuthorizeNumRequest;
import com.yeepay.dao.receiveAuthorizeNum.ReceiveAuthorizeNumResult;
import com.yeepay.dao.receiveAuthorizeNum.domain.ReceiveAuthorizeNum;
import com.yeepay.dao.receiveAuthorizeNum.mapper.ReceiveAuthorizeNumMapper;
import com.yeepay.service.receiveAuthorizeNum.db.ReceiveAuthorizeNumDb;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ReceiveAuthorizeNumDbImpl implements ReceiveAuthorizeNumDb {

    @Autowired
    ReceiveAuthorizeNumMapper receiveAuthorizeNumMapper;

    @Override
    public void receiveAuthorizeNumDb(ReceiveAuthorizeNumRequest request, ReceiveAuthorizeNumResult result) {
        ReceiveAuthorizeNum receiveAuthorizeNum = JsonUtils.toObj(JsonUtils.toJson(request),ReceiveAuthorizeNum.class);
        receiveAuthorizeNum = JsonUtils.toObj(JsonUtils.toJson(result),ReceiveAuthorizeNum.class);
        receiveAuthorizeNumMapper.insertSelective(receiveAuthorizeNum);
    }
}
