package com.yeepay.service.merSettleInfoUpdate;

import com.yeepay.dao.merSettleInfoUpdate.MerSettleInfoUpdateRequest;
import org.springframework.stereotype.Service;

import java.io.IOException;

@Service
public interface MerSettleInfoUpdate {
    String merSettleInfoUpdate(MerSettleInfoUpdateRequest request) throws IOException;
}
