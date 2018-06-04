package com.yeepay.dao.sendAuthorizeNum;

import org.hibernate.validator.constraints.NotEmpty;

import javax.validation.constraints.Size;

public class SendAuthorizeNumRequest {

    private String parentMerchantNo;
    @NotEmpty(message = "merchantNo不能为空")
    @Size(max = 64,message = "merchantNo数据异常")
    private String merchantNo;
    @NotEmpty(message = "phone不能为空")
    @Size(max = 11,message = "phone数据异常")
    private String phone;

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

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }
}
