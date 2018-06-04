package com.yeepay.common.exception;

import com.yeepay.common.JsonResult;
import com.yeepay.common.enums.ResultEnums;

public class PayException extends RuntimeException {
    private static final long serialVersionUID = 1L;

    private Integer code;

    public Integer getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public PayException(String message, Throwable cause) {
        super(message, cause);
    }

    public PayException(int code, String message, Throwable cause) {
        super(message, cause);
        this.code = code;
    }

    public PayException(String message) {
        super(message);
    }

    public PayException(int code, String message) {
        super(message);
        this.code = code;
    }


    public PayException(JsonResult jsonResult) {
        super(jsonResult.getMsg());
        this.code = jsonResult.getCode();
    }

    public PayException(ResultEnums resultEnums) {
        super(resultEnums.getMsg());
        this.code = resultEnums.getCode();
    }

    public static PayException newInstance(String message) {
        return new PayException(message);
    }

    public static PayException newInstance(int code, String message) {
        return new PayException(code, message);
    }

    public static PayException newInstance(String message, Throwable cause) {
        return new PayException(message, cause);
    }

    public static PayException newInstance(int code, String message, Throwable cause) {
        return new PayException(code, message, cause);
    }

    public static PayException newInstance(ResultEnums result) {
        return new PayException(result.getCode(), result.getMsg());
    }

    public static PayException newInstance(ResultEnums result, Throwable cause) {
        return new PayException(result.getCode(), result.getMsg(), cause);
    }

}
