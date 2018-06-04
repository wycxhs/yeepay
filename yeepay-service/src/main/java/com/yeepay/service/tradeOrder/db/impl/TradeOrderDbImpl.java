package com.yeepay.service.tradeOrder.db.impl;

import com.yeepay.common.utils.JsonUtils;
import com.yeepay.dao.tradeOrder.TradeOrderRequest;
import com.yeepay.dao.tradeOrder.TradeOrderResult;
import com.yeepay.dao.tradeOrder.domain.TradeOrder;
import com.yeepay.dao.tradeOrder.mapper.TradeOrderMapper;
import com.yeepay.service.tradeOrder.db.TradeOrderDb;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TradeOrderDbImpl implements TradeOrderDb {

    @Autowired
    TradeOrderMapper tradeOrderMapper;

    @Override
    public void tradeOrderDb(TradeOrderRequest request, TradeOrderResult result) {
        TradeOrder tradeOrder = JsonUtils.toObj(JsonUtils.toJson(request),TradeOrder.class);
        tradeOrder = JsonUtils.toObj(JsonUtils.toJson(result),TradeOrder.class);
        tradeOrderMapper.insertSelective(tradeOrder);
    }
}
