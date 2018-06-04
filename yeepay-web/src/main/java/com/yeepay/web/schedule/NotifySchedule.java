//package com.yeepay.web.schedule;
//
//import com.acquiring.bx.common.redis.RedisKeyUtils;
//import com.acquiring.bx.common.redis.RedisService;
//import com.acquiring.bx.common.utils.DateUtils;
//import org.slf4j.Logger;
//import org.slf4j.LoggerFactory;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.data.redis.core.ZSetOperations;
//import org.springframework.scheduling.annotation.Scheduled;
//import org.springframework.stereotype.Component;
//
//import java.util.Set;
//
//@Component
//public class NotifySchedule {
//    private static final Logger LOGGER = LoggerFactory.getLogger(NotifySchedule.class);
//
//    @Autowired
//    RedisService redisService;
//
//    @Scheduled(fixedDelay = 5000)
//    public void notifyDelay() {
//        notifyByKey(RedisKeyUtils.genBBAccountCompanyNotify(), RedisKeyUtils.genBBAccountCompanyNotifyDelay());
//    }
//
//    public void notifyByKey(String key, String delayKey) {
//        int s = DateUtils.currTimestampS();
//        long start = s - 1;
//        long end = s + 1;
//        Set<ZSetOperations.TypedTuple<String>> tuples = this.redisService.getZSetSortWithScore(delayKey, start, end);
//        this.redisService.removeZSetSortWithScore(delayKey, start, end);
//        for (ZSetOperations.TypedTuple<String> tuple : tuples) {
//            String value = tuple.getValue();
//            LOGGER.info("开始通知回调@{}", value);
//            this.redisService.convertAndSend(key, value);
//        }
//    }
//
//}
