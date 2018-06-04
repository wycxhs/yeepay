package com.yeepay.dao.apiPay.domain;

public class ApiPay {
    private Integer id;

    private String token;

    private String payTool;

    private String payType;

    private String userNo;

    private String userType;

    private String appId;

    private String openId;

    private String payEmpowerNo;

    private String merchantTerminalId;

    private String merchantStoreNo;

    private String userIp;

    private String version;

    private String code;

    private String message;

    private String merchantNo;

    private String resultType;

    private String resultData;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getToken() {
        return token;
    }

    public void setToken(String token) {
        this.token = token == null ? null : token.trim();
    }

    public String getPayTool() {
        return payTool;
    }

    public void setPayTool(String payTool) {
        this.payTool = payTool == null ? null : payTool.trim();
    }

    public String getPayType() {
        return payType;
    }

    public void setPayType(String payType) {
        this.payType = payType == null ? null : payType.trim();
    }

    public String getUserNo() {
        return userNo;
    }

    public void setUserNo(String userNo) {
        this.userNo = userNo == null ? null : userNo.trim();
    }

    public String getUserType() {
        return userType;
    }

    public void setUserType(String userType) {
        this.userType = userType == null ? null : userType.trim();
    }

    public String getAppId() {
        return appId;
    }

    public void setAppId(String appId) {
        this.appId = appId == null ? null : appId.trim();
    }

    public String getOpenId() {
        return openId;
    }

    public void setOpenId(String openId) {
        this.openId = openId == null ? null : openId.trim();
    }

    public String getPayEmpowerNo() {
        return payEmpowerNo;
    }

    public void setPayEmpowerNo(String payEmpowerNo) {
        this.payEmpowerNo = payEmpowerNo == null ? null : payEmpowerNo.trim();
    }

    public String getMerchantTerminalId() {
        return merchantTerminalId;
    }

    public void setMerchantTerminalId(String merchantTerminalId) {
        this.merchantTerminalId = merchantTerminalId == null ? null : merchantTerminalId.trim();
    }

    public String getMerchantStoreNo() {
        return merchantStoreNo;
    }

    public void setMerchantStoreNo(String merchantStoreNo) {
        this.merchantStoreNo = merchantStoreNo == null ? null : merchantStoreNo.trim();
    }

    public String getUserIp() {
        return userIp;
    }

    public void setUserIp(String userIp) {
        this.userIp = userIp == null ? null : userIp.trim();
    }

    public String getVersion() {
        return version;
    }

    public void setVersion(String version) {
        this.version = version == null ? null : version.trim();
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

    public String getMerchantNo() {
        return merchantNo;
    }

    public void setMerchantNo(String merchantNo) {
        this.merchantNo = merchantNo == null ? null : merchantNo.trim();
    }

    public String getResultType() {
        return resultType;
    }

    public void setResultType(String resultType) {
        this.resultType = resultType == null ? null : resultType.trim();
    }

    public String getResultData() {
        return resultData;
    }

    public void setResultData(String resultData) {
        this.resultData = resultData == null ? null : resultData.trim();
    }
}