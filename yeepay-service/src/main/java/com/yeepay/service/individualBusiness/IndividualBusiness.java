package com.yeepay.service.individualBusiness;

import com.yeepay.dao.individualBussiness.IndividualBusinessPost;
import org.springframework.stereotype.Service;

import java.io.IOException;

@Service
public interface IndividualBusiness {
    String individualBusiness(IndividualBusinessPost post) throws IOException;
}
