package com.yeepay.dao.bankBranchInfo;

import org.hibernate.validator.constraints.NotEmpty;


public class BankBranchInfoRequest{
    @NotEmpty(message = "headBankCode不能为空")
    private String headBankCode;
    @NotEmpty(message = "provinceCode不能为空")
    private String provinceCode;
    @NotEmpty(message = "cityCode不能为空")
    private String cityCode;

    public String getHeadBankCode() {
        return headBankCode;
    }

    public void setHeadBankCode(String headBankCode) {
        this.headBankCode = headBankCode;
    }

    public String getProvinceCode() {
        return provinceCode;
    }

    public void setProvinceCode(String provinceCode) {
        this.provinceCode = provinceCode;
    }

    public String getCityCode() {
        return cityCode;
    }

    public void setCityCode(String cityCode) {
        this.cityCode = cityCode;
    }
}
