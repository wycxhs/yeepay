package com.yeepay.dao.refundNotify.domain;

public class RefundNotify {
    private Integer id;

    private String merchantNo;

    private String parentMerchantNo;

    private String orderId;

    private String uniqueOrderNo;

    private String status;

    private String refundRequestId;

    private String description;

    private String uniqueRefundNo;

    private String refundAmount;

    private String refundRequestDate;

    private String refundSuccessDate;

    private String orderAmount;

    private String residualAmount;

    private String errorMessage;

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

    public String getRefundSuccessDate() {
        return refundSuccessDate;
    }

    public void setRefundSuccessDate(String refundSuccessDate) {
        this.refundSuccessDate = refundSuccessDate == null ? null : refundSuccessDate.trim();
    }

    public String getOrderAmount() {
        return orderAmount;
    }

    public void setOrderAmount(String orderAmount) {
        this.orderAmount = orderAmount == null ? null : orderAmount.trim();
    }

    public String getResidualAmount() {
        return residualAmount;
    }

    public void setResidualAmount(String residualAmount) {
        this.residualAmount = residualAmount == null ? null : residualAmount.trim();
    }

    public String getErrorMessage() {
        return errorMessage;
    }

    public void setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage == null ? null : errorMessage.trim();
    }
}