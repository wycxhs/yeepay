package com.yeepay.common.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;

@Configuration
public class CommonConfig {
    @Value("${individual.notify.url}")
    public String individualNotifyUrl;
    @Value("${individual.business.notify.url}")
    public String individualBusinessNotifyUrl;
    @Value("${enterprise.notify.url}")
    public String enterpriseNotifyUrl;
    @Value("${trade.order.notify.url}")
    public String tradeOrderNotifyUrl;
    @Value("${trade.order.cs.url}")
    public String tradeOrderCsUrl;

}
