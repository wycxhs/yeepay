package com.yeepay.dao.refundQuery.domain;

public class RefundQuery {
    private Integer id;

    private String merchantNo;

    private String parentMerchantNo;

    private String orderId;

    private String uniqueOrderNo;

    private String hmac;

    private String code;

    private String message;

    private String status;

    private String refundRequestId;

    private String description;

    private String notifyUrl;

    private String uniqueRefundNo;

    private String refundAmount;

    private String refundRequestDate;

    private String returnMerchantFee;

    private String refundSuccessDate;

    private String realDeductAmount;

    private String realRefundAmount;

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

    public String getRefundRequestId() {
        return refundRequestId;
    }

    public void setRefundRequestId(String refundRequestId) {
        this.refundRequestId = refundRequestId == null ? null : refundRequestId.trim();
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description == null ? null : description.trim();
    }

    public String getNotifyUrl() {
        return notifyUrl;
    }

    public void setNotifyUrl(String notifyUrl) {
        this.notifyUrl = notifyUrl == null ? null : notifyUrl.trim();
    }

    public String getUniqueRefundNo() {
        return uniqueRefundNo;
    }

    public void setUniqueRefundNo(String uniqueRefundNo) {
        this.uniqueRefundNo = uniqueRefundNo == null ? null : uniqueRefundNo.trim();
    }

    public String getRefundAmount() {
        return refundAmount;
    }

    public void setRefundAmount(String refundAmount) {
        this.refundAmount = refundAmount == null ? null : refundAmount.trim();
    }

    public String getRefundRequestDate() {
        return refundRequestDate;
    }

    public void setRefundRequestDate(String refundRequestDate) {
        this.refundRequestDate = refundRequestDate == null ? null : refundRequestDate.trim();
    }

    public String getReturnMerchantFee() {
        return returnMerchantFee;
    }

    public void setReturnMerchantFee(String returnMerchantFee) {
        this.returnMerchantFee = returnMerchantFee == null ? null : returnMerchantFee.trim();
    }

    public String getRefundSuccessDate() {
        return refundSuccessDate;
    }

    public void setRefundSuccessDate(String refundSuccessDate) {
        this.refundSuccessDate = refundSuccessDate == null ? null : refundSuccessDate.trim();
    }

    public String getRealDeductAmount() {
        return realDeductAmount;
    }

    public void setRealDeductAmount(String realDeductAmount) {
        this.realDeductAmount = realDeductAmount == null ? null : realDeductAmount.trim();
    }

    public String getRealRefundAmount() {
        return realRefundAmount;
    }

    public void setRealRefundAmount(String realRefundAmount) {
        this.realRefundAmount = realRefundAmount == null ? null : realRefundAmount.trim();
    }
}