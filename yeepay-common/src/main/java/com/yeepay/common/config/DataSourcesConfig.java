package com.yeepay.common.config;

import com.alibaba.druid.pool.DruidDataSource;
import org.apache.ibatis.session.SqlSessionFactory;
import org.mybatis.spring.SqlSessionFactoryBean;
import org.mybatis.spring.annotation.MapperScan;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.datasource.DataSourceTransactionManager;

import javax.sql.DataSource;

@Configuration
@MapperScan(basePackages = "com.acquiring.bx.dao", sqlSessionFactoryRef = "paySqlSessionFactory")
public class DataSourcesConfig {
    private static final Logger LOGGER = LoggerFactory.getLogger(DataSource.class);
    @Value("${master.pay.datasource.url}")
    private String dbUrl;
    @Value("${master.pay.datasource.username}")
    private String dbUser;
    @Value("${master.pay.datasource.password}")
    private String dbPassword;

    @Value("${spring.datasource.max-idle:80}")
    private Integer dataSourceMaxIdle;

    @Value("${spring.datasource.min-idle:5}")
    private Integer dataSourceMinIdle;

    @Value("${spring.datasource.max-wait:1000}")
    private Long dataSourceMaxWait;

    @Value("${spring.datasource.initial-size:5}")
    private Integer initialSize;

    @Bean(name = "payDataSource")
    public DataSource payDataSource() {
        DruidDataSource dataSource = new DruidDataSource();
        dataSource.setDriverClassName("com.mysql.jdbc.Driver");
        dataSource.setUrl(dbUrl);
        dataSource.setUsername(dbUser);
        dataSource.setPassword(dbPassword);
        dataSource.setMinIdle(dataSourceMinIdle);
        dataSource.setMaxWait(dataSourceMaxWait);
        dataSource.setMaxIdle(dataSourceMaxIdle);
        dataSource.setInitialSize(initialSize);
        dataSource.setMaxActive(dataSourceMaxIdle);
        return dataSource;
    }

    @Bean(name = "payTransactionManager")
    public DataSourceTransactionManager payTransactionManager() {
        return new DataSourceTransactionManager(payDataSource());
    }

    @Bean(name = "paySqlSessionFactory")
    public SqlSessionFactory paySqlSessionFactory(@Qualifier("payDataSource") DataSource payDataSource)
            throws Exception {
        LOGGER.info("======开始加载平台数据库配置=======");
        final SqlSessionFactoryBean sessionFactory = new SqlSessionFactoryBean();
        sessionFactory.setDataSource(payDataSource);
        return sessionFactory.getObject();
    }

}
