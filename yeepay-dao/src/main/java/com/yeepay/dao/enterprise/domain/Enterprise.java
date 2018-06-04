package com.yeepay.dao.enterprise.domain;

public class Enterprise {
    private Integer id;

    private String requestNo;

    private String parentMerchantNo;

    private String legalName;

    private String legalIdCard;

    private String merLegal1No;

    private String merLegal2No;

    private String merProvince;

    private String merCity;

    private String merDistrict;

    private String merAddress;

    private String cardNo;

    private String headBankCode;

    private String bankCode;

    private String bankProvince;

    private String bankCity;

    private String productInfo;

    private String fileInfo;

    private String businessFunction;

    private String notifyUrl;

    private String merAuthorizeType;

    private String returnCode;

    private String returnMsg;

    private String merchantNo;

    private String externalId;

    private String merFullName;

    private String merShortName;

    private String merCertNo;

    private String merCertType;

    private String merContactName;

    private String merContactPhone;

    private String merContactEmail;

    private String taxRegistCert;

    private String accountLicense;

    private String orgCode;

    private String isOrgCodeLong;

    private String orgCodeExpiry;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getRequestNo() {
        return requestNo;
    }

    public void setRequestNo(String requestNo) {
        this.requestNo = requestNo == null ? null : requestNo.trim();
    }

    public String getParentMerchantNo() {
        return parentMerchantNo;
    }

    public void setParentMerchantNo(String parentMerchantNo) {
        this.parentMerchantNo = parentMerchantNo == null ? null : parentMerchantNo.trim();
    }

    public String getLegalName() {
        return legalName;
    }

    public void setLegalName(String legalName) {
        this.legalName = legalName == null ? null : legalName.trim();
    }

    public String getLegalIdCard() {
        return legalIdCard;
    }

    public void setLegalIdCard(String legalIdCard) {
        this.legalIdCard = legalIdCard == null ? null : legalIdCard.trim();
    }

    public String getMerLegal1No() {
        return merLegal1No;
    }

    public void setMerLegal1No(String merLegal1No) {
        this.merLegal1No = merLegal1No == null ? null : merLegal1No.trim();
    }

    public String getMerLegal2No() {
        return merLegal2No;
    }

    public void setMerLegal2No(String merLegal2No) {
        this.merLegal2No = merLegal2No == null ? null : merLegal2No.trim();
    }

    public String getMerProvince() {
        return merProvince;
    }

    public void setMerProvince(String merProvince) {
        this.merProvince = merProvince == null ? null : merProvince.trim();
    }

    public String getMerCity() {
        return merCity;
    }

    public void setMerCity(String merCity) {
        this.merCity = merCity == null ? null : merCity.trim();
    }

    public String getMerDistrict() {
        return merDistrict;
    }

    public void setMerDistrict(String merDistrict) {
        this.merDistrict = merDistrict == null ? null : merDistrict.trim();
    }

    public String getMerAddress() {
        return merAddress;
    }

    public void setMerAddress(String merAddress) {
        this.merAddress = merAddress == null ? null : merAddress.trim();
    }

    public String getCardNo() {
        return cardNo;
    }

    public void setCardNo(String cardNo) {
        this.cardNo = cardNo == null ? null : cardNo.trim();
    }

    public String getHeadBankCode() {
        return headBankCode;
    }

    public void setHeadBankCode(String headBankCode) {
        this.headBankCode = headBankCode == null ? null : headBankCode.trim();
    }

    public String getBankCode() {
        return bankCode;
    }

    public void setBankCode(String bankCode) {
        this.bankCode = bankCode == null ? null : bankCode.trim();
    }

    public String getBankProvince() {
        return bankProvince;
    }

    public void setBankProvince(String bankProvince) {
        this.bankProvince = bankProvince == null ? null : bankProvince.trim();
    }

    public String getBankCity() {
        return bankCity;
    }

    public void setBankCity(String bankCity) {
        this.bankCity = bankCity == null ? null : bankCity.trim();
    }

    public String getProductInfo() {
        return productInfo;
    }

    public void setProductInfo(String productInfo) {
        this.productInfo = productInfo == null ? null : productInfo.trim();
    }

    public String getFileInfo() {
        return fileInfo;
    }

    public void setFileInfo(String fileInfo) {
        this.fileInfo = fileInfo == null ? null : fileInfo.trim();
    }

    public String getBusinessFunction() {
        return businessFunction;
    }

    public void setBusinessFunction(String businessFunction) {
        this.businessFunction = businessFunction == null ? null : businessFunction.trim();
    }

    public String getNotifyUrl() {
        return notifyUrl;
    }

    public void setNotifyUrl(String notifyUrl) {
        this.notifyUrl = notifyUrl == null ? null : notifyUrl.trim();
    }

    public String getMerAuthorizeType() {
        return merAuthorizeType;
    }

    public void setMerAuthorizeType(String merAuthorizeType) {
        this.merAuthorizeType = merAuthorizeType == null ? null : merAuthorizeType.trim();
    }

    public String getReturnCode() {
        return returnCode;
    }

    public void setReturnCode(String returnCode) {
        this.returnCode = returnCode == null ? null : returnCode.trim();
    }

    public String getReturnMsg() {
        return returnMsg;
    }

    public void setReturnMsg(String returnMsg) {
        this.returnMsg = returnMsg == null ? null : returnMsg.trim();
    }

    public String getMerchantNo() {
        return merchantNo;
    }

    public void setMerchantNo(String merchantNo) {
        this.merchantNo = merchantNo == null ? null : merchantNo.trim();
    }

    public String getExternalId() {
        return externalId;
    }

    public void setExternalId(String externalId) {
        this.externalId = externalId == null ? null : externalId.trim();
    }

    public String getMerFullName() {
        return merFullName;
    }

    public void setMerFullName(String merFullName) {
        this.merFullName = merFullName == null ? null : merFullName.trim();
    }

    public String getMerShortName() {
        return merShortName;
    }

    public void setMerShortName(String merShortName) {
        this.merShortName = merShortName == null ? null : merShortName.trim();
    }

    public String getMerCertNo() {
        return merCertNo;
    }

    public void setMerCertNo(String merCertNo) {
        this.merCertNo = merCertNo == null ? null : merCertNo.trim();
    }

    public String getMerCertType() {
        return merCertType;
    }

    public void setMerCertType(String merCertType) {
        this.merCertType = merCertType == null ? null : merCertType.trim();
    }

    public String getMerContactName() {
        return merContactName;
    }

    public void setMerContactName(String merContactName) {
        this.merContactName = merContactName == null ? null : merContactName.trim();
    }

    public String getMerContactPhone() {
        return merContactPhone;
    }

    public void setMerContactPhone(String merContactPhone) {
        this.merContactPhone = merContactPhone == null ? null : merContactPhone.trim();
    }

    public String getMerContactEmail() {
        return merContactEmail;
    }

    public void setMerContactEmail(String merContactEmail) {
        this.merContactEmail = merContactEmail == null ? null : merContactEmail.trim();
    }

    public String getTaxRegistCert() {
        return taxRegistCert;
    }

    public void setTaxRegistCert(String taxRegistCert) {
        this.taxRegistCert = taxRegistCert == null ? null : taxRegistCert.trim();
    }

    public String getAccountLicense() {
        return accountLicense;
    }

    public void setAccountLicense(String accountLicense) {
        this.accountLicense = accountLicense == null ? null : accountLicense.trim();
    }

    public String getOrgCode() {
        return orgCode;
    }

    public void setOrgCode(String orgCode) {
        this.orgCode = orgCode == null ? null : orgCode.trim();
    }

    public String getIsOrgCodeLong() {
        return isOrgCodeLong;
    }

    public void setIsOrgCodeLong(String isOrgCodeLong) {
        this.isOrgCodeLong = isOrgCodeLong == null ? null : isOrgCodeLong.trim();
    }

    public String getOrgCodeExpiry() {
        return orgCodeExpiry;
    }

    public void setOrgCodeExpiry(String orgCodeExpiry) {
        this.orgCodeExpiry = orgCodeExpiry == null ? null : orgCodeExpiry.trim();
    }
}