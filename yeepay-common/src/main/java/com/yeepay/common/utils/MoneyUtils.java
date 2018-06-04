package com.yeepay.common.utils;

import java.math.BigDecimal;
import java.text.DecimalFormat;

public class MoneyUtils {

    /**
     * 将金额从元转为分
     *
     * @param amtY String
     * @return
     */
    public static Integer yuanToFen(String amtY) {
        if (amtY == null || "".equals(amtY.trim()) || "0".equals(amtY))
            return 0;
        if (amtY.indexOf(",") != -1) {
            amtY = amtY.replace(",", "");
        }

        amtY = new DecimalFormat("0.00").format(new BigDecimal(amtY));
        int index = amtY.indexOf(".");
        int len = amtY.length();
        StringBuffer amtF = new StringBuffer();
        if (index == -1) {
            amtF.append(amtY).append("00");
        } else if ((len - index) == 1) {
            amtF.append(Long.parseLong(amtY.replace(".", ""))).append("00");
        } else if ((len - index) == 2) {
            amtF.append(Long.parseLong(amtY.replace(".", ""))).append("0");
        } else {
            amtF.append(Long.parseLong(amtY.replace(".", "")));
        }
        return Integer.parseInt(amtF.toString());
    }


    /**
     * 分转换为元
     */
    public static float fenToYuan(String money) {
        int moneyInt = StrUtils.parseInt(money, 0);
        return moneyInt == 0 ? 0 : (float) moneyInt / 100;
    }
}
