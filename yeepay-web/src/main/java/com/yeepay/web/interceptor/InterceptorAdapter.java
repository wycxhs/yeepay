package com.yeepay.web.interceptor;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

@Configuration
public class InterceptorAdapter extends WebMvcConfigurerAdapter {
    private static final Logger LOGGER = LoggerFactory.getLogger(InterceptorAdapter.class);

    @Bean
    public Interceptor apiInterception() {
        return new Interceptor();
    }

    @Autowired
    Interceptor interceptor;

    @Override
    public void addInterceptors(InterceptorRegistry registry) {
        registry.addInterceptor(this.interceptor).addPathPatterns("/call/**").excludePathPatterns("/call/merchantEntryPublic").excludePathPatterns("/call/merchantEntryPrivate").excludePathPatterns("fileUpload");

    }

}
