package com.yeepay.dao.authorizeUrlQuery;

public class AuthorizeUrlQueryResult {
    private String parentMerchantNo;

    private String returnMsg;

    private String merchantNo;

    private String returnCode;

    private String merAuthorizeWebUrl;

    private String phone;

    public String getParentMerchantNo() {
        return parentMerchantNo;
    }

    public void setParentMerchantNo(String parentMerchantNo) {
        this.parentMerchantNo = parentMerchantNo;
    }

    public String getReturnMsg() {
        return returnMsg;
    }

    public void setReturnMsg(String returnMsg) {
        this.returnMsg = returnMsg;
    }

    public String getMerchantNo() {
        return merchantNo;
    }

    public void setMerchantNo(String merchantNo) {
        this.merchantNo = merchantNo;
    }

    public String getReturnCode() {
        return returnCode;
    }

    public void setReturnCode(String returnCode) {
        this.returnCode = returnCode;
    }

    public String getMerAuthorizeWebUrl() {
        return merAuthorizeWebUrl;
    }

    public void setMerAuthorizeWebUrl(String merAuthorizeWebUrl) {
        this.merAuthorizeWebUrl = merAuthorizeWebUrl;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }
}
