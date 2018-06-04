package com.yeepay.service.encrypt;

import com.yeepay.common.swith.MD5Utils;

import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.SortedMap;

public class Encrypt {
    public static String createSign(SortedMap<Object,Object> parameters, String key){
        StringBuffer sbkey = new StringBuffer();
        Set es = parameters.entrySet();
        Iterator iterator = es.iterator();
        while(iterator.hasNext()){
            Map.Entry entry = (Map.Entry) iterator.next();
            String k = (String) entry.getKey();
            Object v = entry.getValue();
            sbkey.append(k + "=" + v + "&");
        }
        String s = sbkey.substring(0,sbkey.length()-1);
        String signFrist = MD5Utils.encode(s).toUpperCase();
        signFrist = signFrist + key;
        String signSecond = MD5Utils.encode(signFrist).toUpperCase();
        return signSecond;
    }

    public static String createSign(SortedMap<Object,Object> parameters){
        StringBuffer sbkey = new StringBuffer();
        Set es = parameters.entrySet();
        Iterator iterator = es.iterator();
        while(iterator.hasNext()){
            Map.Entry entry = (Map.Entry) iterator.next();
            String k = (String) entry.getKey();
            Object v = entry.getValue();
            sbkey.append(k + "=" + v + "&");
        }
        String s = sbkey.substring(0,sbkey.length()-1);
        String signFrist = MD5Utils.encode(s).toUpperCase();
        return signFrist;
    }
}
