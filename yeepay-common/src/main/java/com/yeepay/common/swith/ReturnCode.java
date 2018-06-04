package com.yeepay.common.swith;

import org.springframework.stereotype.Component;

@Component
public class ReturnCode {
    public String code(String returnCode) {
        switch (returnCode) {
            case "REG00000":
                return "请求成功";
            case "REG30001":
                return "系统未知异常";
            case "REG30002":
                return "必填参数异常";
            case "REG30003":
                return "参数验证失败";
            case "REG30006":
                return "信息不允许修改";
            case "REG30007":
                return "必传资质不齐全";
            case "REG30101":
                return "入网基本信息不存在";
            case "REG30102":
                return "资质信息不存在";
            case "REG30103":
                return "结算信息不存在";
            case "REG30104":
                return "发票信息不存在";
            case "REG30105":
                return "产品信息不存在";
            case "REG30106":
                return "商户协议不存在";
            case "REG30201":
                return "银行卡认证异常";
            case "REG30202":
                return "企业认证异常";
            case "REG30203":
                return "个人认证异常";
            case "REG30204":
                return "手机认证异常";
            case "REG30401":
                return "商户属于黑名单";
            case "REG30402":
                return "商户名称存在敏感信息";
            case "REG30403":
                return "验证客户的商户入网数量超限";
            case "REG30404":
                return "商户联系人手机号存在";
            case "REG30405":
                return "商户联系人邮箱存在";
            case "REG30408":
                return "商户注册登录名重复";
            case "REG30409":
                return "商户注册失败";
            case "REG30410":
                return "商户注册商户创建异常";
            case "REG30411":
                return "获取银行支行信息异常";
            case "REG30412":
                return "获取银行支行信息不存在";
            default:
                return "returnCode无法识别";
        }
    }
}
