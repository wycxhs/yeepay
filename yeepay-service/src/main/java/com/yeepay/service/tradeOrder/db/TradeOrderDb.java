package com.yeepay.service.tradeOrder.db;

import com.yeepay.dao.tradeOrder.TradeOrderRequest;
import com.yeepay.dao.tradeOrder.TradeOrderResult;
import org.springframework.stereotype.Service;

@Service
public interface TradeOrderDb {
    void tradeOrderDb(TradeOrderRequest request, TradeOrderResult result);
}
