package com.yeepay.dao.tradeOrder.domain;

public class TradeOrder {
    private Integer id;

    private String parentMerchantNo;

    private String merchantNo;

    private String orderId;

    private String orderAmount;

    private String timeoutExpress;

    private String requestDate;

    private String redirectUrl;

    private String notifyUrl;

    private String goodsParamExt;

    private String paymentParamExt;

    private String industryParamExt;

    private String memo;

    private String riskParamExt;

    private String csUrl;

    private String fundProcessType;

    private String divideDetail;

    private String divideNotifyUrl;

    private String hmac;

    private String code;

    private String message;

    private String uniqueOrderNo;

    private String token;

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

    public String getMerchantNo() {
        return merchantNo;
    }

    public void setMerchantNo(String merchantNo) {
        this.merchantNo = merchantNo == null ? null : merchantNo.trim();
    }

    public String getOrderId() {
        return orderId;
    }

    public void setOrderId(String orderId) {
        this.orderId = orderId == null ? null : orderId.trim();
    }

    public String getOrderAmount() {
        return orderAmount;
    }

    public void setOrderAmount(String orderAmount) {
        this.orderAmount = orderAmount == null ? null : orderAmount.trim();
    }

    public String getTimeoutExpress() {
        return timeoutExpress;
    }

    public void setTimeoutExpress(String timeoutExpress) {
        this.timeoutExpress = timeoutExpress == null ? null : timeoutExpress.trim();
    }

    public String getRequestDate() {
        return requestDate;
    }

    public void setRequestDate(String requestDate) {
        this.requestDate = requestDate == null ? null : requestDate.trim();
    }

    public String getRedirectUrl() {
        return redirectUrl;
    }

    public void setRedirectUrl(String redirectUrl) {
        this.redirectUrl = redirectUrl == null ? null : redirectUrl.trim();
    }

    public String getNotifyUrl() {
        return notifyUrl;
    }

    public void setNotifyUrl(String notifyUrl) {
        this.notifyUrl = notifyUrl == null ? null : notifyUrl.trim();
    }

    public String getGoodsParamExt() {
        return goodsParamExt;
    }

    public void setGoodsParamExt(String goodsParamExt) {
        this.goodsParamExt = goodsParamExt == null ? null : goodsParamExt.trim();
    }

    public String getPaymentParamExt() {
        return paymentParamExt;
    }

    public void setPaymentParamExt(String paymentParamExt) {
        this.paymentParamExt = paymentParamExt == null ? null : paymentParamExt.trim();
    }

    public String getIndustryParamExt() {
        return industryParamExt;
    }

    public void setIndustryParamExt(String industryParamExt) {
        this.industryParamExt = industryParamExt == null ? null : industryParamExt.trim();
    }

    public String getMemo() {
        return memo;
    }

    public void setMemo(String memo) {
        this.memo = memo == null ? null : memo.trim();
    }

    public String getRiskParamExt() {
        return riskParamExt;
    }

    public void setRiskParamExt(String riskParamExt) {
        this.riskParamExt = riskParamExt == null ? null : riskParamExt.trim();
    }

    public String getCsUrl() {
        return csUrl;
    }

    public void setCsUrl(String csUrl) {
        this.csUrl = csUrl == null ? null : csUrl.trim();
    }

    public String getFundProcessType() {
        return fundProcessType;
    }

    public void setFundProcessType(String fundProcessType) {
        this.fundProcessType = fundProcessType == null ? null : fundProcessType.trim();
    }

    public String getDivideDetail() {
        return divideDetail;
    }

    public void setDivideDetail(String divideDetail) {
        this.divideDetail = divideDetail == null ? null : divideDetail.trim();
    }

    public String getDivideNotifyUrl() {
        return divideNotifyUrl;
    }

    public void setDivideNotifyUrl(String divideNotifyUrl) {
        this.divideNotifyUrl = divideNotifyUrl == null ? null : divideNotifyUrl.trim();
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

    public String getUniqueOrderNo() {
        return uniqueOrderNo;
    }

    public void setUniqueOrderNo(String uniqueOrderNo) {
        this.uniqueOrderNo = uniqueOrderNo == null ? null : uniqueOrderNo.trim();
    }

    public String getToken() {
        return token;
    }

    public void setToken(String token) {
        this.token = token == null ? null : token.trim();
    }
}