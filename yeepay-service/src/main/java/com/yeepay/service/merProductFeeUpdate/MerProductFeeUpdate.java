package com.yeepay.service.merProductFeeUpdate;

import com.yeepay.dao.merProductFeeUpdate.MerProductFeeUpdateRequest;
import org.springframework.stereotype.Service;

import java.io.IOException;

@Service
public interface MerProductFeeUpdate {
    String merProductFeeUpdate(MerProductFeeUpdateRequest request) throws IOException;
}
