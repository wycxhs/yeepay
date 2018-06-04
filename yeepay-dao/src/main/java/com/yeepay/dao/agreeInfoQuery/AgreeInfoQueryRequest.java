package com.yeepay.dao.agreeInfoQuery;

import org.hibernate.validator.constraints.NotEmpty;

import javax.validation.constraints.Size;

public class AgreeInfoQueryRequest {

    private String parentMerchantNo;
    @NotEmpty(message = "merchantNo不能为空")
    @Size(max = 64,message = "merchantNo数据异常")
    private String merchantNo;

    public String getParentMerchantNo() {
        return parentMerchantNo;
    }

    public void setParentMerchantNo(String parentMerchantNo) {
        this.parentMerchantNo = parentMerchantNo;
    }

    public String getMerchantNo() {
        return merchantNo;
    }

    public void setMerchantNo(String merchantNo) {
        this.merchantNo = merchantNo;
    }
}
