package com.yeepay.common.utils;

import redis.clients.jedis.*;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class RedisUtils implements Serializable {
    private static final long serialVersionUID = 1000;

    private static String addr;

    private static int port;

//  密码
    private static String auth;

//  可连接实例的最大数目,默认为8,-1标识不限制
    private static int maxAxtive;

//  最多有多少个空闲的实例
    private static int maxIdle;

//  等待链接的最大时间,-1表示永不超时
    private static int maxWait;

    private static int timeOut;

//在borrow一个jedis实例时，是否提前进行validate操作；如果为true，则得到的jedis实例均是可用的；
    private static boolean testOnBorrow;

    private static Jedis jedis; //非切片额客户端连接

    private static JedisPool jedisPool; //非切片连接池

    private static ShardedJedis shardedJedis; //切片额客户端连接

    private static ShardedJedisPool shardedJedisPool; //切片连接池

    /*
    初始化非切片池
     */
    private static void initialPool(){
        //池基本配置
        JedisPoolConfig config = new JedisPoolConfig();
        config.setMaxTotal(maxAxtive);
        config.setMaxIdle(maxIdle);
        config.setMaxWaitMillis(maxWait);
        config.setTestOnBorrow(testOnBorrow);
        jedisPool = new JedisPool(config,addr,port);
    }

    /*
    初始化切片池
     */
    private static void initialShardedPool(){
        //池基本配置
        JedisPoolConfig config = new JedisPoolConfig();
        config.setMaxTotal(maxAxtive);
        config.setMaxIdle(maxIdle);
        config.setMaxWaitMillis(maxWait);
        config.setTestOnBorrow(testOnBorrow);
        //slave链接
        List<JedisShardInfo> shards = new ArrayList<JedisShardInfo>();
        shards.add(new JedisShardInfo(addr,port,auth));
        //构造池
        shardedJedisPool = new ShardedJedisPool(config,shards);
    }

    public static void afterPropertiesSet(){
        initialPool();
        initialShardedPool();
        shardedJedis = shardedJedisPool.getResource();
        jedis = jedisPool.getResource();
    }

    public static long getSerialVersionUID() {
        return serialVersionUID;
    }

    public static String getAddr() {
        return addr;
    }

    public static void setAddr(String addr) {
        RedisUtils.addr = addr;
    }

    public static int getPort() {
        return port;
    }

    public static void setPort(int port) {
        RedisUtils.port = port;
    }

    public static String getAuth() {
        return auth;
    }

    public static void setAuth(String auth) {
        RedisUtils.auth = auth;
    }

    public static int getMaxAxtive() {
        return maxAxtive;
    }

    public static void setMaxAxtive(int maxAxtive) {
        RedisUtils.maxAxtive = maxAxtive;
    }

    public static int getMaxIdle() {
        return maxIdle;
    }

    public static void setMaxIdle(int maxIdle) {
        RedisUtils.maxIdle = maxIdle;
    }

    public static int getMaxWait() {
        return maxWait;
    }

    public static void setMaxWait(int maxWait) {
        RedisUtils.maxWait = maxWait;
    }

    public static int getTimeOut() {
        return timeOut;
    }

    public static void setTimeOut(int timeOut) {
        RedisUtils.timeOut = timeOut;
    }

    public static boolean isTestOnBorrow() {
        return testOnBorrow;
    }

    public static void setTestOnBorrow(boolean testOnBorrow) {
        RedisUtils.testOnBorrow = testOnBorrow;
    }
}


