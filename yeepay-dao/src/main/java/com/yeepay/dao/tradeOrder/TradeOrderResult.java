package com.yeepay.dao.tradeOrder;

public class TradeOrderResult {
    private String code;

    private String message;

    private String uniqueOrderNo;

    private String token;

    private String parentMerchantNo;

    private String merchantNo;

    private String orderId;

    private String goodsParamExt;

    private String memo;

    private String fundProcessType;

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public String getUniqueOrderNo() {
        return uniqueOrderNo;
    }

    public void setUniqueOrderNo(String uniqueOrderNo) {
        this.uniqueOrderNo = uniqueOrderNo;
    }

    public String getToken() {
        return token;
    }

    public void setToken(String token) {
        this.token = token;
    }

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

    public String getGoodsParamExt() {
        return goodsParamExt;
    }

    public void setGoodsParamExt(String goodsParamExt) {
        this.goodsParamExt = goodsParamExt;
    }

    public String getMemo() {
        return memo;
    }

    public void setMemo(String memo) {
        this.memo = memo;
    }

    public String getFundProcessType() {
        return fundProcessType;
    }

    public void setFundProcessType(String fundProcessType) {
        this.fundProcessType = fundProcessType;
    }
}
