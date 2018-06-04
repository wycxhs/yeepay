package com.yeepay.service.createProductInfo;

import com.yeepay.dao.individual.IndividualPost;
import org.springframework.stereotype.Service;

import java.util.*;

@Service
public class CreateIndividualBusinessFunction {
    public String createIndividualBusinessFunction(IndividualPost post) {
        String OP_SETTLE_TYPE = format(post.getOpSettleType());
        String SUBACCOUNT_TYPE = format(post.getSubAccountType());
        String SUBACCOUNT_IS_OPENED = format(post.getSubAccountIsOpen());
        String FEE_TYPE = format(post.getFeeType());
        String ACCESS_TYPE = format(post.getAccessType());
        String TAG_WECHAT_USER_SCAN = format(post.getTagWeChatUserScan());
        String TAG_WECHAT_MERCHANT_SCAN = format(post.getTagWeChatMerchantScan());
        String TAG_ALIPAY_USER_SCAN = format(post.getTagAliPayUserScan());
        String TAG_ALIPAY_MERCHANT_SCAN = format(post.getTagAliPayMerchantScan());
        String WECHAT_H5_PRIORITY = format(post.getWeChatH5Priority());
        String COMPANY_IS_GROUP_DIVISION = format(post.getCompanyIsGroupDivision());
        String ZRR_ONE_KEY_IS_OPEN = format(post.getZrrOneKeyIsOpen());
        String ZRR_ZF_BK_IS_OPEN = format(post.getZrrZfBkIsOpen());
        String PARENT_MERCHANT_FEE_BEAR = format(post.getParentMerchantFeeBear());

        Map<String, String> map = new HashMap<String, String>();
        map.put("OP_SETTLE_TYPE", OP_SETTLE_TYPE);
        map.put("SUBACCOUNT_TYPE", SUBACCOUNT_TYPE);
        map.put("SUBACCOUNT_IS_OPENED", SUBACCOUNT_IS_OPENED);
        map.put("FEE_TYPE", FEE_TYPE);
        map.put("ACCESS_TYPE", ACCESS_TYPE);
        map.put("TAG_WECHAT_USER_SCAN", TAG_WECHAT_USER_SCAN);
        map.put("TAG_WECHAT_MERCHANT_SCAN", TAG_WECHAT_MERCHANT_SCAN);
        map.put("TAG_ALIPAY_USER_SCAN", TAG_ALIPAY_USER_SCAN);
        map.put("TAG_ALIPAY_MERCHANT_SCAN", TAG_ALIPAY_MERCHANT_SCAN);
        map.put("WECHAT_H5_PRIORITY", WECHAT_H5_PRIORITY);
        map.put("COMPANY_IS_GROUP_DIVISION",COMPANY_IS_GROUP_DIVISION);
        map.put("ZRR_ONE_KEY_IS_OPEN",ZRR_ONE_KEY_IS_OPEN);
        map.put("ZRR_ZF_BK_IS_OPEN",ZRR_ZF_BK_IS_OPEN);
        map.put("PARENT_MERCHANT_FEE_BEAR",PARENT_MERCHANT_FEE_BEAR);
        removeNullEntry(map);
        String businessFunctionJson = businessfunstr(map);
        return businessFunctionJson;
    }

    /*移除Map中值为空的键值对*/
    public static void removeNullEntry(Map map) {
        removeNullKey(map);
        removeNullValue(map);
    }
    /*移除键为空的键值对*/
    public static void removeNullKey(Map map) {
        Set set = map.keySet();
        for (Iterator iterator = set.iterator(); iterator.hasNext(); ) {
            Object obj = (Object) iterator.next();
            remove(obj, iterator);
        }
    }
    /*移除值为空的键值对*/
    public static void removeNullValue(Map map) {
        Set set = map.keySet();
        for (Iterator iterator = set.iterator(); iterator.hasNext(); ) {
            Object obj = (Object) iterator.next();
            Object value = (Object) map.get(obj);
            remove(value, iterator);
        }
    }
    private static void remove(Object obj, Iterator iterator) {
        if (obj instanceof String) {
            String str = (String) obj;
            if (str == null || str.trim().isEmpty()) {
                iterator.remove();
            }
        } else if (obj instanceof Collection) {
            Collection col = (Collection) obj;
            if (col == null || col.isEmpty()) {
                iterator.remove();
            }

        } else if (obj instanceof Map) {
            Map temp = (Map) obj;
            if (temp == null || temp.isEmpty()) {
                iterator.remove();
            }

        } else if (obj instanceof Object[]) {
            Object[] array = (Object[]) obj;
            if (array == null || array.length <= 0) {
                iterator.remove();
            }
        } else {
            if (obj == null) {
                iterator.remove();
            }
        }
    }


    public static String businessfunstr(Map<String,String> map){
        StringBuffer sb=new StringBuffer();
        sb.append("{");
        for(Map.Entry<String, String>  s:map.entrySet()){
            sb.append("\"");
            if(s.getKey().length()!=0||s.getValue()!=null){

                sb.append(s.getKey()).
                        append("\":[\"").
                        append(s.getValue()).append("\"],");
            }else{
                continue;
            }
        }
        sb.replace(sb.length()-1, sb.length(), "");
        sb.append("}");
        System.out.println("sb:"+sb.toString());
        return sb.toString();

    }


    public static String businessfunstr2(Map<String,String> map){
        StringBuffer sb=new StringBuffer();
        sb.append("{");
        for(Map.Entry<String, String>  s:map.entrySet()){
            sb.append("\"");
//
            sb.append(s.getKey()).
                    append("\":[\"").
                    append(s.getValue()).append("\"],");

        }
        sb.replace(sb.length()-1, sb.length(), "");
        sb.append("}");
        System.out.println("sb:"+sb.toString());
        return sb.toString();

    }



    public String format(String s){
        return s==null?"":s.trim();
    }

}


