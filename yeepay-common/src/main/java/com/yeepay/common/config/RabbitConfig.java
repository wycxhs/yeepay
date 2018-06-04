package com.yeepay.common.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;

@Configuration
public class RabbitConfig {
    @Value("${host}")
    public String host;
    @Value("${direct.exchanges}")
    public String directExchanges;
    @Value("${dead.letter.routing}")
    public String deadLetterRouting;
    @Value("${dead.letter.queue.name}")
    public String deadLetterQueueName;
    @Value("${delay.queue}")
    public String delayQueue;
}
