package com.yeepay.service.merProductFeeUpdate.db.impl;

import com.yeepay.common.utils.JsonUtils;
import com.yeepay.dao.merProductFeeUpdate.MerProductFeeUpdateRequest;
import com.yeepay.dao.merProductFeeUpdate.MerProductFeeUpdateResult;
import com.yeepay.dao.merProductFeeUpdate.domain.MerProductFeeUpdate;
import com.yeepay.dao.merProductFeeUpdate.mapper.MerProductFeeUpdateMapper;
import com.yeepay.service.merProductFeeUpdate.db.MerProductFeeUpdateDb;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MerProductFeeUpdateDbImpl implements MerProductFeeUpdateDb {

    @Autowired
    MerProductFeeUpdateMapper merProductFeeUpdateMapper;

    @Override
    public void merProductFeeUpdateDb(MerProductFeeUpdateRequest request, MerProductFeeUpdateResult result) {
        MerProductFeeUpdate merProductFeeUpdate = JsonUtils.toObj(JsonUtils.toJson(request),MerProductFeeUpdate.class);
        merProductFeeUpdate = JsonUtils.toObj(JsonUtils.toJson(result),MerProductFeeUpdate.class);
        merProductFeeUpdateMapper.insertSelective(merProductFeeUpdate);
    }
}
