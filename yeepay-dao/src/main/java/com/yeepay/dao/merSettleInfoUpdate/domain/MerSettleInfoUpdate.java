package com.yeepay.dao.merSettleInfoUpdate.domain;

public class MerSettleInfoUpdate {
    private Integer id;

    private String requestNo;

    private String parentMerchantNo;

    private String headBankName;

    private String bankProvince;

    private String bankCity;

    private String returnCode;

    private String returnMsg;

    private String merchantNo;

    private String merAuthorizeNum;

    private String bankcardNo;

    private String bankName;

    private String callbackurl;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getRequestNo() {
        return requestNo;
    }

    public void setRequestNo(String requestNo) {
        this.requestNo = requestNo == null ? null : requestNo.trim();
    }

    public String getParentMerchantNo() {
        return parentMerchantNo;
    }

    public void setParentMerchantNo(String parentMerchantNo) {
        this.parentMerchantNo = parentMerchantNo == null ? null : parentMerchantNo.trim();
    }

    public String getHeadBankName() {
        return headBankName;
    }

    public void setHeadBankName(String headBankName) {
        this.headBankName = headBankName == null ? null : headBankName.trim();
    }

    public String getBankProvince() {
        return bankProvince;
    }

    public void setBankProvince(String bankProvince) {
        this.bankProvince = bankProvince == null ? null : bankProvince.trim();
    }

    public String getBankCity() {
        return bankCity;
    }

    public void setBankCity(String bankCity) {
        this.bankCity = bankCity == null ? null : bankCity.trim();
    }

    public String getReturnCode() {
        return returnCode;
    }

    public void setReturnCode(String returnCode) {
        this.returnCode = returnCode == null ? null : returnCode.trim();
    }

    public String getReturnMsg() {
        return returnMsg;
    }

    public void setReturnMsg(String returnMsg) {
        this.returnMsg = returnMsg == null ? null : returnMsg.trim();
    }

    public String getMerchantNo() {
        return merchantNo;
    }

    public void setMerchantNo(String merchantNo) {
        this.merchantNo = merchantNo == null ? null : merchantNo.trim();
    }

    public String getMerAuthorizeNum() {
        return merAuthorizeNum;
    }

    public void setMerAuthorizeNum(String merAuthorizeNum) {
        this.merAuthorizeNum = merAuthorizeNum == null ? null : merAuthorizeNum.trim();
    }

    public String getBankcardNo() {
        return bankcardNo;
    }

    public void setBankcardNo(String bankcardNo) {
        this.bankcardNo = bankcardNo == null ? null : bankcardNo.trim();
    }

    public String getBankName() {
        return bankName;
    }

    public void setBankName(String bankName) {
        this.bankName = bankName == null ? null : bankName.trim();
    }

    public String getCallbackurl() {
        return callbackurl;
    }

    public void setCallbackurl(String callbackurl) {
        this.callbackurl = callbackurl == null ? null : callbackurl.trim();
    }
}