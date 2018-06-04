package com.yeepay.dao.merProductFeeUpdate;

import org.hibernate.validator.constraints.NotEmpty;

import javax.validation.constraints.Size;

public class MerProductFeeUpdateRequest {

    private String parentMerchantNo;
    @NotEmpty(message = "merchantNo不能为空")
    @Size(max = 64,message = "merchantNo数据异常")
    private String merchantNo;
    @NotEmpty(message = "requestNo不能为空")
    @Size(max = 64,message = "requestNo数据异常")
    private String requestNo;
    @NotEmpty(message = "payProductMap不能为空")
    @Size(max = 128,message = "payProductMap数据异常")
    private String payProductMap;

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

    public String getRequestNo() {
        return requestNo;
    }

    public void setRequestNo(String requestNo) {
        this.requestNo = requestNo;
    }

    public String getPayProductMap() {
        return payProductMap;
    }

    public void setPayProductMap(String payProductMap) {
        this.payProductMap = payProductMap;
    }
}
