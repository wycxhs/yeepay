package com.yeepay.dao.divide.domain;

public class Divide {
    private Integer id;

    private String merchantNo;

    private String parentMerchantNo;

    private String orderId;

    private String uniqueOrderNo;

    private String hmac;

    private String divideRequestId;

    private String divideDetail;

    private String infoParamExt;

    private String code;

    private String message;

    private String status;

    private byte[] contactNo;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getMerchantNo() {
        return merchantNo;
    }

    public void setMerchantNo(String merchantNo) {
        this.merchantNo = merchantNo == null ? null : merchantNo.trim();
    }

    public String getParentMerchantNo() {
        return parentMerchantNo;
    }

    public void setParentMerchantNo(String parentMerchantNo) {
        this.parentMerchantNo = parentMerchantNo == null ? null : parentMerchantNo.trim();
    }

    public String getOrderId() {
        return orderId;
    }

    public void setOrderId(String orderId) {
        this.orderId = orderId == null ? null : orderId.trim();
    }

    public String getUniqueOrderNo() {
        return uniqueOrderNo;
    }

    public void setUniqueOrderNo(String uniqueOrderNo) {
        this.uniqueOrderNo = uniqueOrderNo == null ? null : uniqueOrderNo.trim();
    }

    public String getHmac() {
        return hmac;
    }

    public void setHmac(String hmac) {
        this.hmac = hmac == null ? null : hmac.trim();
    }

    public String getDivideRequestId() {
        return divideRequestId;
    }

    public void setDivideRequestId(String divideRequestId) {
        this.divideRequestId = divideRequestId == null ? null : divideRequestId.trim();
    }

    public String getDivideDetail() {
        return divideDetail;
    }

    public void setDivideDetail(String divideDetail) {
        this.divideDetail = divideDetail == null ? null : divideDetail.trim();
    }

    public String getInfoParamExt() {
        return infoParamExt;
    }

    public void setInfoParamExt(String infoParamExt) {
        this.infoParamExt = infoParamExt == null ? null : infoParamExt.trim();
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code == null ? null : code.trim();
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message == null ? null : message.trim();
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status == null ? null : status.trim();
    }

    public byte[] getContactNo() {
        return contactNo;
    }

    public void setContactNo(byte[] contactNo) {
        this.contactNo = contactNo;
    }
}