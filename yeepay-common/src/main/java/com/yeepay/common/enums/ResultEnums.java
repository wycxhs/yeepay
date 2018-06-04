package com.yeepay.common.enums;

public enum ResultEnums {
    OK(0, "success"),
    EXCEPTION(500, "SYSTEM EXCEPTION"),
    PROVIDER_EXCEPTION(999, "供应商异常"),

    SIGN_ERROR(1000, "签名异常"),
    PARAMS_IS_NULL(1001, "参数为空"),
    PARAMS_ERROR(1002, "参数异常"),
    NOTIFY_ERROR(1003, "通知异常"),
    DATA_DICT_ERROR(1004, "数据字典异常"),

    MERCHANT_ERROR(1100, "商户信息异常"),
    APP_ERROR(1101, "应用信息异常"),
    USER_ERROR(1102, "用户信息异常"),
    ACCOUNT_ERROR(1103, "账户信息异常"),

    ORDER_EXIST(2000, "订单已存在"),
    ORDER_NOT_FIND(2001, "订单未找到"),
    TRADE_ERROR(2101, "交易订单异常"),

    RECHARGE_ERROR(3001, "充值数据异常"),
    WITHDRAW_ERROR(4001, "提现数据异常"),
    PAY_ERROR(5001, "支付数据异常"),
    REFUND_ERROR(6001, "退款数据异常"),
    BILL_ERROR(7001, "账单数据异常"),
    CLEAR_ERROR(8001, "清算数据异常")
    ;

    private int code;
    private String msg;

    ResultEnums(int code, String msg) {
        this.code = code;
        this.msg = msg;
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

}
