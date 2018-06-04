package com.yeepay.dao.payNotify.domain;

public class PayNotify {
    private Integer id;

    private String merchantNo;

    private String parentMerchantNo;

    private String orderId;

    private String uniqueOrderNo;

    private String status;

    private String orderAmount;

    private String payAmount;

    private String paySuccessDate;

    private String instCompany;

    private String instNumber;

    private String paymentProduct;

    private String platformType;

    private String openId;

    private String unionId;

    private String requestDate;

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

    public String getOrderAmount() {
        return orderAmount;
    }

    public void setOrderAmount(String orderAmount) {
        this.orderAmount = orderAmount == null ? null : orderAmount.trim();
    }

    public String getPayAmount() {
        return payAmount;
    }

    public void setPayAmount(String payAmount) {
        this.payAmount = payAmount == null ? null : payAmount.trim();
    }

    public String getPaySuccessDate() {
        return paySuccessDate;
    }

    public void setPaySuccessDate(String paySuccessDate) {
        this.paySuccessDate = paySuccessDate == null ? null : paySuccessDate.trim();
    }

    public String getInstCompany() {
        return instCompany;
    }

    public void setInstCompany(String instCompany) {
        this.instCompany = instCompany == null ? null : instCompany.trim();
    }

    public String getInstNumber() {
        return instNumber;
    }

    public void setInstNumber(String instNumber) {
        this.instNumber = instNumber == null ? null : instNumber.trim();
    }

    public String getPaymentProduct() {
        return paymentProduct;
    }

    public void setPaymentProduct(String paymentProduct) {
        this.paymentProduct = paymentProduct == null ? null : paymentProduct.trim();
    }

    public String getPlatformType() {
        return platformType;
    }

    public void setPlatformType(String platformType) {
        this.platformType = platformType == null ? null : platformType.trim();
    }

    public String getOpenId() {
        return openId;
    }

    public void setOpenId(String openId) {
        this.openId = openId == null ? null : openId.trim();
    }

    public String getUnionId() {
        return unionId;
    }

    public void setUnionId(String unionId) {
        this.unionId = unionId == null ? null : unionId.trim();
    }

    public String getRequestDate() {
        return requestDate;
    }

    public void setRequestDate(String requestDate) {
        this.requestDate = requestDate == null ? null : requestDate.trim();
    }
}