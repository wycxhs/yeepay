package com.yeepay.common;

import com.alibaba.fastjson.JSON;
import com.yeepay.common.enums.ResultEnums;
import com.yeepay.common.exception.PayException;
import com.yeepay.common.utils.DateUtils;

public class JsonResult {
    private int code;
    private String msg;
    private Object data;
    private String timestamp;

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

    public Object getData() {
        return data;
    }

    public void setData(Object data) {
        this.data = data;
    }

    public String getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(String timestamp) {
        this.timestamp = timestamp;
    }

    public static final String setReturnStr(final int code, final String msg) {
        JsonResult jsonResult = JsonResult.setReturn(code, msg);
        return JSON.toJSONString(jsonResult);
    }

    public static final String setReturnStr(JsonResult jsonResult) {
        return JSON.toJSONString(jsonResult);
    }

    public static final String setReturnStr(ResultEnums sysReturn) {
        JsonResult jsonResult = JsonResult.setReturn(sysReturn);
        return JSON.toJSONString(jsonResult);
    }

    public static final String setReturnStr(ResultEnums sysReturn, final Object obj) {
        JsonResult jsonResult = JsonResult.setReturn(sysReturn, obj);
        return JSON.toJSONString(jsonResult);
    }

    public static final String setReturnStr(ResultEnums sysReturn, final String msg) {
        JsonResult jsonResult = JsonResult.setReturn(sysReturn.getCode(), msg);
        return JSON.toJSONString(jsonResult);
    }

    public static final String setReturnStr(final int code, final String msg, final Object obj) {
        JsonResult jsonResult = JsonResult.setReturn(code, msg, obj);
        return JSON.toJSONString(jsonResult);
    }

    public static final JsonResult setReturn(final int code, final String msg) {
        JsonResult ret = new JsonResult();
        ret.setCode(code);
        ret.setMsg(msg);
        ret.setTimestamp(DateUtils.currTimestampS() + "");
        return ret;
    }

    public static final JsonResult setReturn(final int code, final String msg, final Object data) {
        JsonResult ret = new JsonResult();
        ret.setCode(code);
        ret.setMsg(msg);
        ret.setData(data);
        ret.setTimestamp(DateUtils.currTimestampS() + "");
        return ret;
    }

    public static final JsonResult setReturn(ResultEnums sysReturn) {
        JsonResult ret = new JsonResult();
        ret.setCode(sysReturn.getCode());
        ret.setMsg(sysReturn.getMsg());
        ret.setTimestamp(DateUtils.currTimestampS() + "");
        return ret;
    }

    public static final JsonResult setReturn(PayException e) {
        JsonResult ret = new JsonResult();
        ret.setCode(e.getCode());
        ret.setMsg(e.getMessage());
        ret.setTimestamp(DateUtils.currTimestampS() + "");
        return ret;
    }

    public static final JsonResult setReturn(ResultEnums sysReturn, Object data) {
        JsonResult ret = new JsonResult();
        ret.setCode(sysReturn.getCode());
        ret.setMsg(sysReturn.getMsg());
        ret.setData(data);
        ret.setTimestamp(DateUtils.currTimestampS() + "");
        return ret;
    }

}
