package com.yeepay.service.individual.db;

import com.yeepay.dao.individual.IndividualRequest;
import com.yeepay.dao.individual.IndividualResult;
import org.springframework.stereotype.Service;

@Service
public interface IndividualDb {
    String individualDb(IndividualRequest request, IndividualResult result);
}
