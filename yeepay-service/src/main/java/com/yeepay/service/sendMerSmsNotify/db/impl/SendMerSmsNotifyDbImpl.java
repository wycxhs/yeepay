package com.yeepay.service.sendMerSmsNotify.db.impl;

import com.yeepay.common.utils.JsonUtils;
import com.yeepay.dao.dealResult.DealResultFalse;
import com.yeepay.dao.sendMerSmsNotify.SendMerSmsNotifyRequest;
import com.yeepay.dao.sendMerSmsNotify.domain.SendMerSmsNotify;
import com.yeepay.dao.sendMerSmsNotify.mapper.SendMerSmsNotifyMapper;
import com.yeepay.service.sendMerSmsNotify.db.SendMerSmsNotifyDb;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class SendMerSmsNotifyDbImpl implements SendMerSmsNotifyDb {

    @Autowired
    SendMerSmsNotifyMapper sendMerSmsNotifyMapper;

    @Override
    public void sendMerSmsNotifyDb(SendMerSmsNotifyRequest request, DealResultFalse result) {
        SendMerSmsNotify sendMerSmsNotify = JsonUtils.toObj(JsonUtils.toJson(request),SendMerSmsNotify.class);
        sendMerSmsNotify = JsonUtils.toObj(JsonUtils.toJson(result),SendMerSmsNotify.class);
        sendMerSmsNotifyMapper.insertSelective(sendMerSmsNotify);
    }
}
