package com.yeepay.common.utils;

import org.apache.commons.codec.binary.Base64;
import sun.misc.BASE64Decoder;
import sun.misc.BASE64Encoder;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.nio.charset.Charset;

public class Base64Utils {
    private static final Base64 BASE64 = new Base64();
    private static final Charset DEFAULT_CHARSET = Charset.forName("UTF-8");

    public static String encode(String source) {
        new Base64();
        String target = source;
        byte[] bytes = BASE64.encode(target.getBytes(DEFAULT_CHARSET));
        return new String(bytes, DEFAULT_CHARSET);
    }

    public static String decode(String source) {
        byte[] bytes = BASE64.decode(source.getBytes(DEFAULT_CHARSET));
        String target = new String(bytes, DEFAULT_CHARSET);
        return target;
    }

    /**
     * 将文件转成base64 字符串
     *
     * @param path 文件路径
     * @return *
     * @throws Exception
     */
    public static String encodeBase64File(String path) throws Exception {
        File file = new File(path);
        FileInputStream inputFile = new FileInputStream(file);
        byte[] buffer = new byte[(int) file.length()];
        inputFile.read(buffer);
        inputFile.close();
        return new BASE64Encoder().encode(buffer);

    }

    /**
     * 将base64字符解码保存文件
     *
     * @param base64Code
     * @param targetPath
     * @throws Exception
     */
    public static void decoderBase64File(String base64Code, String targetPath) throws Exception {
        byte[] buffer = new BASE64Decoder().decodeBuffer(base64Code);
        FileOutputStream out = new FileOutputStream(targetPath);
        out.write(buffer);
        out.close();
    }

    public static void main(String args[]) {
        try {
            String s = encodeBase64File("C:\\Users\\Administrator\\Desktop\\test.zip");
            System.out.println(s);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}
