package com.yeepay.service.bankBranchInfo.impl;

import com.yeepay.common.utils.JsonUtils;
import com.yeepay.dao.bankBranchInfo.BankBranchInfoRequest;
import com.yeepay.dao.bankBranchInfo.BankBranchInfoResult;
import com.yeepay.service.bankBranchInfo.BankBranchInfo;
import com.yeepay.service.bankBranchInfo.db.BankBranchInfoDb;
import com.yeepay.service.yeepay.YeepayService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.io.IOException;
import java.util.Map;



@Service
public class BankBranchInfoImpl implements BankBranchInfo {

    @Autowired
    BankBranchInfoDb bankBranchInfoDb;

    @Override
    public String bankBranchInfo(BankBranchInfoRequest request) throws IOException {
        Map<String,String> map = JsonUtils.toMap(request);
        String uri = YeepayService.getUrl(YeepayService.BANKBRANCHINFO_URL);
        Map<String,String> resultMap = YeepayService.requestYOP(map, uri, YeepayService.BANKBRANCHINFO);
        BankBranchInfoResult result = JsonUtils.toObj(JsonUtils.toJson(resultMap),BankBranchInfoResult.class);
        bankBranchInfoDb.bankBranchInfoDb(request,result);
        return JsonUtils.toJson(result);
    }
}
