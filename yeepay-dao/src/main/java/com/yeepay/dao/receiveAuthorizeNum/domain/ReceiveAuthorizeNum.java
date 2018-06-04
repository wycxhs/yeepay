package com.yeepay.dao.receiveAuthorizeNum.domain;

public class ReceiveAuthorizeNum {
    private Integer id;

    private String parentMerchantNo;

    private String returnMsg;

    private String merchantNo;

    private String returnCode;

    private String phone;

    private String merAuthorizeNum;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getParentMerchantNo() {
        return parentMerchantNo;
    }

    public void setParentMerchantNo(String parentMerchantNo) {
        this.parentMerchantNo = parentMerchantNo == null ? null : parentMerchantNo.trim();
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

    public String getReturnCode() {
        return returnCode;
    }

    public void setReturnCode(String returnCode) {
        this.returnCode = returnCode == null ? null : returnCode.trim();
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone == null ? null : phone.trim();
    }

    public String getMerAuthorizeNum() {
        return merAuthorizeNum;
    }

    public void setMerAuthorizeNum(String merAuthorizeNum) {
        this.merAuthorizeNum = merAuthorizeNum == null ? null : merAuthorizeNum.trim();
    }
}