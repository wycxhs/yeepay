package com.yeepay.service.createProductInfo;

import java.util.Iterator;
import java.util.Map;

public class CreateFileInfo {
    public static String createFileInfo(Map<String,String> fileInfo){
        StringBuffer sb = new StringBuffer();
        Iterator iterator = fileInfo.entrySet().iterator();
        while (iterator.hasNext()){
            Map.Entry entry = (Map.Entry) iterator.next();
            String key = (String) entry.getKey();
            String value = (String) entry.getValue();
            sb.append("{");
            sb.append("\"quaType\":\""+key+"\",\"quaUrl\":\""+value+"\"");
            sb.append("},");
        }
        sb.replace(sb.length()-1, sb.length(), "");
        sb.append("]");
        return sb.toString();
    }
}
