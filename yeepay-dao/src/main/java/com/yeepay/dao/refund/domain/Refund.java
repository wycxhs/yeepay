package com.yeepay.dao.refund.domain;

public class Refund {
    private Integer id;

    private String merchantNo;

    private String parentMerchantNo;

    private String orderId;

    private String uniqueOrderNo;

    private String hmac;

    private String code;

    private String message;

    private String status;

    private String memo;

    private String refundRequestId;

    private String description;

    private String notifyUrl;

    private String accountDivided;

    private String uniqueRefundNo;

    private String refundAmount;

    private String residualAmount;

    private String refundRequestDate;

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

    public String getMemo() {
        return memo;
    }

    public void setMemo(String memo) {
        this.memo = memo == null ? null : memo.trim();
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

    public String getAccountDivided() {
        return accountDivided;
    }

    public void setAccountDivided(String accountDivided) {
        this.accountDivided = accountDivided == null ? null : accountDivided.trim();
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

    public String getResidualAmount() {
        return residualAmount;
    }

    public void setResidualAmount(String residualAmount) {
        this.residualAmount = residualAmount == null ? null : residualAmount.trim();
    }

    public String getRefundRequestDate() {
        return refundRequestDate;
    }

    public void setRefundRequestDate(String refundRequestDate) {
        this.refundRequestDate = refundRequestDate == null ? null : refundRequestDate.trim();
    }
}