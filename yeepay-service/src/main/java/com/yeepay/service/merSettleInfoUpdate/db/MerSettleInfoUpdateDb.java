package com.yeepay.service.merSettleInfoUpdate.db;

import com.yeepay.dao.merSettleInfoUpdate.MerSettleInfoUpdateRequest;
import com.yeepay.dao.merSettleInfoUpdate.MerSettleInfoUpdateResult;
import org.springframework.stereotype.Service;

@Service
public interface MerSettleInfoUpdateDb {
    void merSettleInfoUpdateDb(MerSettleInfoUpdateRequest request, MerSettleInfoUpdateResult result);
}
