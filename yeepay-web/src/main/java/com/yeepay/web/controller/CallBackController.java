package com.yeepay.web.controller;

import com.yeepay.common.utils.JsonUtils;
import com.yeepay.dao.networkAuditNotify.NANCallBack;
import com.yeepay.dao.networkAuditNotify.domain.NetworkAuditNotify;
import com.yeepay.service.callBack.EnterpriseNotify;
import com.yeepay.service.callBack.IndividualBusinessNotify;
import com.yeepay.service.callBack.IndividualNotify;
import com.yeepay.service.yeepay.YeepayService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import java.util.Map;


@Controller
@RequestMapping("notify")
public class CallBackController {


    @RequestMapping("individual")
    @ResponseBody
    public String individualCallBack(NANCallBack nanCallBack){
        Map<String,String> map = YeepayService.callback(nanCallBack.getResponse());
        NetworkAuditNotify networkAuditNotify = JsonUtils.toObj(JsonUtils.toJson(map),NetworkAuditNotify.class);
        Thread thread = new Thread(new IndividualNotify(networkAuditNotify));
        thread.start();
        return "success";
    }

    @RequestMapping("individualBusiness")
    @ResponseBody
    public String individualBusinessCallBack(NANCallBack nanCallBack){
        Map<String,String> map = YeepayService.callback(nanCallBack.getResponse());
        NetworkAuditNotify networkAuditNotify = JsonUtils.toObj(JsonUtils.toJson(map),NetworkAuditNotify.class);
        Thread thread = new Thread(new IndividualBusinessNotify(networkAuditNotify));
        thread.start();
        return "success";
    }

    @RequestMapping("enterprise")
    @ResponseBody
    public String enterpriseCallBack(NANCallBack nanCallBack){
        Map<String,String> map = YeepayService.callback(nanCallBack.getResponse());
        NetworkAuditNotify networkAuditNotify = JsonUtils.toObj(JsonUtils.toJson(map),NetworkAuditNotify.class);
        Thread thread = new Thread(new EnterpriseNotify(networkAuditNotify));
        thread.start();
        return "success";
    }
}
