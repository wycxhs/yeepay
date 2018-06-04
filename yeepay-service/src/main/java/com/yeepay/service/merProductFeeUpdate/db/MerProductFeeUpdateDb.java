package com.yeepay.service.merProductFeeUpdate.db;

import com.yeepay.dao.merProductFeeUpdate.MerProductFeeUpdateRequest;
import com.yeepay.dao.merProductFeeUpdate.MerProductFeeUpdateResult;
import org.springframework.stereotype.Service;

@Service
public interface MerProductFeeUpdateDb {
    void merProductFeeUpdateDb(MerProductFeeUpdateRequest request, MerProductFeeUpdateResult result);
}
