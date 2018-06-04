package com.yeepay.dao.hmackeyQuery;

public class HmackeyQueryResult {
    private String returnMsg;

    private String returnCode;

    private String merHmacKey;

    public String getReturnMsg() {
        return returnMsg;
    }

    public void setReturnMsg(String returnMsg) {
        this.returnMsg = returnMsg;
    }

    public String getReturnCode() {
        return returnCode;
    }

    public void setReturnCode(String returnCode) {
        this.returnCode = returnCode;
    }

    public String getMerHmacKey() {
        return merHmacKey;
    }

    public void setMerHmacKey(String merHmacKey) {
        this.merHmacKey = merHmacKey;
    }
}
