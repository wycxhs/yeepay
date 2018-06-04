package com.yeepay.dao.receiveAuthorizeNum;

import org.hibernate.validator.constraints.NotEmpty;

import javax.validation.constraints.Size;

public class ReceiveAuthorizeNumRequest {
    private String parentMerchantNo;
    @NotEmpty(message = "merchantNo不能为空")
    @Size(max = 64,message = "merchantNo数据异常")
    private String merchantNo;
    @NotEmpty(message = "phone不能为空")
    @Size(max = 50,message = "phone数据异常")
    private String phone;
    @NotEmpty(message = "merAuthorizeNum不能为空")
    @Size(max = 50,message = "merAuthorizeNum数据异常")
    private String merAuthorizeNum;

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

    public String getMerAuthorizeNum() {
        return merAuthorizeNum;
    }

    public void setMerAuthorizeNum(String merAuthorizeNum) {
        this.merAuthorizeNum = merAuthorizeNum;
    }
}
