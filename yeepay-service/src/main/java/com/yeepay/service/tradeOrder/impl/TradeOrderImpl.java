package com.yeepay.service.tradeOrder.impl;

import com.yeepay.common.config.CommonConfig;
import com.yeepay.common.swith.ReturnCode;
import com.yeepay.common.utils.JsonUtils;
import com.yeepay.dao.dealResult.DealResultFalse;
import com.yeepay.dao.tradeOrder.TradeOrderPost;
import com.yeepay.dao.tradeOrder.TradeOrderRequest;
import com.yeepay.dao.tradeOrder.TradeOrderResult;
import com.yeepay.service.merchantNoDb.MerchantNoDb;
import com.yeepay.service.tradeOrder.TradeOrder;
import com.yeepay.service.tradeOrder.db.TradeOrderDb;
import com.yeepay.service.yeepay.YeepayService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;


@Service
public class TradeOrderImpl implements TradeOrder {
    @Autowired
    MerchantNoDb merchantNoDb;

    @Autowired
    TradeOrderDb tradeOrderDb;

    @Autowired
    ReturnCode returnCode;

    @Autowired
    DealResultFalse dealResultFalse;

    @Autowired
    CommonConfig commonConfig;

    @Override
    public String tradeOrder(TradeOrderPost post) throws IOException {
        Map<String,String> goodsMap = new HashMap<>();
        goodsMap.put("goodsName",post.getGoodsName());
        goodsMap.put("goodsDesc",post.getGoodsDesc());
        String goodsParamExt = JsonUtils.toJson(goodsMap);
        TradeOrderRequest request = JsonUtils.toObj(JsonUtils.toJson(post),TradeOrderRequest.class);
        request.setGoodsParamExt(goodsParamExt);
        request.setParentMerchantNo(YeepayService.getParentMerchantNo());
        request.setMerchantNo(merchantNoDb.merchantNo(request.getMerchantNo()));
        String notifyUrl = request.getNotifyUrl();
        String csUrl = request.getCsUrl();
        request.setNotifyUrl(commonConfig.tradeOrderNotifyUrl);
        request.setCsUrl(commonConfig.tradeOrderCsUrl);
        Map<String,String> map = JsonUtils.toMap(request);
        String url = YeepayService.getUrl(YeepayService.TRADEORDER_URL);
        Map<String, String> resultMap = YeepayService.requestYOP(map, url, YeepayService.TRADEORDER,YeepayService.TRADEORDER_HMAC,post.getHmac());
        if(resultMap.get("code").equals("OPR00000")){
            TradeOrderResult tradeOrderResult = JsonUtils.toObj(JsonUtils.toJson(resultMap),TradeOrderResult.class);
            request.setNotifyUrl(notifyUrl);
            request.setCsUrl(csUrl);
            tradeOrderDb.tradeOrderDb(request,tradeOrderResult);
            resultMap.remove("parentMerchantNo");
            resultMap.replace("merchantNo",merchantNoDb.merchantNoCopy(resultMap.get("merchantNo")));
            tradeOrderResult = JsonUtils.toObj(JsonUtils.toJson(resultMap),TradeOrderResult.class);
            return JsonUtils.toJson(tradeOrderResult);
        }else{
            dealResultFalse.setReturnCode(resultMap.get("code"));
            dealResultFalse.setReturnMsg(resultMap.get("message"));
            return JsonUtils.toJson(dealResultFalse);
        }
    }
}
