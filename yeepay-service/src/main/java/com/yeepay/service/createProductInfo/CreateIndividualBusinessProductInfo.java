package com.yeepay.service.createProductInfo;

import com.yeepay.dao.individualBussiness.IndividualBusinessPost;

import java.util.HashMap;
import java.util.Map;

public class CreateIndividualBusinessProductInfo {
    public static String createIndividualBusinessProductInfo(IndividualBusinessPost post) {
        String[] payProducts = post.getPayProduct();
        String[] payScenarios = post.getPayScenario();
        String[] remitScenario = post.getRemitScenario();
        String[] remitProduct = post.getRemitProduct();
        String[] withdrawProduct = post.getWithdrawProduct();
        String webUrl_web = post.getWebUrlWeb();
        String icp = post.getIcp();
        String webUrl_h5 = post.getWebUrlH5();
        String appName = post.getAppName();
        String appDownloadUrl = post.getAppDownloadUrl();
        String remitScenarioAdd = post.getRemitScenarioAdd();

        //支付产品
        String ONE_KEY_PAY_DEBIT = post.getOneKeyPayDebit();
        String ONE_KEY_PAY_CREDIT = post.getOneKeyPayCredit();
        String B2C_PAY = post.getB2cPay();
        String B2B_PAY = post.getB2bPay();
        String WECHAT_ATIVE_SCAN = post.getWechatAtiveScan();
        String ALIPAY = post.getAliPay();
        String JD_ATIVE_SCAN = post.getJdAtiveScan();
        String UPOP_ATIVE_SCAN = post.getUpopAtiveScan();
        String weChatId = post.getWeChatId();
        String officialAccAppId = post.getOfficialAccAppId();
        String recommendOfficialAccAppId = post.getRecommendOfficialAccAppId();
        String officialAccAuthorizeDirectory = post.getOfficialAccAuthorizeDirectory();
        String OFFICIAL_ACCOUNT_PAY = post.getOfficialAccountPay();
        String aliPayPID = post.getAliPayPid();
        String ZFB_SHH = post.getZfbShh();
        String WECHAT_SCAN = post.getWechatScan();
        String ALIPAY_SCAN = post.getAliPayScan();
        String JD_PASSIVE_SCAN = post.getJdPassiveScan();
        String UPOP_PASSIVE_SCAN = post.getUpopPassiveScan();
        String WECHAT_H5_LOW = post.getWeChatH5Low();
        String WECHAT_H5 = post.getWeChatH5();
        String ALIPAY_H5 = post.getAliPayH5();
        String WECHAT_SDK = post.getWeChatSdk();
        String ALIPAY_SDK = post.getAliPaySdk();
        String JQ_BK = post.getJqbk();
        String ZF_BK_JJK = post.getZfbkjjk();
        String ZF_BK_DJK = post.getZfbkdjk();
        String ACCOUNT_PAY = post.getAccountPay();
        String json = "";

        Map<String, String> payProductMap = new HashMap<String, String>();
        payProductMap.put("ONE_KEY_PAY_DEBIT", ONE_KEY_PAY_DEBIT);
        payProductMap.put("ONE_KEY_PAY_CREDIT", ONE_KEY_PAY_CREDIT);
        payProductMap.put("B2C_PAY", B2C_PAY);
        payProductMap.put("B2B_PAY", B2B_PAY);
        payProductMap.put("WECHAT_ATIVE_SCAN", WECHAT_ATIVE_SCAN);
        payProductMap.put("ALIPAY", ALIPAY);
        payProductMap.put("JD_ATIVE_SCAN", JD_ATIVE_SCAN);
        payProductMap.put("UPOP_ATIVE_SCAN", UPOP_ATIVE_SCAN);
        payProductMap.put("weChatId", weChatId);
        payProductMap.put("officialAccAppId", officialAccAppId);
        payProductMap.put("recommendOfficialAccAppId", recommendOfficialAccAppId);
        payProductMap.put("officialAccAuthorizeDirectory", officialAccAuthorizeDirectory);
        payProductMap.put("OFFICIAL_ACCOUNT_PAY", OFFICIAL_ACCOUNT_PAY);
        payProductMap.put("aliPayPID", aliPayPID);
        payProductMap.put("ZFB_SHH", ZFB_SHH);
        payProductMap.put("WECHAT_SCAN", WECHAT_SCAN);
        payProductMap.put("ALIPAY_SCAN", ALIPAY_SCAN);
        payProductMap.put("JD_PASSIVE_SCAN", JD_PASSIVE_SCAN);
        payProductMap.put("UPOP_PASSIVE_SCAN", UPOP_PASSIVE_SCAN);
        payProductMap.put("WECHAT_H5_LOW", WECHAT_H5_LOW);
        payProductMap.put("WECHAT_H5", WECHAT_H5);
        payProductMap.put("ALIPAY_H5", ALIPAY_H5);
        payProductMap.put("WECHAT_SDK", WECHAT_SDK);
        payProductMap.put("ALIPAY_SDK", ALIPAY_SDK);
        payProductMap.put("JQ_BK", JQ_BK);
        payProductMap.put("ZF_BK_JJK", ZF_BK_JJK);
        payProductMap.put("ZF_BK_DJK", ZF_BK_DJK);
        payProductMap.put("ACCOUNT_PAY", ACCOUNT_PAY);

        //支付场景
        Map<String, String> payScenarioMap = new HashMap<String, String>();
        payScenarioMap.put("webUrl_web", webUrl_web);
        payScenarioMap.put("icp", icp);
        payScenarioMap.put("webUrl_h5", webUrl_h5);
        payScenarioMap.put("appName", appName);
        payScenarioMap.put("appDownloadUrl", appDownloadUrl);

        //出款产品
        String RECHARGE_REMIT = post.getRechargeRemit();
        String REMIT_BANK_NORMAL = post.getRemitBankNormal();
        String REMIT_BANK_REALTIME = post.getRemitBankRealTime();
        String REMIT_ALL_DAY = post.getRemitAllDay();
        String REMIT_ACCOUNT_REMIT = post.getRemitAccountRemit();
        String REMIT_RJT_EXPRESS_WORKDAY = post.getRemitRjtExpressWorkDay();
        String REMIT_RJT_EXPRESS_WEEKDAY = post.getRemitRjtExpressWeekDay();
        String firstPartyPercentage = post.getFirstPartyPercentage();

        Map<String, String> remitProductMap = new HashMap<String, String>();
        remitProductMap.put("RECHARGE_REMIT", RECHARGE_REMIT);
        remitProductMap.put("REMIT_BANK_NORMAL", REMIT_BANK_NORMAL);
        remitProductMap.put("REMIT_BANK_REALTIME", REMIT_BANK_REALTIME);
        remitProductMap.put("REMIT_ALL_DAY", REMIT_ALL_DAY);
        remitProductMap.put("REMIT_ACCOUNT_REMIT", REMIT_ACCOUNT_REMIT);
        remitProductMap.put("REMIT_RJT_EXPRESS_WORKDAY", REMIT_RJT_EXPRESS_WORKDAY);
        remitProductMap.put("REMIT_RJT_EXPRESS_WEEKDAY", REMIT_RJT_EXPRESS_WEEKDAY);
        remitProductMap.put("firstPartyPercentage", firstPartyPercentage);

        //提款产品
        Map<String,String> withdrawProductMap = new HashMap<String, String>();
        withdrawProductMap.put("WITHDRAW_WORKDAY",post.getWithdrawWorkDay());
        withdrawProductMap.put("WITHDRAW_WEEKDAY",post.getWithdrawWeekDay());
        withdrawProductMap.put("WITHDRAW_WORKDAY_FIXEDRATE",post.getWithdrawWorkDayFixedRate());
        withdrawProductMap.put("WITHDRAW_WORKDAY_PERCENTRATE",post.getWithdrawWorkDayPercentRate());
        withdrawProductMap.put("WITHDRAW_WEEKDAY_FIXEDRATE",post.getWithdrawWeekDayFixedRate());
        withdrawProductMap.put("WITHDRAW_WEEKDAY_PERCENTRATE",post.getWithdrawWeekDayPercentRate());

        String jsonProduct = ProductInfoService.createProduct(payProducts, payProductMap);
        String jsonScenario = ProductInfoService.createScenario(payScenarios, payScenarioMap);
        String jsonProductR = ProductInfoService.createRemitProduct(remitProduct, remitProductMap, remitScenario, remitScenarioAdd);
        String jsonProductW = ProductInfoService.createWithdrawProduct(withdrawProduct,withdrawProductMap);

        json = "{" + jsonProduct + "," + jsonScenario;
        if (jsonProductR != "") {
            json += "," + jsonProductR;
        }
        if(jsonProductW != ""){
            json += "," + jsonProductW;
        }
        json += "}";
        return json;
    }
}
