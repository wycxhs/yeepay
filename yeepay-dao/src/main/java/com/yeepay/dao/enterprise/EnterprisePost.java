package com.yeepay.dao.enterprise;

import org.hibernate.validator.constraints.NotEmpty;

import javax.validation.constraints.Size;
import java.util.Map;

public class EnterprisePost {
    @NotEmpty(message = "requestNo不能为空")
    @Size(max = 64,message = "requestNo数据异常")
    private String requestNo;
    private String parentMerchantNo;
    @NotEmpty(message = "legalName不能为空")
    @Size(max = 128,message = "legalName数据异常")
    private String legalName;
    @NotEmpty(message = "legalIdCard不能为空")
    @Size(max = 128,message = "legalIdCard数据异常")
    private String legalIdCard;
    @NotEmpty(message = "merLegal1No不能为空")
    @Size(max = 32,message = "merLegal1No数据异常")
    private String merLegal1No;
    @NotEmpty(message = "merLegal2No不能为空")
    @Size(max = 32,message = "merLegal2No数据异常")
    private String merLegal2No;
    @NotEmpty(message = "merProvince不能为空")
    @Size(max = 32,message = "merProvince数据异常")
    private String merProvince;
    @NotEmpty(message = "merCity不能为空")
    @Size(max = 32,message = "merCity数据异常")
    private String merCity;
    @NotEmpty(message = "merDistrict不能为空")
    @Size(max = 32,message = "merDistrict数据异常")
    private String merDistrict;
    @NotEmpty(message = "merAddress不能为空")
    @Size(max = 512,message = "merAddress数据异常")
    private String merAddress;
    @NotEmpty(message = "cardNo不能为空")
    @Size(max = 128,message = "cardNo数据异常")
    private String cardNo;
    @NotEmpty(message = "headBankCode不能为空")
    @Size(max = 256,message = "headBankCode数据异常")
    private String headBankCode;
    @NotEmpty(message = "bankCode不能为空")
    @Size(max = 256,message = "bankCode数据异常")
    private String bankCode;
    @NotEmpty(message = "bankProvince不能为空")
    @Size(max = 32,message = "bankProvince数据异常")
    private String bankProvince;
    @NotEmpty(message = "bankCity不能为空")
    @Size(max = 32,message = "bankCity数据异常")
    private String bankCity;
    @NotEmpty(message = "notifyUrl不能为空")
    @Size(max = 128,message = "notifyUrl数据异常")
    private String notifyUrl;
    @NotEmpty(message = "merAuthorizeType不能为空")
    @Size(max = 32,message = "merAuthorizeType数据异常")
    private String merAuthorizeType;
    @NotEmpty(message = "merFullName不能为空")
    @Size(max = 256,message = "merFullName数据异常")
    private String merFullName;
    @NotEmpty(message = "merShortName不能为空")
    @Size(max = 256,message = "merShortName数据异常")
    private String merShortName;
    @NotEmpty(message = "merCertNo不能为空")
    @Size(max = 128,message = "merCertNo数据异常")
    private String merCertNo;
    @NotEmpty(message = "merCertType不能为空")
    @Size(max = 128,message = "merCertType数据异常")
    private String merCertType;
    @NotEmpty(message = "merContactName不能为空")
    @Size(max = 64,message = "merContactName数据异常")
    private String merContactName;
    @NotEmpty(message = "merContactPhone不能为空")
    @Size(max = 128,message = "merContactPhone数据异常")
    private String merContactPhone;
    @NotEmpty(message = "merContactEmail不能为空")
    @Size(max = 128,message = "merContactEmail数据异常")
    private String merContactEmail;
    @Size(max = 256,message = "taxRegistCert数据异常")
    private String taxRegistCert;
    @NotEmpty(message = "accountLicense不能为空")
    @Size(max = 64,message = "accountLicense数据异常")
    private String accountLicense;
    @Size(max = 256,message = "orgCode数据异常")
    private String orgCode;

    private String isOrgCodeLong;

    private String orgCodeExpiry;

    private String oneKeyPayDebit;//一键支付------借记卡的百分比

    private String oneKeyPayCredit;//一键支付贷记卡的百分比,以下省略百分比字段

    private String b2cPay;//网银支付网银B2C

    private String b2bPay;//网银支付网银B2B

    private String wechatAtiveScan;//用户扫码------微信

    private String aliPay;//用户扫码的支付宝

    private String jdAtiveScan;//用户扫码的京东

    private String upopAtiveScan;//银联

    private String weChatId;//公众号支付---商户公众微信号

    private String officialAccAppId;//公众服务号APPID;

    private String recommendOfficialAccAppId;//推荐关注服务号APPID

    private String officialAccAuthorizeDirectory;//支付授权目录

    private String officialAccountPay;//公众号支付的费率百分比

    private String aliPayPid;//生活号支付----支付号PID

    private String zfbShh;//支付百分比;

    private String wechatScan;//商家扫码---微信

    private String aliPayScan;//支付宝

    private String jdPassiveScan;//京东

    private String upopPassiveScan;//银联

    private String weChatH5Low;//钱包H5支付---微信H5标准版

    private String weChatH5;//微信H5专业版

    private String aliPayH5;//支付宝H5

    private String weChatSdk;//钱包SDK支付---微信Sdk

    private String aliPaySdk;//支付宝Sdk

    private String jqbk;//绑卡支付---鉴权绑卡

    private String zfbkjjk;//绑卡支付借记卡

    private String zfbkdjk;//绑卡支付贷记卡

    private String accountPay;//企业账户支付---百分比

    private String remitScenarioAdd;//出款场景补充

    private String rechargeRemit;//充值手续费

    private String remitBankNormal;//付款到银行(普通)

    private String remitBankRealTime;//付款到银行(实时)

    private String remitAllDay;//7*24小时

    private String remitAccountRemit;//付款到账户手续费

    private String remitRjtExpressWorkDay;//加急服务手续费(工作日)

    private String remitRjtExpressWeekDay;//加急服务手续费(非工作日)

    private String firstPartyPercentage;//甲方实际可出款金额=(结算天数外的帐户余额+结算天数内收款额)*（10的整数倍)

    private Map<String,String> fileInfo;

    private String opSettleType;

    private String subAccountType;

    private String subAccountIsOpen;

    private String feeType;

    private String accessType;

    private String tagWeChatUserScan;

    private String tagWeChatMerchantScan;

    private String tagAliPayUserScan;

    private String tagAliPayMerchantScan;

    private String weChatH5Priority;

    private String companyIsGroupDivision;

    private String zrrOneKeyIsOpen;

    private String zrrZfBkIsOpen;

    private String parentMerchantFeeBear;

    private String[] payScenario;

    private String[] remitProduct;

    private String[] withdrawProduct;

    private String[] payProduct;

    private String[] remitScenario;

    private String withdrawWorkDay;

    private String withdrawWeekDay;

    private String withdrawWorkDayFixedRate;

    private String withdrawWorkDayPercentRate;

    private String withdrawWeekDayFixedRate;

    private String withdrawWeekDayPercentRate;

    private String webUrlWeb;

    private String webUrlH5;

    private String icp;

    private String appName;

    private String appDownloadUrl;

    public String getWithdrawWorkDayFixedRate() {
        return withdrawWorkDayFixedRate;
    }

    public void setWithdrawWorkDayFixedRate(String withdrawWorkDayFixedRate) {
        this.withdrawWorkDayFixedRate = withdrawWorkDayFixedRate;
    }

    public String getWithdrawWorkDayPercentRate() {
        return withdrawWorkDayPercentRate;
    }

    public void setWithdrawWorkDayPercentRate(String withdrawWorkDayPercentRate) {
        this.withdrawWorkDayPercentRate = withdrawWorkDayPercentRate;
    }

    public String getWithdrawWeekDayFixedRate() {
        return withdrawWeekDayFixedRate;
    }

    public void setWithdrawWeekDayFixedRate(String withdrawWeekDayFixedRate) {
        this.withdrawWeekDayFixedRate = withdrawWeekDayFixedRate;
    }

    public String getWithdrawWeekDayPercentRate() {
        return withdrawWeekDayPercentRate;
    }

    public void setWithdrawWeekDayPercentRate(String withdrawWeekDayPercentRate) {
        this.withdrawWeekDayPercentRate = withdrawWeekDayPercentRate;
    }

    public String getWebUrlWeb() {
        return webUrlWeb;
    }

    public void setWebUrlWeb(String webUrlWeb) {
        this.webUrlWeb = webUrlWeb;
    }

    public String getWebUrlH5() {
        return webUrlH5;
    }

    public void setWebUrlH5(String webUrlH5) {
        this.webUrlH5 = webUrlH5;
    }

    public String getIcp() {
        return icp;
    }

    public void setIcp(String icp) {
        this.icp = icp;
    }

    public String getAppName() {
        return appName;
    }

    public void setAppName(String appName) {
        this.appName = appName;
    }

    public String getAppDownloadUrl() {
        return appDownloadUrl;
    }

    public void setAppDownloadUrl(String appDownloadUrl) {
        this.appDownloadUrl = appDownloadUrl;
    }

    public String getRequestNo() {
        return requestNo;
    }

    public void setRequestNo(String requestNo) {
        this.requestNo = requestNo;
    }

    public String getParentMerchantNo() {
        return parentMerchantNo;
    }

    public void setParentMerchantNo(String parentMerchantNo) {
        this.parentMerchantNo = parentMerchantNo;
    }

    public String getLegalName() {
        return legalName;
    }

    public void setLegalName(String legalName) {
        this.legalName = legalName;
    }

    public String getLegalIdCard() {
        return legalIdCard;
    }

    public void setLegalIdCard(String legalIdCard) {
        this.legalIdCard = legalIdCard;
    }

    public String getMerLegal1No() {
        return merLegal1No;
    }

    public void setMerLegal1No(String merLegal1No) {
        this.merLegal1No = merLegal1No;
    }

    public String getMerLegal2No() {
        return merLegal2No;
    }

    public void setMerLegal2No(String merLegal2No) {
        this.merLegal2No = merLegal2No;
    }

    public String getMerProvince() {
        return merProvince;
    }

    public void setMerProvince(String merProvince) {
        this.merProvince = merProvince;
    }

    public String getMerCity() {
        return merCity;
    }

    public void setMerCity(String merCity) {
        this.merCity = merCity;
    }

    public String getMerDistrict() {
        return merDistrict;
    }

    public void setMerDistrict(String merDistrict) {
        this.merDistrict = merDistrict;
    }

    public String getMerAddress() {
        return merAddress;
    }

    public void setMerAddress(String merAddress) {
        this.merAddress = merAddress;
    }

    public String getCardNo() {
        return cardNo;
    }

    public void setCardNo(String cardNo) {
        this.cardNo = cardNo;
    }

    public String getHeadBankCode() {
        return headBankCode;
    }

    public void setHeadBankCode(String headBankCode) {
        this.headBankCode = headBankCode;
    }

    public String getBankCode() {
        return bankCode;
    }

    public void setBankCode(String bankCode) {
        this.bankCode = bankCode;
    }

    public String getBankProvince() {
        return bankProvince;
    }

    public void setBankProvince(String bankProvince) {
        this.bankProvince = bankProvince;
    }

    public String getBankCity() {
        return bankCity;
    }

    public void setBankCity(String bankCity) {
        this.bankCity = bankCity;
    }

    public String getNotifyUrl() {
        return notifyUrl;
    }

    public void setNotifyUrl(String notifyUrl) {
        this.notifyUrl = notifyUrl;
    }

    public String getMerAuthorizeType() {
        return merAuthorizeType;
    }

    public void setMerAuthorizeType(String merAuthorizeType) {
        this.merAuthorizeType = merAuthorizeType;
    }

    public String getMerFullName() {
        return merFullName;
    }

    public void setMerFullName(String merFullName) {
        this.merFullName = merFullName;
    }

    public String getMerShortName() {
        return merShortName;
    }

    public void setMerShortName(String merShortName) {
        this.merShortName = merShortName;
    }

    public String getMerCertNo() {
        return merCertNo;
    }

    public void setMerCertNo(String merCertNo) {
        this.merCertNo = merCertNo;
    }

    public String getMerCertType() {
        return merCertType;
    }

    public void setMerCertType(String merCertType) {
        this.merCertType = merCertType;
    }

    public String getMerContactName() {
        return merContactName;
    }

    public void setMerContactName(String merContactName) {
        this.merContactName = merContactName;
    }

    public String getMerContactPhone() {
        return merContactPhone;
    }

    public void setMerContactPhone(String merContactPhone) {
        this.merContactPhone = merContactPhone;
    }

    public String getMerContactEmail() {
        return merContactEmail;
    }

    public void setMerContactEmail(String merContactEmail) {
        this.merContactEmail = merContactEmail;
    }

    public String getTaxRegistCert() {
        return taxRegistCert;
    }

    public void setTaxRegistCert(String taxRegistCert) {
        this.taxRegistCert = taxRegistCert;
    }

    public String getAccountLicense() {
        return accountLicense;
    }

    public void setAccountLicense(String accountLicense) {
        this.accountLicense = accountLicense;
    }

    public String getOrgCode() {
        return orgCode;
    }

    public void setOrgCode(String orgCode) {
        this.orgCode = orgCode;
    }

    public String getIsOrgCodeLong() {
        return isOrgCodeLong;
    }

    public void setIsOrgCodeLong(String isOrgCodeLong) {
        this.isOrgCodeLong = isOrgCodeLong;
    }

    public String getOrgCodeExpiry() {
        return orgCodeExpiry;
    }

    public void setOrgCodeExpiry(String orgCodeExpiry) {
        this.orgCodeExpiry = orgCodeExpiry;
    }

    public String getOneKeyPayDebit() {
        return oneKeyPayDebit;
    }

    public void setOneKeyPayDebit(String oneKeyPayDebit) {
        this.oneKeyPayDebit = oneKeyPayDebit;
    }

    public String getOneKeyPayCredit() {
        return oneKeyPayCredit;
    }

    public void setOneKeyPayCredit(String oneKeyPayCredit) {
        this.oneKeyPayCredit = oneKeyPayCredit;
    }

    public String getB2cPay() {
        return b2cPay;
    }

    public void setB2cPay(String b2cPay) {
        this.b2cPay = b2cPay;
    }

    public String getB2bPay() {
        return b2bPay;
    }

    public void setB2bPay(String b2bPay) {
        this.b2bPay = b2bPay;
    }

    public String getWechatAtiveScan() {
        return wechatAtiveScan;
    }

    public void setWechatAtiveScan(String wechatAtiveScan) {
        this.wechatAtiveScan = wechatAtiveScan;
    }

    public String getAliPay() {
        return aliPay;
    }

    public void setAliPay(String aliPay) {
        this.aliPay = aliPay;
    }

    public String getJdAtiveScan() {
        return jdAtiveScan;
    }

    public void setJdAtiveScan(String jdAtiveScan) {
        this.jdAtiveScan = jdAtiveScan;
    }

    public String getUpopAtiveScan() {
        return upopAtiveScan;
    }

    public void setUpopAtiveScan(String upopAtiveScan) {
        this.upopAtiveScan = upopAtiveScan;
    }

    public String getWeChatId() {
        return weChatId;
    }

    public void setWeChatId(String weChatId) {
        this.weChatId = weChatId;
    }

    public String getOfficialAccAppId() {
        return officialAccAppId;
    }

    public void setOfficialAccAppId(String officialAccAppId) {
        this.officialAccAppId = officialAccAppId;
    }

    public String getRecommendOfficialAccAppId() {
        return recommendOfficialAccAppId;
    }

    public void setRecommendOfficialAccAppId(String recommendOfficialAccAppId) {
        this.recommendOfficialAccAppId = recommendOfficialAccAppId;
    }

    public String getOfficialAccAuthorizeDirectory() {
        return officialAccAuthorizeDirectory;
    }

    public void setOfficialAccAuthorizeDirectory(String officialAccAuthorizeDirectory) {
        this.officialAccAuthorizeDirectory = officialAccAuthorizeDirectory;
    }

    public String getOfficialAccountPay() {
        return officialAccountPay;
    }

    public void setOfficialAccountPay(String officialAccountPay) {
        this.officialAccountPay = officialAccountPay;
    }

    public String getAliPayPid() {
        return aliPayPid;
    }

    public void setAliPayPid(String aliPayPid) {
        this.aliPayPid = aliPayPid;
    }

    public String getZfbShh() {
        return zfbShh;
    }

    public void setZfbShh(String zfbShh) {
        this.zfbShh = zfbShh;
    }

    public String getWechatScan() {
        return wechatScan;
    }

    public void setWechatScan(String wechatScan) {
        this.wechatScan = wechatScan;
    }

    public String getAliPayScan() {
        return aliPayScan;
    }

    public void setAliPayScan(String aliPayScan) {
        this.aliPayScan = aliPayScan;
    }

    public String getJdPassiveScan() {
        return jdPassiveScan;
    }

    public void setJdPassiveScan(String jdPassiveScan) {
        this.jdPassiveScan = jdPassiveScan;
    }

    public String getUpopPassiveScan() {
        return upopPassiveScan;
    }

    public void setUpopPassiveScan(String upopPassiveScan) {
        this.upopPassiveScan = upopPassiveScan;
    }

    public String getWeChatH5Low() {
        return weChatH5Low;
    }

    public void setWeChatH5Low(String weChatH5Low) {
        this.weChatH5Low = weChatH5Low;
    }

    public String getWeChatH5() {
        return weChatH5;
    }

    public void setWeChatH5(String weChatH5) {
        this.weChatH5 = weChatH5;
    }

    public String getAliPayH5() {
        return aliPayH5;
    }

    public void setAliPayH5(String aliPayH5) {
        this.aliPayH5 = aliPayH5;
    }

    public String getWeChatSdk() {
        return weChatSdk;
    }

    public void setWeChatSdk(String weChatSdk) {
        this.weChatSdk = weChatSdk;
    }

    public String getAliPaySdk() {
        return aliPaySdk;
    }

    public void setAliPaySdk(String aliPaySdk) {
        this.aliPaySdk = aliPaySdk;
    }

    public String getJqbk() {
        return jqbk;
    }

    public void setJqbk(String jqbk) {
        this.jqbk = jqbk;
    }

    public String getZfbkjjk() {
        return zfbkjjk;
    }

    public void setZfbkjjk(String zfbkjjk) {
        this.zfbkjjk = zfbkjjk;
    }

    public String getZfbkdjk() {
        return zfbkdjk;
    }

    public void setZfbkdjk(String zfbkdjk) {
        this.zfbkdjk = zfbkdjk;
    }

    public String getAccountPay() {
        return accountPay;
    }

    public void setAccountPay(String accountPay) {
        this.accountPay = accountPay;
    }

    public String getRemitScenarioAdd() {
        return remitScenarioAdd;
    }

    public void setRemitScenarioAdd(String remitScenarioAdd) {
        this.remitScenarioAdd = remitScenarioAdd;
    }

    public String getRechargeRemit() {
        return rechargeRemit;
    }

    public void setRechargeRemit(String rechargeRemit) {
        this.rechargeRemit = rechargeRemit;
    }

    public String getRemitBankNormal() {
        return remitBankNormal;
    }

    public void setRemitBankNormal(String remitBankNormal) {
        this.remitBankNormal = remitBankNormal;
    }

    public String getRemitBankRealTime() {
        return remitBankRealTime;
    }

    public void setRemitBankRealTime(String remitBankRealTime) {
        this.remitBankRealTime = remitBankRealTime;
    }

    public String getRemitAllDay() {
        return remitAllDay;
    }

    public void setRemitAllDay(String remitAllDay) {
        this.remitAllDay = remitAllDay;
    }

    public String getRemitAccountRemit() {
        return remitAccountRemit;
    }

    public void setRemitAccountRemit(String remitAccountRemit) {
        this.remitAccountRemit = remitAccountRemit;
    }

    public String getRemitRjtExpressWorkDay() {
        return remitRjtExpressWorkDay;
    }

    public void setRemitRjtExpressWorkDay(String remitRjtExpressWorkDay) {
        this.remitRjtExpressWorkDay = remitRjtExpressWorkDay;
    }

    public String getRemitRjtExpressWeekDay() {
        return remitRjtExpressWeekDay;
    }

    public void setRemitRjtExpressWeekDay(String remitRjtExpressWeekDay) {
        this.remitRjtExpressWeekDay = remitRjtExpressWeekDay;
    }

    public String getFirstPartyPercentage() {
        return firstPartyPercentage;
    }

    public void setFirstPartyPercentage(String firstPartyPercentage) {
        this.firstPartyPercentage = firstPartyPercentage;
    }


    public Map<String, String> getFileInfo() {
        return fileInfo;
    }

    public void setFileInfo(Map<String, String> fileInfo) {
        this.fileInfo = fileInfo;
    }

    public String getOpSettleType() {
        return opSettleType;
    }

    public void setOpSettleType(String opSettleType) {
        this.opSettleType = opSettleType;
    }

    public String getSubAccountType() {
        return subAccountType;
    }

    public void setSubAccountType(String subAccountType) {
        this.subAccountType = subAccountType;
    }

    public String getSubAccountIsOpen() {
        return subAccountIsOpen;
    }

    public void setSubAccountIsOpen(String subAccountIsOpen) {
        this.subAccountIsOpen = subAccountIsOpen;
    }

    public String getFeeType() {
        return feeType;
    }

    public void setFeeType(String feeType) {
        this.feeType = feeType;
    }

    public String getAccessType() {
        return accessType;
    }

    public void setAccessType(String accessType) {
        this.accessType = accessType;
    }

    public String getTagWeChatUserScan() {
        return tagWeChatUserScan;
    }

    public void setTagWeChatUserScan(String tagWeChatUserScan) {
        this.tagWeChatUserScan = tagWeChatUserScan;
    }

    public String getTagWeChatMerchantScan() {
        return tagWeChatMerchantScan;
    }

    public void setTagWeChatMerchantScan(String tagWeChatMerchantScan) {
        this.tagWeChatMerchantScan = tagWeChatMerchantScan;
    }

    public String getTagAliPayUserScan() {
        return tagAliPayUserScan;
    }

    public void setTagAliPayUserScan(String tagAliPayUserScan) {
        this.tagAliPayUserScan = tagAliPayUserScan;
    }

    public String getTagAliPayMerchantScan() {
        return tagAliPayMerchantScan;
    }

    public void setTagAliPayMerchantScan(String tagAliPayMerchantScan) {
        this.tagAliPayMerchantScan = tagAliPayMerchantScan;
    }

    public String getWeChatH5Priority() {
        return weChatH5Priority;
    }

    public void setWeChatH5Priority(String weChatH5Priority) {
        this.weChatH5Priority = weChatH5Priority;
    }

    public String getCompanyIsGroupDivision() {
        return companyIsGroupDivision;
    }

    public void setCompanyIsGroupDivision(String companyIsGroupDivision) {
        this.companyIsGroupDivision = companyIsGroupDivision;
    }

    public String getZrrOneKeyIsOpen() {
        return zrrOneKeyIsOpen;
    }

    public void setZrrOneKeyIsOpen(String zrrOneKeyIsOpen) {
        this.zrrOneKeyIsOpen = zrrOneKeyIsOpen;
    }

    public String getZrrZfBkIsOpen() {
        return zrrZfBkIsOpen;
    }

    public void setZrrZfBkIsOpen(String zrrZfBkIsOpen) {
        this.zrrZfBkIsOpen = zrrZfBkIsOpen;
    }

    public String getParentMerchantFeeBear() {
        return parentMerchantFeeBear;
    }

    public void setParentMerchantFeeBear(String parentMerchantFeeBear) {
        this.parentMerchantFeeBear = parentMerchantFeeBear;
    }

    public String getWithdrawWorkDay() {
        return withdrawWorkDay;
    }

    public void setWithdrawWorkDay(String withdrawWorkDay) {
        this.withdrawWorkDay = withdrawWorkDay;
    }

    public String getWithdrawWeekDay() {
        return withdrawWeekDay;
    }

    public void setWithdrawWeekDay(String withdrawWeekDay) {
        this.withdrawWeekDay = withdrawWeekDay;
    }

    public String[] getPayScenario() {
        return payScenario;
    }

    public void setPayScenario(String[] payScenario) {
        this.payScenario = payScenario;
    }

    public String[] getRemitProduct() {
        return remitProduct;
    }

    public void setRemitProduct(String[] remitProduct) {
        this.remitProduct = remitProduct;
    }

    public String[] getWithdrawProduct() {
        return withdrawProduct;
    }

    public void setWithdrawProduct(String[] withdrawProduct) {
        this.withdrawProduct = withdrawProduct;
    }

    public String[] getPayProduct() {
        return payProduct;
    }

    public void setPayProduct(String[] payProduct) {
        this.payProduct = payProduct;
    }

    public String[] getRemitScenario() {
        return remitScenario;
    }

    public void setRemitScenario(String[] remitScenario) {
        this.remitScenario = remitScenario;
    }
}
