package com.yeepay.dao.tradeOrder;

import org.hibernate.validator.constraints.NotEmpty;

import javax.validation.constraints.Size;

public class TradeOrderPost {
    @NotEmpty(message = "merchantNo不能为空")
    @Size(max = 64,message = "merchantNo数据异常")
    private String merchantNo;
    @NotEmpty(message = "orderId不能为空")
    @Size(max = 64,message = "orderId数据异常")
    private String orderId;
    @NotEmpty(message = "orderAmount不能为空")
    @Size(max = 10,message = "orderAmount数据异常")
    private String orderAmount;
    @Size(max = 4,message = "timeoutExpress数据异常")
    private String timeoutExpress;
    @Size(max = 20,message = "requestDate数据异常")
    private String requestDate;
    @Size(max = 200,message = "redirectUrl数据异常")
    private String redirectUrl;
    @NotEmpty(message = "notifyUrl不能为空")
    @Size(max = 200,message = "notifyUrl数据异常")
    private String notifyUrl;
    @NotEmpty(message = "goodsName不能为空")
    private String goodsName;
    private String goodsDesc;
    @Size(max = 200,message = "paymentParamExt数据异常")
    private String paymentParamExt;
    @Size(max = 512,message = "industryParamExt数据异常")
    private String industryParamExt;
    @Size(max = 32,message = "memo数据异常")
    private String memo;
    @Size(max = 512,message = "riskParamExt数据异常")
    private String riskParamExt;
    @Size(max = 200,message = "csUrl数据异常")
    private String csUrl;
    @Size(max = 512,message = "fundProcessType数据异常")
    private String fundProcessType;
    @Size(max = 200,message = "divideNotifyUrl数据异常")
    private String divideNotifyUrl;

    private String hmac;

    public String getHmac() {
        return hmac;
    }

    public void setHmac(String hmac) {
        this.hmac = hmac;
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

    public String getGoodsName() {
        return goodsName;
    }

    public void setGoodsName(String goodsName) {
        this.goodsName = goodsName;
    }

    public String getGoodsDesc() {
        return goodsDesc;
    }

    public void setGoodsDesc(String goodsDesc) {
        this.goodsDesc = goodsDesc;
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

    public String getDivideNotifyUrl() {
        return divideNotifyUrl;
    }

    public void setDivideNotifyUrl(String divideNotifyUrl) {
        this.divideNotifyUrl = divideNotifyUrl;
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
}
