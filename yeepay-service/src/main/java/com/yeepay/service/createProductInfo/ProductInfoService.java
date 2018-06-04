package com.yeepay.service.createProductInfo;

import java.util.Map;

public class ProductInfoService {
	//支付产品
	private static final String ONEKEY = "ONEKEY";
	private static final String NETBANK = "NETBANK";

	private static final String SCANPAY = "SCANPAY";
	private static final String WECHATOPEN = "WECHATOPEN";
	private static final String ZFBSHH = "ZFBSHH";
	private static final String MSCANPAY = "MSCANPAY";
	private static final String EWALLETH5 = "EWALLETH5";
	private static final String EWALLET = "EWALLET";
	private static final String BK = "BK";
	private static final String ACCOUNT = "ACCOUNT";

	//支付场景
	private static final String WEB_ACCESS = "WEB_ACCESS";
	private static final String H5_ACCESS = "H5_ACCESS";
	private static final String APP_ACCESS = "APP_ACCESS";

	//出款场景
	private static final String OTHERS = "OTHERS";

	//出款产品
	private static final String REMIT_BANK = "REMIT_BANK";
	private static final String REMIT_ACCOUNT = "REMIT_ACCOUNT";
	private static final String RECHARGE = "RECHARGE";
	private static final String REMIT_RJT = "REMIT_RJT";

	//提现产品
	private static final String WITHDRAW_D0 = "WITHDRAW_D0";
	private static final String WITHDRAW_D1 = "WITHDRAW_D1";


	/**
	 * 支付产品
	 *
	 * @param payProducts
	 * @param payProductMap
	 * @return
	 */
	public static String createProduct(String[] payProducts, Map<String, String> payProductMap) {
		StringBuffer json = new StringBuffer();
		json.append("\"payProductMap\":{");
		for (String product : payProducts) {
			if (ONEKEY.equals(product)) {
				json.append(createONEKEY(payProductMap));
			}
			if (NETBANK.equals(product)) {
				json.append(createNETBANK(payProductMap));
			}
			if (SCANPAY.equals(product)) {
				json.append(createSCANPAY(payProductMap));
			}
			if (WECHATOPEN.equals(product)) {
				json.append(createWECHATOPEN(payProductMap));
			}
			if (ZFBSHH.equals(product)) {
				json.append(createZFBSHH(payProductMap));
			}
			if (MSCANPAY.equals(product)) {
				json.append(createMSCANPAY(payProductMap));
			}
			if (EWALLETH5.equals(product)) {
				json.append(createEWALLETH5(payProductMap));
			}
			if (EWALLET.equals(product)) {
				json.append(createEWALLET(payProductMap));
			}
			if (BK.equals(product)) {
				json.append(createBK(payProductMap));
			}
			if (ACCOUNT.equals(product)) {
				json.append(createACCOUNT(payProductMap));
			}
			json.append(",");
		}
		String jsonProduct = json.substring(0, json.length() - 1) + "}";
		return jsonProduct;
	}

    /**
     * 提现产品
     *
     * @param withdrawProduct
     * @param withdrawProductMap
     * @return
     */
    public static String createWithdrawProduct(String[] withdrawProduct, Map<String, String> withdrawProductMap) {
        StringBuffer json = new StringBuffer();
        json.append("\"withdrawProductMap\":{");
        for (String product : withdrawProduct) {
            if (WITHDRAW_D0.equals(product)) {
                json.append(createWITHDRAW_D0(withdrawProductMap));
            }
            if (NETBANK.equals(product)) {
                json.append(createWITHDRAW_D1(withdrawProductMap));
            }
            json.append(",");
        }
        String jsonProduct = json.substring(0, json.length() - 1) + "}";
        return jsonProduct;
    }

		/**
		 * 支付场景
		 * @param payScenarios
		 * @param payScenarioMap
		 * @return
		 */
		public static String createScenario (String[]payScenarios, Map < String, String > payScenarioMap){
			StringBuffer json = new StringBuffer();
			json.append("\"payScenarioMap\":{");
			for (String scenario : payScenarios) {
				json.append("\"" + scenario + "\":{");
				if (WEB_ACCESS.equals(scenario)) {
					String webUrl = payScenarioMap.get("webUrl_web");
					String icp = payScenarioMap.get("icp");
					json.append("\"webUrl\":\"" + webUrl + "\",");
					json.append("\"icp\":\"" + icp + "\"");
				}
				if (H5_ACCESS.equals(scenario)) {
					String webUrl = payScenarioMap.get("webUrl_h5");
					json.append("\"webUrl\":\"" + webUrl + "\"");
				}
				if (APP_ACCESS.equals(scenario)) {
					String appName = payScenarioMap.get("appName");
					json.append("\"appName\":\"" + appName + "\",");
					String appDownloadUrl = payScenarioMap.get("appDownloadUrl");
					json.append("\"appDownloadUrl\":\"" + appDownloadUrl + "\"");
				}
				json.append("},");
			}
			String jsonScenario = json.substring(0, json.length() - 1) + "}";
			return jsonScenario;
		}

		/**
		 * 一键支付
		 * @param payProductMap
		 * @return
		 */
		public static String createONEKEY (Map < String, String > payProductMap){
			StringBuffer json = new StringBuffer();
			String ONE_KEY_PAY_DEBIT = payProductMap.get("ONE_KEY_PAY_DEBIT");
			System.out.println("ONE_KEY_PAY_DEBIT:" + ONE_KEY_PAY_DEBIT);
			String ONE_KEY_PAY_CREDIT = payProductMap.get("ONE_KEY_PAY_CREDIT");
			System.out.println("ONE_KEY_PAY_CREDIT:" + ONE_KEY_PAY_CREDIT);
			if (!"".equals(ONE_KEY_PAY_DEBIT) && ONE_KEY_PAY_DEBIT != null)
				json.append("\"ONE_KEY_PAY_DEBIT\":{\"dsPayBankMap\":{\"BANK_PAY_WAP\":{\"rateType\":\"PERCENTAGE\",\"rate\":\"" + ONE_KEY_PAY_DEBIT + "\"}}},");
			if (!"".equals(ONE_KEY_PAY_CREDIT) && ONE_KEY_PAY_CREDIT != null)
				json.append("\"ONE_KEY_PAY_CREDIT\":{\"dsPayBankMap\":{\"BANK_PAY_WAP\":{\"rateType\":\"PERCENTAGE\",\"rate\":\"" + ONE_KEY_PAY_CREDIT + "\"}}}}");
			if ("".equals(json)) return "";
			return json.substring(0, json.length() - 1);
		}

		/**
		 * 网银支付
		 * @param payProductMap
		 * @return
		 */
		public static String createNETBANK (Map < String, String > payProductMap){
			StringBuffer json = new StringBuffer();
			String B2C_PAY = payProductMap.get("B2C_PAY");
			String B2B_PAY = payProductMap.get("B2B_PAY");
			System.out.println("B2C_PAY:" + B2C_PAY);
			System.out.println("B2B_PAY:" + B2B_PAY);
			if (!"".equals(B2C_PAY) && B2C_PAY != null)
				json.append("\"B2C_PAY\":{\"dsPayBankMap\":{\"NET_BANK\":{\"rateType\":\"PERCENTAGE\",\"rate\":\"" + B2C_PAY + "\"}}},");
			if (!"".equals(B2B_PAY) && B2B_PAY != null)
				json.append("\"B2B_PAY\":{\"dsPayBankMap\":{\"NET_BANK\":{\"rateType\":\"ONEPAY\",\"rate\":\"" + B2B_PAY + "\"}}},");
			if (json.length() < 1) return "";
			return json.substring(0, json.length() - 1);
		}

		/**
		 * 用户扫码
		 * @param payProductMap
		 * @return
		 */
		public static String createSCANPAY (Map < String, String > payProductMap){
			StringBuffer json = new StringBuffer();
			String WECHAT_ATIVE_SCAN = payProductMap.get("WECHAT_ATIVE_SCAN");
			String ALIPAY = payProductMap.get("ALIPAY");
			String JD_ATIVE_SCAN = payProductMap.get("JD_ATIVE_SCAN");
			String UPOP_ATIVE_SCAN = payProductMap.get("UPOP_ATIVE_SCAN");
			json.append("\"USER_SCAN_PAY\":{\"dsPayBankMap\":{");
			System.out.println("WECHAT_ATIVE_SCAN:" + WECHAT_ATIVE_SCAN);
			System.out.println("ALIPAY:" + ALIPAY);
			System.out.println("JD_ATIVE_SCAN:" + JD_ATIVE_SCAN);
			System.out.println("UPOP_ATIVE_SCAN:" + UPOP_ATIVE_SCAN);
			if (WECHAT_ATIVE_SCAN != "" && WECHAT_ATIVE_SCAN != null)
				json.append("\"WECHAT_ATIVE_SCAN\":{\"rateType\":\"PERCENTAGE\",\"rate\":\"" + WECHAT_ATIVE_SCAN + "\"},");
			if (ALIPAY != "" && ALIPAY != null)
				json.append("\"ALIPAY\":{\"rateType\":\"PERCENTAGE\",\"rate\":\"" + ALIPAY + "\"},");
			if (JD_ATIVE_SCAN != "" && JD_ATIVE_SCAN != null)
				json.append("\"JD_ATIVE_SCAN\":{\"rateType\":\"PERCENTAGE\",\"rate\":\"" + JD_ATIVE_SCAN + "\"},");
			if (UPOP_ATIVE_SCAN != "" && UPOP_ATIVE_SCAN != null)
				json.append("\"UPOP_ATIVE_SCAN\":{\"rateType\":\"PERCENTAGE\",\"rate\":\"" + UPOP_ATIVE_SCAN + "\"},");
			if (json.length() < 1) return "";
			return json.substring(0, json.length() - 1) + "}}";
		}

		/**
		 * 公众号支付
		 * @param payProductMap
		 * @return
		 */
		public static String createWECHATOPEN (Map < String, String > payProductMap){
			StringBuffer json = new StringBuffer();
			String OFFICIAL_ACCOUNT_PAY = payProductMap.get("OFFICIAL_ACCOUNT_PAY");
			String weChatId = payProductMap.get("weChatId");
			String officialAccAppId = payProductMap.get("officialAccAppId");
			String recommendOfficialAccAppId = payProductMap.get("recommendOfficialAccAppId");
			String officialAccAuthorizeDirectory = payProductMap.get("officialAccAuthorizeDirectory");
			json.append("\"OFFICIAL_ACCOUNT_PAY\":{\"dsPayBankMap\":{\"WECHAT_OPENID\":{\"rateType\":\"PERCENTAGE\",\"rate\":\"" + OFFICIAL_ACCOUNT_PAY + "\"}},");
			System.out.println("OFFICIAL_ACCOUNT_PAY:" + OFFICIAL_ACCOUNT_PAY);
			System.out.println("weChatId:" + weChatId);
			System.out.println("officialAccAppId:" + officialAccAppId);
			System.out.println("recommendOfficialAccAppId:" + recommendOfficialAccAppId);
			System.out.println("officialAccAuthorizeDirectory:" + officialAccAuthorizeDirectory);
			json.append("\"weChatId\":\"" + weChatId + "\",");
			json.append("\"officialAccAppId\":\"" + officialAccAppId + "\",");
			json.append("\"recommendOfficialAccAppId\":\"" + recommendOfficialAccAppId + "\",");
			json.append("\"officialAccAuthorizeDirectory\":\"" + officialAccAuthorizeDirectory + "\"}");
			if (json.length() < 1) return "";
			return json.toString();
		}

		/**
		 * 生活号支付
		 * @param payProductMap
		 * @return
		 */
		public static String createZFBSHH (Map < String, String > payProductMap){
			StringBuffer json = new StringBuffer();
			String ZFB_SHH = payProductMap.get("ZFB_SHH");
			String aliPayPID = payProductMap.get("aliPayPID");
			json.append("\"ZFB_SHH\":{\"dsPayBankMap\":{\"ZFB_SHH\":{\"rateType\":\"PERCENTAGE\",\"rate\":\"" + ZFB_SHH + "\"}},");
			System.out.println("ZFB_SHH:" + ZFB_SHH);
			System.out.println("aliPayPID:" + aliPayPID);
			json.append("\"aliPayPID\":\"" + aliPayPID + "\"}");
			if (json.length() < 1) return "";
			return json.toString();
		}

		/**
		 * 商家扫码
		 * @param payProductMap
		 * @return
		 */
		public static String createMSCANPAY (Map < String, String > payProductMap){
			StringBuffer json = new StringBuffer();
			String WECHAT_SCAN = payProductMap.get("WECHAT_SCAN");
			String ALIPAY_SCAN = payProductMap.get("ALIPAY_SCAN");
			String JD_PASSIVE_SCAN = payProductMap.get("JD_PASSIVE_SCAN");
			String UPOP_PASSIVE_SCAN = payProductMap.get("UPOP_PASSIVE_SCAN");
			json.append("\"MERCHANT_SCAN_PAY\":{\"dsPayBankMap\":{");
			System.out.println("WECHAT_SCAN:" + WECHAT_SCAN);
			System.out.println("ALIPAY_SCAN:" + ALIPAY_SCAN);
			System.out.println("JD_PASSIVE_SCAN:" + JD_PASSIVE_SCAN);
			System.out.println("UPOP_PASSIVE_SCAN:" + UPOP_PASSIVE_SCAN);
			if (WECHAT_SCAN != "" && WECHAT_SCAN != null)
				json.append("\"WECHAT_SCAN\":{\"rateType\":\"PERCENTAGE\",\"rate\":\"" + WECHAT_SCAN + "\"},");
			if (ALIPAY_SCAN != "" && ALIPAY_SCAN != null)
				json.append("\"ALIPAY_SCAN\":{\"rateType\":\"PERCENTAGE\",\"rate\":\"" + ALIPAY_SCAN + "\"},");
			if (JD_PASSIVE_SCAN != "" && JD_PASSIVE_SCAN != null)
				json.append("\"JD_PASSIVE_SCAN\":{\"rateType\":\"PERCENTAGE\",\"rate\":\"" + JD_PASSIVE_SCAN + "\"},");
			if (UPOP_PASSIVE_SCAN != "" && UPOP_PASSIVE_SCAN != null)
				json.append("\"UPOP_PASSIVE_SCAN\":{\"rateType\":\"PERCENTAGE\",\"rate\":\"" + UPOP_PASSIVE_SCAN + "\"},");
			if (json.length() < 1) return "";
			return json.substring(0, json.length() - 1) + "}}";
		}

		/**
		 * 提现产品D0
		 * @param withdrawProductMap
		 * @return
		 */
		public static String createWITHDRAW_D0 (Map < String, String > withdrawProductMap){
			StringBuffer json = new StringBuffer();
			String WITHDRAW_WORKDAY = withdrawProductMap.get("WITHDRAW_WORKDAY");
			String WITHDRAW_WEEKDAY = withdrawProductMap.get("WITHDRAW_WEEKDAY");
			String workDayFixedRate = withdrawProductMap.get("WITHDRAW_WORKDAY_FIXEDRATE");
			String workDayPercentRate = withdrawProductMap.get("WITHDRAW_WORKDAY_PERCENTRATE");
			String weekDayFixedRate = withdrawProductMap.get("WITHDRAW_WEEKDAY_FIXEDRATE");
			String weekDayPercentRate = withdrawProductMap.get("WITHDRAW_WEEKDAY_PERCENTRATE");
			json.append("\"WITHDRAW_D0\":{\"dsPayBankMap\":{");
			if (WITHDRAW_WORKDAY != "" && WITHDRAW_WORKDAY != null)
				json.append("\"WITHDRAW_WORKDAY\":{\"rateType\":\"MIXED\",\"fixedRate\":\"" + workDayFixedRate + "\",\"percentRate\":\"" + workDayPercentRate + "\"},");
			if (WITHDRAW_WEEKDAY != "" && WITHDRAW_WEEKDAY != null)
				json.append("\"WITHDRAW_WEEKDAY\":{\"rateType\":\"MIXED\",\"fixedRate\":\"" + weekDayFixedRate + "\",\"percentRate\":\"" + weekDayPercentRate + "\"},");
			if (json.length() < 1) return "";
			return json.substring(0, json.length() - 1) + "}}";
		}

		/**
		 * 提现产品D1
		 * @param withdrawProductMap
		 * @return
		 */
		public static String createWITHDRAW_D1 (Map < String, String > withdrawProductMap){
			StringBuffer json = new StringBuffer();
			String WITHDRAW_WORKDAY = withdrawProductMap.get("WITHDRAW_WORKDAY");
			String WITHDRAW_WEEKDAY = withdrawProductMap.get("WITHDRAW_WEEKDAY");
			String workDayFixedRate = withdrawProductMap.get("WITHDRAW_WORKDAY_FIXEDRATE");
			String workDayPercentRate = withdrawProductMap.get("WITHDRAW_WORKDAY_PERCENTRATE");
			String weekDayFixedRate = withdrawProductMap.get("WITHDRAW_WEEKDAY_FIXEDRATE");
			String weekDayPercentRate = withdrawProductMap.get("WITHDRAW_WEEKDAY_PERCENTRATE");
			json.append("\"WITHDRAW_D1\":{\"dsPayBankMap\":{");
			if (WITHDRAW_WORKDAY != "" && WITHDRAW_WORKDAY != null)
				json.append("\"WITHDRAW_WORKDAY\":{\"rateType\":\"MIXED\",\"fixedRate\":\"" + workDayFixedRate + "\",\"percentRate\":\"" + workDayPercentRate + "\"},");
			if (WITHDRAW_WEEKDAY != "" && WITHDRAW_WEEKDAY != null)
				json.append("\"WITHDRAW_WEEKDAY\":{\"rateType\":\"MIXED\",\"fixedRate\":\"" + weekDayFixedRate + "\",\"percentRate\":\"" + weekDayPercentRate + "\"},");
			if (json.length() < 1) return "";
			return json.substring(0, json.length() - 1) + "}}";
		}

		/**
		 * 钱包H5支付
		 * @param payProductMap
		 * @return
		 */
		public static String createEWALLETH5 (Map < String, String > payProductMap){
			StringBuffer json = new StringBuffer();
			String WECHAT_H5_LOW = payProductMap.get("WECHAT_H5_LOW");
			String WECHAT_H5 = payProductMap.get("WECHAT_H5");
			String ALIPAY_H5 = payProductMap.get("ALIPAY_H5");
			json.append("\"EWALLETH5\":{\"dsPayBankMap\":{");
			System.out.println("WECHAT_H5_LOW:" + WECHAT_H5_LOW);
			System.out.println("WECHAT_H5:" + WECHAT_H5);
			System.out.println("ALIPAY_H5:" + ALIPAY_H5);
			if (WECHAT_H5_LOW != "" && WECHAT_H5_LOW != null)
				json.append("\"WECHAT_H5_LOW\":{\"rateType\":\"PERCENTAGE\",\"rate\":\"" + WECHAT_H5_LOW + "\"},");
			if (WECHAT_H5 != "" && WECHAT_H5 != null)
				json.append("\"WECHAT_H5\":{\"rateType\":\"PERCENTAGE\",\"rate\":\"" + WECHAT_H5 + "\"},");
			if (ALIPAY_H5 != "" && ALIPAY_H5 != null)
				json.append("\"ALIPAY_H5\":{\"rateType\":\"PERCENTAGE\",\"rate\":\"" + ALIPAY_H5 + "\"},");
			if (json.length() < 1) return "";
			return json.substring(0, json.length() - 1) + "}}";
		}

		/**
		 * 钱包SDK支付
		 * @param payProductMap
		 * @return
		 */
		public static String createEWALLET (Map < String, String > payProductMap){
			StringBuffer json = new StringBuffer();
			String WECHAT_SDK = payProductMap.get("WECHAT_SDK");
			String ALIPAY_SDK = payProductMap.get("ALIPAY_SDK");
			json.append("\"EWALLET\":{\"dsPayBankMap\":{");
			System.out.println("WECHAT_SDK:" + WECHAT_SDK);
			System.out.println("ALIPAY_SDK:" + ALIPAY_SDK);
			if (WECHAT_SDK != "" && WECHAT_SDK != null)
				json.append("\"WECHAT_SDK\":{\"rateType\":\"PERCENTAGE\",\"rate\":\"" + WECHAT_SDK + "\"},");
			if (ALIPAY_SDK != "")
				json.append("\"ALIPAY_SDK\":{\"rateType\":\"PERCENTAGE\",\"rate\":\"" + ALIPAY_SDK + "\"},");
			if (json.length() < 1) return "";
			return json.substring(0, json.length() - 1) + "}}";
		}

		/**
		 * 绑卡支付
		 * @param payProductMap
		 * @return
		 */
		public static String createBK (Map < String, String > payProductMap){
			StringBuffer json = new StringBuffer();
			String JQ_BK = payProductMap.get("JQ_BK");
			String ZF_BK_JJK = payProductMap.get("ZF_BK_JJK");
			String ZF_BK_DJK = payProductMap.get("ZF_BK_DJK");

			System.out.println("JQ_BK:" + JQ_BK);
			System.out.println("ZF_BK_JJK:" + ZF_BK_JJK);
			System.out.println("ZF_BK_DJK:" + ZF_BK_DJK);

			if (JQ_BK != "" && JQ_BK != null)
				json.append("\"JQ_BK\":{\"dsPayBankMap\":{\"JQ_BK\":{\"rateType\":\"ONEPAY\",\"rate\":\"" + JQ_BK + "\"}}},");
			if (ZF_BK_JJK != "" && ZF_BK_JJK != null)
				json.append("\"ZF_BK_JJK\":{\"dsPayBankMap\":{\"ZF_BK\":{\"rateType\":\"PERCENTAGE\",\"rate\":\"" + ZF_BK_JJK + "\"}}},");
			if (ZF_BK_DJK != "" && ZF_BK_DJK != null)
				json.append("\"ZF_BK_DJK\":{\"dsPayBankMap\":{\"ZF_BK\":{\"rateType\":\"PERCENTAGE\",\"rate\":\"" + ZF_BK_DJK + "\"}}},");
			if (json.length() < 1) return "";
			return json.substring(0, json.length() - 1);
		}

		/**
		 * 账户企业支付
		 * @param payProductMap
		 * @return
		 */
		public static String createACCOUNT (Map < String, String > payProductMap){
			StringBuffer json = new StringBuffer();
			String ACCOUNT_PAY = payProductMap.get("ACCOUNT_PAY");
			System.out.println("ACCOUNT_PAY:" + ACCOUNT_PAY);
			if (ACCOUNT_PAY != "" && ACCOUNT_PAY != null)
				json.append("\"ACCOUNT_PAY\":{\"dsPayBankMap\":{\"ACCOUNT_PAY\":{\"rateType\":\"PERCENTAGE\",\"rate\":\"" + ACCOUNT_PAY + "\"}}},");
			if (json.length() < 1) return "";
			return json.substring(0, json.length() - 1);
		}

		/**
		 * 出款产品
		 * @param remitProduct
		 * @param payProductMap
		 * @param remitScenario
		 * @param remitScenarioAdd
		 * @return
		 */
		public static String createRemitProduct (String[]remitProduct, Map < String, String > payProductMap, String[]
		remitScenario, String remitScenarioAdd){
			StringBuffer json = new StringBuffer();
			if (remitProduct == null) {
				return "";
			}
			json.append("\"remitProductMap\":{");

			for (String product : remitProduct) {
				if (RECHARGE.equals(product)) {
					json.append(createRECHARGE(payProductMap));
				}
				if (REMIT_BANK.equals(product)) {
					json.append(createREMIT_BANK(payProductMap, remitScenario, remitScenarioAdd));
				}
				if (REMIT_ACCOUNT.equals(product)) {
					json.append(createREMIT_ACCOUNT(payProductMap));
				}
				if (REMIT_RJT.equals(product)) {
					json.append(createREMIT_RJT(payProductMap));
				}
				json.append(",");
			}
			return json.substring(0, json.length() - 1) + "}";
		}

		//充值
		public static String createRECHARGE (Map < String, String > payProductMap){
			StringBuffer json = new StringBuffer();
			String RECHARGE = payProductMap.get("RECHARGE_REMIT");
			System.out.println("RECHARGE:" + RECHARGE);
			json.append("\"RECHARGE\":{\"dsRemitBankMap\":{\"RECHARGE\":{\"rateType\":\"ONEPAY\",\"rate\":\"" + RECHARGE + "\"}}}");
			return json.toString();
		}

		//付款到银行
		public static String createREMIT_BANK (Map < String, String > payProductMap, String[]remitScenario, String
		remitScenarioAdd){
			StringBuffer json = new StringBuffer();
			String REMIT_BANK_NORMAL = payProductMap.get("REMIT_BANK_NORMAL");
			String REMIT_BANK_REALTIME = payProductMap.get("REMIT_BANK_REALTIME");
			String REMIT_ALL_DAY = payProductMap.get("REMIT_ALL_DAY");
			String REMIT_TOPSPEED = payProductMap.get("REMIT_TOPSPEED");
			System.out.println("REMIT_BANK_NORMAL:" + REMIT_BANK_NORMAL);
			System.out.println("REMIT_BANK_REALTIME:" + REMIT_BANK_REALTIME);
			System.out.println("REMIT_ALL_DAY:" + REMIT_ALL_DAY);
			System.out.println("REMIT_TOPSPEED:" + REMIT_TOPSPEED);
			json.append("\"REMIT_BANK\":{\"dsRemitBankMap\":{");
			if (REMIT_BANK_NORMAL != "" && REMIT_BANK_NORMAL != null)
				json.append("\"REMIT_BANK_NORMAL\":{\"rateType\":\"ONEPAY\",\"rate\":\"" + REMIT_BANK_NORMAL + "\"},");
			if (REMIT_BANK_REALTIME != "" && REMIT_BANK_REALTIME != null)
				json.append("\"REMIT_BANK_REALTIME\":{\"rateType\":\"ONEPAY\",\"rate\":\"" + REMIT_BANK_REALTIME + "\"},");
			if (REMIT_ALL_DAY != "" && REMIT_ALL_DAY != null)
				json.append("\"REMIT_ALL_DAY\":{\"rateType\":\"ONEPAY\",\"rate\":\"" + REMIT_ALL_DAY + "\"},");
			if (REMIT_TOPSPEED != "" && REMIT_TOPSPEED != null)
				json.append("\"REMIT_TOPSPEED\":{\"rateType\":\"ONEPAY\",\"rate\":\"" + REMIT_TOPSPEED + "\"},");
			boolean flag = false;
			json.deleteCharAt(json.length() - 1);
			json.append("},\"remitScenario\":\"");
			for (String scenario : remitScenario) {
				if (OTHERS.equals(scenario)) flag = true;
				json.append(scenario + ",");
			}
			json.deleteCharAt(json.length() - 1);
			json.append("\"");
			if (flag)
				json.append(",\"remitScenarioAdd\":\"" + remitScenarioAdd + "\"");
			return json.append("}").toString();
		}

		//付款到账户
		public static String createREMIT_ACCOUNT (Map < String, String > payProductMap){
			StringBuffer json = new StringBuffer();
			String REMIT_ACCOUNT_REMIT = payProductMap.get("REMIT_ACCOUNT_REMIT");
			System.out.println("REMIT_ACCOUNT_REMIT:" + REMIT_ACCOUNT_REMIT);
			json.append("\"REMIT_ACCOUNT\":{\"dsRemitBankMap\":{\"REMIT_ACCOUNT\":{\"rateType\":\"ONEPAY\",\"rate\":\"" + REMIT_ACCOUNT_REMIT + "\"}}}");
			return json.toString();
		}

		//日结通
		public static String createREMIT_RJT (Map < String, String > payProductMap){
			StringBuffer json = new StringBuffer();
			String REMIT_RJT_EXPRESS_WORKDAY = payProductMap.get("REMIT_RJT_EXPRESS_WORKDAY");
			String REMIT_RJT_EXPRESS_WEEKDAY = payProductMap.get("REMIT_RJT_EXPRESS_WEEKDAY");
			String firstPartyPercentage = payProductMap.get("firstPartyPercentage");
			System.out.println("REMIT_RJT_EXPRESS_WORKDAY:" + REMIT_RJT_EXPRESS_WORKDAY);
			System.out.println("REMIT_RJT_EXPRESS_WEEKDAY:" + REMIT_RJT_EXPRESS_WEEKDAY);
			System.out.println("firstPartyPercentage:" + firstPartyPercentage);
			json.append("\"REMIT_RJT\":{\"dsRemitBankMap\":{");
			if (REMIT_RJT_EXPRESS_WORKDAY != "" && REMIT_RJT_EXPRESS_WORKDAY != null)
				json.append("\"REMIT_RJT_EXPRESS_WORKDAY\":{\"rateType\":\"PERCENTAGE\",\"rate\":\"" + REMIT_RJT_EXPRESS_WORKDAY + "\"},");
			if (REMIT_RJT_EXPRESS_WEEKDAY != "" && REMIT_RJT_EXPRESS_WEEKDAY != null)
				json.append("\"REMIT_RJT_EXPRESS_WEEKDAY\":{\"rateType\":\"PERCENTAGE\",\"rate\":\"" + REMIT_RJT_EXPRESS_WEEKDAY + "\"},");
			if (firstPartyPercentage != "" && firstPartyPercentage != null)
				json.append("\"firstPartyPercentage\":\"" + firstPartyPercentage + "\"},");
			return json.substring(0, json.length() - 1) + "}";
		}
	}

