package com.yeepay.common.utils;

import javax.crypto.Mac;
import javax.crypto.spec.SecretKeySpec;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;

/**
 * Created by liushanping on 2017/7/25.
 */
public class Md5Utils {


    private static final char[] hexChars = new char[]{'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'};

    public static String encoderHmacSha256(String data, String key) {
        try {
            byte[] dataByte = data.getBytes();
            byte[] keyByte = key.getBytes();

            SecretKeySpec signingKey = new SecretKeySpec(keyByte, "HmacSHA256");
            Mac mac = Mac.getInstance("HmacSHA256");
            mac.init(signingKey);
            return byte2hex(mac.doFinal(dataByte));
        } catch (NoSuchAlgorithmException ex) {
            ex.printStackTrace();
        } catch (InvalidKeyException ex) {
            ex.printStackTrace();
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        return "";
    }

    public static String byte2hex(byte[] b) {
        return byte2hex(b, '\u0000');
    }

    public static String byte2hex(byte[] b, char delimeter) {
        StringBuffer sb = new StringBuffer();

        for(int n = 0; n < b.length; ++n) {
            byte2hex(b[n], sb);
            if(n < b.length - 1 && delimeter != 0) {
                sb.append(delimeter);
            }
        }

        return sb.toString().toLowerCase();
    }

    private static void byte2hex(byte b, StringBuffer buf) {
        int high = (b & 240) >> 4;
        int low = b & 15;
        buf.append(hexChars[high]);
        buf.append(hexChars[low]);
    }
}
