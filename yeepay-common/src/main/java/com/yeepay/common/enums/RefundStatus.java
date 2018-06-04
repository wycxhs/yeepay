package com.yeepay.common.enums;

public enum RefundStatus {

    WAIT(1, "处理中"),
    SUCCESS(2, "成功"),
    ERROR(3, "失败"),;

    private int status;
    private String value;

    RefundStatus(int status, String value) {
        this.status = status;
        this.value = value;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

}
