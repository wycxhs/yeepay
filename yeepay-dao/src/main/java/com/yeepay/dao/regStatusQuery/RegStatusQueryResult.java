package com.yeepay.dao.regStatusQuery;

public class RegStatusQueryResult {
    private String requestNo;

    private String parentMerchantNo;

    private String returnCode;

    private String returnMsg;

    private String merchantNo;

    private String externalId;

    private String merNetInOutStatus;

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

    public String getReturnCode() {
        return returnCode;
    }

    public void setReturnCode(String returnCode) {
        this.returnCode = returnCode;
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

    public String getExternalId() {
        return externalId;
    }

    public void setExternalId(String externalId) {
        this.externalId = externalId;
    }

    public String getMerNetInOutStatus() {
        return merNetInOutStatus;
    }

    public void setMerNetInOutStatus(String merNetInOutStatus) {
        this.merNetInOutStatus = merNetInOutStatus;
    }
}
