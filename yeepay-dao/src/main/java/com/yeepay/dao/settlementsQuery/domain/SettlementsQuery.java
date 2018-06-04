package com.yeepay.dao.settlementsQuery.domain;

public class SettlementsQuery {
    private Integer id;

    private String merchantNo;

    private String parentMerchantNo;

    private String hmac;

    private String code;

    private String message;

    private String startSettleDate;

    private String endSettleDate;

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

    public String getStartSettleDate() {
        return startSettleDate;
    }

    public void setStartSettleDate(String startSettleDate) {
        this.startSettleDate = startSettleDate == null ? null : startSettleDate.trim();
    }

    public String getEndSettleDate() {
        return endSettleDate;
    }

    public void setEndSettleDate(String endSettleDate) {
        this.endSettleDate = endSettleDate == null ? null : endSettleDate.trim();
    }
}