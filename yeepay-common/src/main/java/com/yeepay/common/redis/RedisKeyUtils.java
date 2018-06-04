package com.yeepay.common.redis;


import com.yeepay.common.utils.StrUtils;

public class RedisKeyUtils {

    public static final String PREFIX_GLOBAL = "global:";// 全局变量
    public static final String PREFIX_LOCK = "lock:";// 锁
    public static final String PREFIX_DNS = "sys:dns:";// DNS换成
    public static final String PREFIX_SYS_TMP = "sys:tmp:";// 系统变量
    public static final String PREFIX_SYS_CONFIG = "sys:cfg:";// 系统配置
    public static final String PREFIX_QUEUE = "queue:";// 队列

    public static String genBBWalletTokenKey(String providerId) {
        return StrUtils.concat(providerId, "bb:token:wallet");
    }

    public static String genBBAccountCompanyNotify() {
        return StrUtils.concat(PREFIX_QUEUE, "bb:notify:account:company");
    }

    public static String genBBAccountCompanyNotifyDelay() {
        return StrUtils.concat(PREFIX_QUEUE, "bb:delay:notify:account:company");
    }
}
