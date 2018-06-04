package com.yeepay.service.hmackeyQuery;

import com.yeepay.dao.hmackeyQuery.HmackeyQueryRequest;
import org.springframework.stereotype.Service;

import java.io.IOException;

@Service
public interface HmackeyQuery {
    String hmackeyQuery(HmackeyQueryRequest request) throws IOException;
}
