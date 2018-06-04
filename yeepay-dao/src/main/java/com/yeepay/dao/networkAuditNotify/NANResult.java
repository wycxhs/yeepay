package com.yeepay.dao.networkAuditNotify;

public class NANResult {

    private String merNo;

    private String externalId;

    private String requestNo;

    private String merFullName;

    private String merNetInStatus;

    private String remark;

    private String sign;

    public String getSign() {
        return sign;
    }

    public void setSign(String sign) {
        this.sign = sign;
    }

    public String getMerNo() {
        return merNo;
    }

    public void setMerNo(String merNo) {
        this.merNo = merNo;
    }

    public String getExternalId() {
        return externalId;
    }

    public void setExternalId(String externalId) {
        this.externalId = externalId;
    }

    public String getRequestNo() {
        return requestNo;
    }

    public void setRequestNo(String requestNo) {
        this.requestNo = requestNo;
    }

    public String getMerFullName() {
        return merFullName;
    }

    public void setMerFullName(String merFullName) {
        this.merFullName = merFullName;
    }

    public String getMerNetInStatus() {
        return merNetInStatus;
    }

    public void setMerNetInStatus(String merNetInStatus) {
        this.merNetInStatus = merNetInStatus;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }
}
