package com.yeepay.service.merSettleInfoUpdate.db.impl;

import com.yeepay.common.utils.JsonUtils;
import com.yeepay.dao.merSettleInfoUpdate.MerSettleInfoUpdateRequest;
import com.yeepay.dao.merSettleInfoUpdate.MerSettleInfoUpdateResult;
import com.yeepay.dao.merSettleInfoUpdate.domain.MerSettleInfoUpdate;
import com.yeepay.dao.merSettleInfoUpdate.mapper.MerSettleInfoUpdateMapper;
import com.yeepay.service.merSettleInfoUpdate.db.MerSettleInfoUpdateDb;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MerSettleInfoUpdateDbImpl implements MerSettleInfoUpdateDb {

    @Autowired
    MerSettleInfoUpdateMapper merSettleInfoUpdateMapper;

    @Override
    public void merSettleInfoUpdateDb(MerSettleInfoUpdateRequest request, MerSettleInfoUpdateResult result) {
        MerSettleInfoUpdate merSettleInfoUpdate = JsonUtils.toObj(JsonUtils.toJson(request),MerSettleInfoUpdate.class);
        merSettleInfoUpdate = JsonUtils.toObj(JsonUtils.toJson(result),MerSettleInfoUpdate.class);
        merSettleInfoUpdateMapper.insertSelective(merSettleInfoUpdate);
    }
}
