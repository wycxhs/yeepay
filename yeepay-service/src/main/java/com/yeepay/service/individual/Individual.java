package com.yeepay.service.individual;

import com.yeepay.dao.individual.IndividualPost;
import org.springframework.stereotype.Service;

import java.io.IOException;

@Service
public interface Individual {
    String individual(IndividualPost post) throws IOException;
}
