package com.yeepay.dao.sendMerSmsNotify;

import org.hibernate.validator.constraints.NotEmpty;

import javax.validation.constraints.Size;

public class SendMerSmsNotifyRequest {
    private String parentMerchantNo;
    @NotEmpty(message = "merchantNo不能为空")
    @Size(max = 64,message = "merchantNo数据异常")
    private String merchantNo;
    @NotEmpty(message = "merchantNo不能为空")
    @Size(max = 128,message = "merchantNo数据异常")
    private String phone;
    @NotEmpty(message = "merchantNo不能为空")
    @Size(max = 128,message = "merchantNo数据异常")
    private String sourceType;

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

    public String getSourceType() {
        return sourceType;
    }

    public void setSourceType(String sourceType) {
        this.sourceType = sourceType;
    }
}
