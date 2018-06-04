package com.yeepay.dao.bankBranchInfo.domain;

public class BankBranchInfo {
    private Integer id;

    private String headBankCode;

    private String provinceCode;

    private String cityCode;

    private String branchBankInfo;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getHeadBankCode() {
        return headBankCode;
    }

    public void setHeadBankCode(String headBankCode) {
        this.headBankCode = headBankCode == null ? null : headBankCode.trim();
    }

    public String getProvinceCode() {
        return provinceCode;
    }

    public void setProvinceCode(String provinceCode) {
        this.provinceCode = provinceCode == null ? null : provinceCode.trim();
    }

    public String getCityCode() {
        return cityCode;
    }

    public void setCityCode(String cityCode) {
        this.cityCode = cityCode == null ? null : cityCode.trim();
    }

    public String getBranchBankInfo() {
        return branchBankInfo;
    }

    public void setBranchBankInfo(String branchBankInfo) {
        this.branchBankInfo = branchBankInfo == null ? null : branchBankInfo.trim();
    }
}