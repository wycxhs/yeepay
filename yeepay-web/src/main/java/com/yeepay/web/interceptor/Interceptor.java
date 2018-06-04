package com.yeepay.web.interceptor;



import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.*;

public class Interceptor implements HandlerInterceptor {


    private static final Logger LOGGER = LoggerFactory.getLogger(Interceptor.class);

    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler){
        Map<String, String> paramMap = this.handleRequestParam(request);

            return true;
    }

    @Override
    public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler,
                           ModelAndView modelAndView) throws Exception {
    }

    @Override
    public void afterCompletion(HttpServletRequest request, HttpServletResponse response, Object handler, Exception ex)
            throws Exception {
    }

//    protected void resp(HttpServletResponse response, String responseJson) {
//        LOGGER.trace("AgentRequestInterceptor：responseOutWithJson");
//        response.setCharacterEncoding("UTF-8");
//        response.setContentType("application/json;charset=utf-8");
//        PrintWriter out = null;
//        try {
//            out = response.getWriter();
//            out.append(responseJson);
//            LOGGER.info("返回数据为@{}", responseJson);
//        } catch (IOException e) {
//            LOGGER.error("处理接口响应数据发生未知异常", e);
//        } finally {
//            out.flush();
//            out.close();
//        }
//    }

    /**
     * 获取必填参数
     *
     * @param httpServletRequest
     * @return
     */
    public Map<String, String> handleRequestParam(HttpServletRequest httpServletRequest) {
        Map<String, String> paramMap = new HashMap<String, String>();
        Enumeration<String> paramNames = httpServletRequest.getParameterNames();
        if (paramNames != null) {
            for (Enumeration<String> e = paramNames; e.hasMoreElements(); ) {
                String paramName = e.nextElement();
                String paramValue = httpServletRequest.getParameter(paramName);
                paramMap.put(paramName, paramValue);
            }
        }

        return paramMap;
    }

//    /**
//     * 校验签名
//     *
//     * @param paramMap
//     * @return
//     */
//    public boolean signVerify(Map<String, String> paramMap, String sign) {
//        String appId = paramMap.get("appId");
//        MerchantWalletExample example = new MerchantWalletExample();
//        example.createCriteria().andAppIdEqualTo(appId);
//        JsonResult jsonResult = merchantWalletService.query(example);
//        if (jsonResult.getCode() != ResultEnums.OK.getCode()) {
//            return false;
//        }
//        MerchantWallet merchantWallet = (MerchantWallet) jsonResult.getData();
//        return SignUtils.signVeryfy(paramMap, sign, merchantWallet.getAppKey());
//    }

}
