package com.yeepay.service.individualBusiness.db;

import com.yeepay.dao.individualBussiness.IndividualBusinessRequest;
import com.yeepay.dao.individualBussiness.IndividualBusinessResult;
import org.springframework.stereotype.Service;

@Service
public interface IndividualBusinessDb {
    String individualBusinessDb(IndividualBusinessRequest request, IndividualBusinessResult result);
}
