package com.yeepay.dao.multiRefundQuery.domain;

public class MultiRefundQuery {
    private Integer id;

    private String merchantNo;

    private String parentMerchantNo;

    private String hmac;

    private String code;

    private String status;

    private String requestDateBegin;

    private String requestDateEnd;

    private String pageNo;

    private String pageSize;

    private String message;

    private String totalRecords;

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

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status == null ? null : status.trim();
    }

    public String getRequestDateBegin() {
        return requestDateBegin;
    }

    public void setRequestDateBegin(String requestDateBegin) {
        this.requestDateBegin = requestDateBegin == null ? null : requestDateBegin.trim();
    }

    public String getRequestDateEnd() {
        return requestDateEnd;
    }

    public void setRequestDateEnd(String requestDateEnd) {
        this.requestDateEnd = requestDateEnd == null ? null : requestDateEnd.trim();
    }

    public String getPageNo() {
        return pageNo;
    }

    public void setPageNo(String pageNo) {
        this.pageNo = pageNo == null ? null : pageNo.trim();
    }

    public String getPageSize() {
        return pageSize;
    }

    public void setPageSize(String pageSize) {
        this.pageSize = pageSize == null ? null : pageSize.trim();
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message == null ? null : message.trim();
    }

    public String getTotalRecords() {
        return totalRecords;
    }

    public void setTotalRecords(String totalRecords) {
        this.totalRecords = totalRecords == null ? null : totalRecords.trim();
    }
}