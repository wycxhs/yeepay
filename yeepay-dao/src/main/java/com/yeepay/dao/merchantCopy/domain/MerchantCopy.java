package com.yeepay.dao.merchantCopy.domain;

public class MerchantCopy {
    private Integer id;

    private String merchantNo;

    private String merchantNoCopy;

    private String key;

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

    public String getMerchantNoCopy() {
        return merchantNoCopy;
    }

    public void setMerchantNoCopy(String merchantNoCopy) {
        this.merchantNoCopy = merchantNoCopy == null ? null : merchantNoCopy.trim();
    }

    public String getKey() {
        return key;
    }

    public void setKey(String key) {
        this.key = key == null ? null : key.trim();
    }
}