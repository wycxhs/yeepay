package com.yeepay.dao.orderQuery.domain;

public class OrderQuery {
    private Integer id;

    private String merchantNo;

    private String parentMerchantNo;

    private String orderId;

    private String uniqueOrderNo;

    private String hmac;

    private String code;

    private String message;

    private String status;

    private String orderAmount;

    private String payAmount;

    private String customerFee;

    private String mercahntFee;

    private String requestDate;

    private String paySuccessDate;

    private String goodsParamExt;

    private String memo;

    private String token;

    private String instCompany;

    private String instNumber;

    private String industryParamExt;

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

    public String getCustomerFee() {
        return customerFee;
    }

    public void setCustomerFee(String customerFee) {
        this.customerFee = customerFee == null ? null : customerFee.trim();
    }

    public String getMercahntFee() {
        return mercahntFee;
    }

    public void setMercahntFee(String mercahntFee) {
        this.mercahntFee = mercahntFee == null ? null : mercahntFee.trim();
    }

    public String getRequestDate() {
        return requestDate;
    }

    public void setRequestDate(String requestDate) {
        this.requestDate = requestDate == null ? null : requestDate.trim();
    }

    public String getPaySuccessDate() {
        return paySuccessDate;
    }

    public void setPaySuccessDate(String paySuccessDate) {
        this.paySuccessDate = paySuccessDate == null ? null : paySuccessDate.trim();
    }

    public String getGoodsParamExt() {
        return goodsParamExt;
    }

    public void setGoodsParamExt(String goodsParamExt) {
        this.goodsParamExt = goodsParamExt == null ? null : goodsParamExt.trim();
    }

    public String getMemo() {
        return memo;
    }

    public void setMemo(String memo) {
        this.memo = memo == null ? null : memo.trim();
    }

    public String getToken() {
        return token;
    }

    public void setToken(String token) {
        this.token = token == null ? null : token.trim();
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

    public String getIndustryParamExt() {
        return industryParamExt;
    }

    public void setIndustryParamExt(String industryParamExt) {
        this.industryParamExt = industryParamExt == null ? null : industryParamExt.trim();
    }
}