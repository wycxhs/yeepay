package com.yeepay.common.utils;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONArray;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.List;
import java.util.Map;

public class JsonUtils {

    private static Logger LOGGER = LoggerFactory.getLogger(JsonUtils.class);

    @SuppressWarnings("unchecked")
    public static Map<String, Object> toMap(String json) {
        return JSON.parseObject(json, Map.class);
    }

    @SuppressWarnings("unchecked")
    public static Map<String, String> toMap(Object object) {
        String json = JSON.toJSONString(object);
        return JSON.parseObject(json, Map.class);
    }

    public static String toJson(Object obj) {
        return JSON.toJSONString(obj);
    }

    public static <T> T toObj(String json, Class<T> zz) {
        try {
            return JSON.parseObject(json, zz);
        } catch (Exception e) {
            e.printStackTrace();
            LOGGER.error("Json解析异常,要生成的对象@{},json为@{}", zz.getSimpleName(), json);
        }
        return null;
    }

    public static <T> List<T> toList(String json, Class<T> zz) {
        return JSONArray.parseArray(json, zz);
    }

}
