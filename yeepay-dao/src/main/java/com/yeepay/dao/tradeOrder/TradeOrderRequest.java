package com.yeepay.dao.tradeOrder;

public class TradeOrderRequest {
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

    public String getParentMerchantNo() {
        return parentMerchantNo;
    }

    public void setParentMerchantNo(String parentMerchantNo) {
        this.parentMerchantNo = parentMerchantNo;
    }

    public String getMerchantNo() {
        return merchantNo;
    }

    public void setMerchantNo(String merchantNo) {
        this.merchantNo = merchantNo;
    }

    public String getOrderId() {
        return orderId;
    }

    public void setOrderId(String orderId) {
        this.orderId = orderId;
    }

    public String getOrderAmount() {
        return orderAmount;
    }

    public void setOrderAmount(String orderAmount) {
        this.orderAmount = orderAmount;
    }

    public String getTimeoutExpress() {
        return timeoutExpress;
    }

    public void setTimeoutExpress(String timeoutExpress) {
        this.timeoutExpress = timeoutExpress;
    }

    public String getRequestDate() {
        return requestDate;
    }

    public void setRequestDate(String requestDate) {
        this.requestDate = requestDate;
    }

    public String getRedirectUrl() {
        return redirectUrl;
    }

    public void setRedirectUrl(String redirectUrl) {
        this.redirectUrl = redirectUrl;
    }

    public String getNotifyUrl() {
        return notifyUrl;
    }

    public void setNotifyUrl(String notifyUrl) {
        this.notifyUrl = notifyUrl;
    }

    public String getGoodsParamExt() {
        return goodsParamExt;
    }

    public void setGoodsParamExt(String goodsParamExt) {
        this.goodsParamExt = goodsParamExt;
    }

    public String getPaymentParamExt() {
        return paymentParamExt;
    }

    public void setPaymentParamExt(String paymentParamExt) {
        this.paymentParamExt = paymentParamExt;
    }

    public String getIndustryParamExt() {
        return industryParamExt;
    }

    public void setIndustryParamExt(String industryParamExt) {
        this.industryParamExt = industryParamExt;
    }

    public String getMemo() {
        return memo;
    }

    public void setMemo(String memo) {
        this.memo = memo;
    }

    public String getRiskParamExt() {
        return riskParamExt;
    }

    public void setRiskParamExt(String riskParamExt) {
        this.riskParamExt = riskParamExt;
    }

    public String getCsUrl() {
        return csUrl;
    }

    public void setCsUrl(String csUrl) {
        this.csUrl = csUrl;
    }

    public String getFundProcessType() {
        return fundProcessType;
    }

    public void setFundProcessType(String fundProcessType) {
        this.fundProcessType = fundProcessType;
    }

    public String getDivideDetail() {
        return divideDetail;
    }

    public void setDivideDetail(String divideDetail) {
        this.divideDetail = divideDetail;
    }

    public String getDivideNotifyUrl() {
        return divideNotifyUrl;
    }

    public void setDivideNotifyUrl(String divideNotifyUrl) {
        this.divideNotifyUrl = divideNotifyUrl;
    }

}
