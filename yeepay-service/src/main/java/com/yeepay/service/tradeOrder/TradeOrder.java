package com.yeepay.service.tradeOrder;

import com.yeepay.dao.tradeOrder.TradeOrderPost;
import org.springframework.stereotype.Service;

import java.io.IOException;

@Service
public interface TradeOrder {
    String tradeOrder(TradeOrderPost post) throws IOException;
}
