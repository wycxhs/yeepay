package com.yeepay.dao.merSettleInfoUpdate;

import org.hibernate.validator.constraints.NotEmpty;

import javax.validation.constraints.Size;

public class MerSettleInfoUpdateRequest {
    @NotEmpty(message = "requestNo不能为空")
    @Size(max = 64,message = "requestNo数据异常")
    private String requestNo;

    private String parentMerchantNo;
    @NotEmpty(message = "headBankName不能为空")
    @Size(max = 128,message = "headBankName数据异常")
    private String headBankName;
    @NotEmpty(message = "bankProvince不能为空")
    @Size(max = 128,message = "bankProvince数据异常")
    private String bankProvince;
    @NotEmpty(message = "bankCity不能为空")
    @Size(max = 128,message = "bankCity数据异常")
    private String bankCity;
    @NotEmpty(message = "merchantNo不能为空")
    @Size(max = 64,message = "merchantNo数据异常")
    private String merchantNo;
    @NotEmpty(message = "merAuthorizeNum不能为空")
    @Size(max = 6,message = "merAuthorizeNum数据异常")
    private String merAuthorizeNum;
    @NotEmpty(message = "bankcardNo不能为空")
    @Size(max = 128,message = "bankcardNo数据异常")
    private String bankcardNo;
    @NotEmpty(message = "bankName不能为空")
    @Size(max = 128,message = "bankName数据异常")
    private String bankName;

    private String callbackurl;

    public String getRequestNo() {
        return requestNo;
    }

    public void setRequestNo(String requestNo) {
        this.requestNo = requestNo;
    }

    public String getParentMerchantNo() {
        return parentMerchantNo;
    }

    public void setParentMerchantNo(String parentMerchantNo) {
        this.parentMerchantNo = parentMerchantNo;
    }

    public String getHeadBankName() {
        return headBankName;
    }

    public void setHeadBankName(String headBankName) {
        this.headBankName = headBankName;
    }

    public String getBankProvince() {
        return bankProvince;
    }

    public void setBankProvince(String bankProvince) {
        this.bankProvince = bankProvince;
    }

    public String getBankCity() {
        return bankCity;
    }

    public void setBankCity(String bankCity) {
        this.bankCity = bankCity;
    }

    public String getMerchantNo() {
        return merchantNo;
    }

    public void setMerchantNo(String merchantNo) {
        this.merchantNo = merchantNo;
    }

    public String getMerAuthorizeNum() {
        return merAuthorizeNum;
    }

    public void setMerAuthorizeNum(String merAuthorizeNum) {
        this.merAuthorizeNum = merAuthorizeNum;
    }

    public String getBankcardNo() {
        return bankcardNo;
    }

    public void setBankcardNo(String bankcardNo) {
        this.bankcardNo = bankcardNo;
    }

    public String getBankName() {
        return bankName;
    }

    public void setBankName(String bankName) {
        this.bankName = bankName;
    }

    public String getCallbackurl() {
        return callbackurl;
    }

    public void setCallbackurl(String callbackurl) {
        this.callbackurl = callbackurl;
    }
}
