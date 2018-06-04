package com.yeepay.service.sendAuthorizeNum.db.impl;

import com.yeepay.common.utils.JsonUtils;
import com.yeepay.dao.sendAuthorizeNum.SendAuthorizeNumRequest;
import com.yeepay.dao.sendAuthorizeNum.SendAuthorizeNumResult;
import com.yeepay.dao.sendAuthorizeNum.domain.SendAuthorizeNum;
import com.yeepay.dao.sendAuthorizeNum.mapper.SendAuthorizeNumMapper;
import com.yeepay.service.sendAuthorizeNum.db.SendAuthorizeNumDb;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class SendAuthorizeNumDbImpl implements SendAuthorizeNumDb {

    @Autowired
    SendAuthorizeNumMapper sendAuthorizeNumMapper;

    @Override
    public void sendAuthorizeNumDb(SendAuthorizeNumRequest request, SendAuthorizeNumResult result) {
        SendAuthorizeNum sendAuthorizeNum = JsonUtils.toObj(JsonUtils.toJson(request),SendAuthorizeNum.class);
        sendAuthorizeNum = JsonUtils.toObj(JsonUtils.toJson(result),SendAuthorizeNum.class);
        sendAuthorizeNumMapper.insertSelective(sendAuthorizeNum);
    }
}
