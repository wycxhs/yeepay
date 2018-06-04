package com.yeepay.service.yeepay;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.TypeReference;
import com.yeepay.common.utils.Md5Utils;
import com.yeepay.g3.sdk.yop.client.YopClient3;
import com.yeepay.g3.sdk.yop.client.YopRequest;
import com.yeepay.g3.sdk.yop.client.YopResponse;
import com.yeepay.g3.sdk.yop.encrypt.CertTypeEnum;
import com.yeepay.g3.sdk.yop.encrypt.DigestAlgEnum;
import com.yeepay.g3.sdk.yop.encrypt.DigitalEnvelopeDTO;
import com.yeepay.g3.sdk.yop.encrypt.DigitalSignatureDTO;
import com.yeepay.g3.sdk.yop.utils.DigitalEnvelopeUtils;
import com.yeepay.g3.sdk.yop.utils.InternalConfig;
import com.yeepay.g3.yop.sdk.api.StdApi;

import java.io.*;
import java.security.PrivateKey;
import java.security.PublicKey;
import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class YeepayService {

	//yop接口应用URI地址
	public static final String BASE_URL = "baseURL";
	public static final String TRADEORDER_URL = "tradeOrderURI";
	public static final String ORDERQUERY_URL = "orderQueryURI";
	public static final String REFUND_URL = "refundURI";
	public static final String REFUNDQUERY_URL = "refundQueryURI";
	public static final String MULTIORDERQUERY_URL = "multiOrderQueryURI";
	public static final String ORDERCLOSE_URL = "orderCloseURI";
	public static final String SETTLEMENTSQUERY_URL = "settlementsqueryURI";
	public static final String BALANCEQUERY_URL = "balancequeryURI";
	public static final String HMACKEYQUERY_URL = "hmackeyqueryURI";
	public static final String APICASHIER_URI = "APICASHIER";
	
	public static final String TRADEDIVIDE_URL = "tradedivideURI";
	public static final String TRADEDIVIDEQUERY_URL = "tradedividequeryURI";
	public static final String TRADEFULLSETTLE_URL = "tradefullsettleURI";
	
	public static final String PERSON_URL = "personURI";
	public static final String INDIVIDUAL_URL = "individualURI";
	public static final String ENTERPRISE_URL = "enterpriseURI";
	public static final String AGREEINFOQUERY_URL = "agreeinfoqueryURI";
	public static final String BANKBRANCHINFO_URL = "bankBranchInfoURI";
	public static final String REGSTATUSQUERY_URL = "regstatusqueryURI";
	public static final String UPLOAD_URL = "uploadURI";
	public static final String SENDAUTHORIZENUM_URL = "sendauthorizenumURI";
	public static final String SENDMERSMSNOTIFY_URL = "sendmersmsnotifyURI";
	public static final String MERPRODUCTFEEUPDATEFORO2O_URL = "merproductfeeupdateforo2oURI";
	public static final String MERSETTLEINFOUPDATEFORO2O_URL = "mersettleinfoupdateforo2oURI";
	public static final String AUTHORIZEURLQUERY_URL = "authorizeurlqueryURI";
	public static final String RECEIVEAUTHORIZENUM_URL = "receiveauthorizenumURI";

	//接口参数
	public static final String[] TRADEORDER = {"parentMerchantNo","merchantNo","orderId","orderAmount","timeoutExpress","requestDate","redirectUrl","notifyUrl","goodsParamExt","paymentParamExt","industryParamExt","memo","riskParamExt","csUrl","fundProcessType"};
	public static final String[] ORDERQUERY = {"parentMerchantNo","merchantNo","orderId","uniqueOrderNo"};
	public static final String[] REFUND = {"parentMerchantNo","merchantNo","orderId","uniqueOrderNo","refundRequestId","refundAmount","description","memo","notifyUrl"};
	public static final String[] REFUNDQUERY = {"parentMerchantNo","merchantNo","refundRequestId","orderId","uniqueRefundNo"};
	public static final String[] MULTIORDERQUERY = {"status","parentMerchantNo","merchantNo","requestDateBegin","requestDateEnd","pageNo","pageSize"};
	public static final String[] ORDERCLOSE = {"parentMerchantNo","merchantNo","orderId","uniqueOrderNo","description"};
	public static final String[] SETTLEMENTSQUERY = {"parentMerchantNo","merchantNo","startSettleDate","endSettleDate"};
	public static final String[] BALANCEQUERY = {"parentMerchantNo","merchantNo"};
	public static final String[] HMACKEYQUERY = {"parentMerchantNo","merchantNo"};
	
	public static final String[] TRADEDIVIDE = {"parentMerchantNo","merchantNo","divideRequestId","orderId","uniqueOrderNo","contractNo","divideDetail","infoParamExt"};
	public static final String[] TRADEDIVIDEQUERY = {"parentMerchantNo","merchantNo","divideRequestId","orderId","uniqueOrderNo"};
	public static final String[] TRADEFULLSETTLE = {"parentMerchantNo","merchantNo","orderId","uniqueOrderNo"};
	
	//商户入网接口参数
	public static final String[] PERSON = {"requestNo","parentMerchantNo","merShortName","legalName","legalIdCard","merLegalPhone","merLegalEmail","merLevel1No","merLevel2No","merProvince","merCity","merDistrict","merAddress","merScope","cardNo","headBankCode","bankCode","bankProvince","bankCity","productInfo","fileInfo","businessFunction","notifyUrl","merAuthorizeType"};
	public static final String[] INDIVIDUAL = {"requestNo","parentMerchantNo","merFullName","merShortName","merCertNo","legalName","legalIdCard","merLegalPhone","merLegalEmail","merLevel1No","merLevel2No","merProvince","merCity","merDistrict","merAddress","cardNo","headBankCode","bankCode","bankProvince","bankCity","productInfo","fileInfo","businessFunction","notifyUrl","merAuthorizeType"};
	public static final String[] ENTERPRISE = {"requestNo","parentMerchantNo","merFullName","merShortName","merCertType","merCertNo","legalName","legalIdCard","merLevel1No","merLevel2No","merProvince","merCity","merDistrict","merAddress","merContactName","merContactPhone","merContactEmail","taxRegistCert","accountLicense","orgCode","isOrgCodeLong","orgCodeExpiry","cardNo","headBankCode","bankCode","bankProvince","bankCity","productInfo","fileInfo","businessFunction","notifyUrl","merAuthorizeType"};
	public static final String[] AGREEINFOQUERY = {"parentMerchantNo","merchantNo"};
	public static final String[] BANKBRANCHINFO = {"headBankCode","provinceCode","cityCode"};
	public static final String[] REGSTATUSQUERY = {"parentMerchantNo","merchantNo"};
	public static final String[] UPLOAD = {"fileType","_file"};
	public static final String[] SENDAUTHORIZENUM = {"parentMerchantNo","merchantNo","phone"};
	public static final String[] SENDMERSMSNOTIFY = {"parentMerchantNo","merchantNo","phone","sourceType"};
	public static final String[] MERPRODUCTFEEUPDATEFORO2O = {"parentMerchantNo","merchantNo","requestNo","merAuthorizeNum","payProductMap"};
	public static final String[] MERSETTLEINFOUPDATEFORO2O = {"parentMerchantNo","merchantNo","requestNo","merAuthorizeNum","bankcardNo","headBankName","bankName","bankProvince","bankCity","callbackurl"};
	public static final String[] AUTHORIZEURLQUERY = {"parentMerchantNo","merchantNo"};
	public static final String[] RECEIVEAUTHORIZENUM = {"parentMerchantNo","merchantNo","phone","merAuthorizeNum"};
	
	//验签顺序
	public static final String[] TRADEORDER_HMAC = {"parentMerchantNo","merchantNo","orderId","orderAmount","notifyUrl"};	
	public static final String[] ORDERQUERY_HMAC = {"parentMerchantNo","merchantNo","orderId","uniqueOrderNo"};	
	public static final String[] REFUND_HMAC = {"parentMerchantNo","merchantNo","orderId","uniqueOrderNo","refundRequestId","refundAmount"};	
	public static final String[] REFUNDQUERY_HMAC = {"parentMerchantNo","merchantNo","refundRequestId","orderId","uniqueRefundNo"};
	public static final String[] MULTIORDERQUERY_HMAC = {"parentMerchantNo","merchantNo","requestDateBegin","requestDateEnd","pageNo","pageSize"};
	public static final String[] ORDERCLOSE_HMAC = {"parentMerchantNo","merchantNo","orderId","uniqueOrderNo"};
	public static final String[] SETTLEMENTSQUERY_HMAC = {"parentMerchantNo","merchantNo","startSettleDate","endSettleDate"};
    public static final String[] TRADEDIVIDE_HMAC={"parentMerchantNo","merchantNo","orderId","uniqueOrderNo","divideRequestId"};
	public static final String[] TRADEDIVIDEQUERY_HMAC={"parentMerchantNo","merchantNo","orderId","uniqueOrderNo","divideRequestId"};
    public static final String[] TRADEFULLSETTLE_HMAC={"parentMerchantNo","merchantNo","orderId","uniqueOrderNo"};
	//支付方式
	public static final String[] CASHIER = {"merchantNo","token","timestamp","directPayType","cardType","userNo","userType","ext"};
	public static final String[] APICASHIER = {"token","payTool","payType","userNo","userType","appId","openId","payEmpowerNo","merchantTerminalId","merchantStoreNo","userIp","version"};

	//获取对账类型
	public static final String TRADEDAYDOWNLOAD = "tradedaydownload";
	public static final String TRADEMONTHDOWNLOAD = "trademonthdownload";
		
	//获取对应的请求地址
	public static String getUrl(String payType){
		return Configuration.getInstance().getValue(payType);
	}

	//拼接支付链接
	public static String getUrl(Map<String,String> paramValues) throws UnsupportedEncodingException{
		StringBuffer url = new StringBuffer();
		url.append(getUrl("CASHIER"));
		paramValues.put("merchantNo", getParentMerchantNo());
		StringBuilder stringBuilder = new StringBuilder();
		System.out.println(paramValues);
		for (int i = 0; i < CASHIER.length; i++) {
			String name = CASHIER[i];
			String value = paramValues.get(name);
			if(i != 0){
				stringBuilder.append("&");
			}
			stringBuilder.append(name+"=").append(value);
		}
		System.out.println(stringBuilder);
		String sign = getSign(stringBuilder.toString());
		url.append("?sign="+sign+"&"+stringBuilder);
		return url.toString();
	}
	
	//获取父商编
	public static String getParentMerchantNo(){
		return Configuration.getInstance().getValue("parentMerchantNo");
	}
	
	//获取子商编
	public static String getMerchantNo(){
		return Configuration.getInstance().getValue("merchantNo");
	}
	
	//获取父商编私钥
	public static PrivateKey getSecretKey(){
		PrivateKey isvPrivateKey = InternalConfig.getISVPrivateKey(CertTypeEnum.RSA2048);
		return isvPrivateKey;
	}
	
	//获取子商户密钥
	public static String getMerchantKey() throws IOException{
		String merchantNo = getMerchantNo();
		Map<String, String> params = new HashMap<>();
		params.put("parentMerchantNo", getParentMerchantNo());
		params.put("merchantNo", merchantNo);
		
		Map<String, String> result = new HashMap<>();
		String uri = getUrl(HMACKEYQUERY_URL);
		result = YeepayService.requestYOP(params, uri, HMACKEYQUERY);
		
		System.out.println("result:"+result);
		return result.get("merHmacKey");
	}
	
	//获取公钥
	public static PublicKey getPublicKey(){
		PublicKey isvPublicKey = InternalConfig.getYopPublicKey(CertTypeEnum.RSA2048);
		return isvPublicKey;
	}
	//获取sign
	public static String getSign(String stringBuilder){
		String appKey = "OPR:"+getParentMerchantNo();
		PrivateKey isvPrivateKey = getSecretKey();
		DigitalSignatureDTO digitalSignatureDTO = new DigitalSignatureDTO();
		digitalSignatureDTO.setAppKey(appKey);
		digitalSignatureDTO.setCertType(CertTypeEnum.RSA2048);
		digitalSignatureDTO.setDigestAlg(DigestAlgEnum.SHA256);
		digitalSignatureDTO.setPlainText(stringBuilder.toString());
		String sign = DigitalEnvelopeUtils.sign0(digitalSignatureDTO,isvPrivateKey);
		return sign;
	}
	
	/**
	 * 请求YOP接口---其他接口使用
	 * params 请求参数,parentMerchantNo除外
	 * uri 请求yop的应用URI地址
	 * paramSign 请求参数的验签顺序
	 * hmackey 子商编私钥
	 * paramHmac 验签参数
	 * @throws IOException 
	 */
	public static Map<String, String> requestYOP(Map<String, String> params, String uri, String[] paramSign, String[] paramHmac,String hmackey) throws IOException{
		Map<String, String> result = new HashMap<String, String>();
		String BASE_URL = getUrl("baseURL");
		String parentMerchantNo = YeepayService.getParentMerchantNo();
		YopRequest request = new YopRequest("OPR:" + parentMerchantNo);
		
		for (int i = 0; i < paramSign.length; i ++) {
			String key = paramSign[i];
			System.out.println("name:"+key);
			System.out.println("value:"+params.get(key));
			request.addParam(key, params.get(key)==null?"":params.get(key));
		}
		System.out.println("yoprui:"+uri);
		System.out.println("yopRequest:"+request.getParams());
		
		StringBuffer hmacBuffer = new StringBuffer();
		for(int i = 0; i < paramHmac.length; i++){
			String key = paramHmac[i];
			hmacBuffer.append(key).append("=").append(params.get(key)).append("&");
		}
		
		String hmacStr = hmacBuffer.subSequence(0, hmacBuffer.length()-1).toString();
		System.out.println("hmacStr:"+hmacStr);
		System.out.println("hmackey:"+hmackey);
		String hmac = Md5Utils.encoderHmacSha256(hmacStr, hmackey);
		System.out.println("hmac:"+hmac);
		request.addParam("hmac", hmac);
		
		System.out.println(request.getParams());
		YopResponse response = YopClient3.postRsa(uri, request);
		
		System.out.println(response.toString());
		if("FAILURE".equals(response.getState())){
			if(response.getError() != null)
			result.put("code",response.getError().getCode());
			result.put("message",response.getError().getMessage());
			return result;
		}
		if (response.getStringResult() != null) {
			result = parseResponse(response.getStringResult());
		}
		
		return result;
	}
	
	/**
	 * 请求YOP接口-----子商户注册接口使用
	 * params 请求参数,parentMerchantNo除外
	 * uri 请求yop的应用URI地址
	 * paramSign 请求参数的验签顺序
	 * @throws IOException 
	 */
	public static Map<String, String> requestYOP(Map<String, String> params, String uri, String[] paramSign) throws IOException{
		Map<String, String> result = new HashMap<String, String>();
		String BASE_URL = getUrl("baseURL");
		
		String parentMer = getParentMerchantNo();
		YopRequest request = new YopRequest("OPR:"+parentMer);
		System.out.println(BASE_URL);
		for (int i = 0; i < paramSign.length; i ++) {
			String key = paramSign[i];
			System.out.println("name:"+key);
			System.out.println("value:"+params.get(key));
			request.addParam(key, params.get(key)==null?"":params.get(key));
		}
		System.out.println("yoprui:"+uri);
		System.out.println("yopRequest:"+request.getParams());
				
		YopResponse response = YopClient3.postRsa(uri, request);

		System.out.println(response.toString());
		if("FAILURE".equals(response.getState())){
			if(response.getError() != null)
			result.put("returnCode",response.getError().getCode());
			result.put("returnMsg",response.getError().getMessage());
			return result;
		}
		if (response.getStringResult() != null) {
			result = parseResponse(response.getStringResult());
		}
		
		return result;
	}

	//将获取到的response转换成map格式
	public static Map<String, String> parseResponse(String response){
		
		Map<String,String> jsonMap  = new HashMap<>();
		jsonMap	= JSON.parseObject(response, 
				new TypeReference<TreeMap<String,String>>() {});
		
		return jsonMap;
	}
	
	/**
	 *  获取支行信息
	 *  headBankCode 银行总称
	 *  provinceCode 省编码
	 * 	cityCode     市编码 
	 * @throws IOException 
	 */
	public static Map<String, String> getBankBranchInfo(String headBankCode, String provinceCode, String cityCode) throws IOException{
		Map<String, String> result = new HashMap<>();
		Map<String, String> params = new HashMap<>();
		params.put("headBankCode", headBankCode);
		params.put("provinceCode", provinceCode);
		params.put("cityCode", cityCode);
		
		String uri = YeepayService.getUrl(YeepayService.BANKBRANCHINFO_URL);
		System.out.println(uri);
		result = YeepayService.requestYOP(params, uri, YeepayService.BANKBRANCHINFO);
		System.out.println(result);
		
		return result;
	}
	
	/**
	 *	商户产品协议获取
	 * @throws IOException 
	 */
	public static Map<String, String> getAgreeInfoQuery() throws IOException{
		Map<String, String> result = new HashMap<>();
		String parentMerchantNo = getParentMerchantNo();
		String merchantNo = getMerchantNo();
		Map<String, String> params = new HashMap<>();
		params.put("parentMerchantNo", parentMerchantNo);
		params.put("merchantNo", merchantNo);
		String uri = YeepayService.getUrl(YeepayService.AGREEINFOQUERY_URL);
		System.out.println(uri);
		result = YeepayService.requestYOP(params, uri, YeepayService.AGREEINFOQUERY);
		System.out.println(result);
		return result;
	}
	
	/**
	 * 文件上传，获取地址
	 * @param
	 * @return
	 * @throws IOException 
	 */
	public static Map<String,String> upload(String fileType, String file) throws IOException {
		Map<String, String> result = new HashMap<>();
		String uri = YeepayService.getUrl(YeepayService.UPLOAD_URL);
		System.out.println(uri);
		YopRequest request = new YopRequest("OPR:"+getParentMerchantNo());
		request.addParam("fileType", fileType);
	    //request.addParam("_file", "file:"+file);
		request.addParam("_file", file);
	    System.out.println(request.toQueryString());
		YopResponse response = YopClient3.uploadRsa(uri, request);
		System.out.println(response.toString());
		if("FAILURE".equals(response.getState())){
			if(response.getError() != null)
			result.put("code",response.getError().getCode());
			result.put("message",response.getError().getMessage());
			return result;
		}
		if (response.getStringResult() != null) {
			result = parseResponse(response.getStringResult());
		}
		return result;
	}
	
	//回调
	public static Map<String, String> callback(String response){
		System.out.println(response);
		DigitalEnvelopeDTO dto = new DigitalEnvelopeDTO();
		dto.setCipherText(response);
		Map<String,String> jsonMap  = new HashMap<>();
	    try {
	        PrivateKey privateKey = InternalConfig.getISVPrivateKey(CertTypeEnum.RSA2048);
	        PublicKey publicKey = InternalConfig.getYopPublicKey(CertTypeEnum.RSA2048);
	        dto = DigitalEnvelopeUtils.decrypt(dto, privateKey, publicKey);
	        System.out.println(dto.getPlainText());
	        jsonMap = parseResponse(dto.getPlainText());
        } catch (Exception e) {
        	e.printStackTrace();
        }
	    
		return jsonMap;
	}
	
	public static boolean verifyCallback(Map<String,String> responseMap){
		boolean flag = false;
		String merchantNo = responseMap.get("merchantNo");
		String parentMerchantNo = responseMap.get("parentMerchantNo");
		String orderId = responseMap.get("orderId");
		String signResp = responseMap.get("sign");
	    String s = "merchantNo="+merchantNo+"&parentMerchantNo="+parentMerchantNo+"&orderId="+orderId;
	    System.out.println("s===="+s);
	    String appKey = "OPR:"+getMerchantNo();
		PublicKey isvPublicKey = getPublicKey();
		DigitalSignatureDTO digitalSignatureDTO = new DigitalSignatureDTO();
		digitalSignatureDTO.setAppKey(appKey);
		digitalSignatureDTO.setCertType(CertTypeEnum.RSA2048);
		digitalSignatureDTO.setDigestAlg(DigestAlgEnum.SHA256);
		digitalSignatureDTO.setPlainText(s.toString());
		digitalSignatureDTO.setSignature(signResp);
		try {
			DigitalEnvelopeUtils.verify0(digitalSignatureDTO,isvPublicKey);
			flag = true;
		} catch (Exception e) {
			// TODO: handle exception
		}
		return flag;
	}
	
	/**
	 * 下载对账单
	 * @return
	 */
	public static String yosFile(Map<String, String> params, String path) {
		StdApi apidApi = new StdApi("10000466938");
		InputStream inputStream = null;
		OutputStream outputStream = null;
		String merchantNo = getMerchantNo();
		String method = params.get("method");
		String date = params.get("date");
		
		String fileName = ""; 
		String filePath = "";
		try {
			if (method.equals(YeepayService.TRADEDAYDOWNLOAD)) {
				System.out.println("1");
				inputStream = apidApi.tradeDayBillDownload(merchantNo, date);
				fileName = "tradeday-"+date+".csv";
				
			}else if(method.equals(YeepayService.TRADEMONTHDOWNLOAD)){
				System.out.println("2");
				inputStream = apidApi.tradeMonthBillDownload(merchantNo, date);
				fileName = "trademonth-"+date+".csv";
				
			}
			filePath	= path + File.separator + fileName;
			System.out.println("filePath====="+filePath);
			outputStream = new FileOutputStream(new File(filePath));
			byte[] bs = new byte[1024];
			int readNum;
			while ((readNum = inputStream.read(bs)) != -1) {
				outputStream.write(bs, 0, readNum);
			}
		} catch (Exception e1) {
			e1.printStackTrace();
			return null;
		} finally {
			try {
				outputStream.close();
			} catch (Exception e) {
				e.printStackTrace();
			}
			try {
				inputStream.close();
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		return filePath;
	}
	
}
