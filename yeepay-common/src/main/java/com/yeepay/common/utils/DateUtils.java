package com.yeepay.common.utils;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DateUtils {

    private static final Logger LOGGER = LoggerFactory.getLogger(DateUtils.class);

    public interface TIMESTAMP {
        public static final long SECONDS_MINUTE = 60;
        public static final long SECONDS_HOUR = 60 * SECONDS_MINUTE;
        public static final long SECONDS_DAY = 86400;

        public static final long MILLIS_SECOND = 1000;
        public static final long MILLIS_MINUTE = SECONDS_MINUTE * MILLIS_SECOND;
        public static final long MILLIS_HOUR = SECONDS_HOUR * MILLIS_SECOND;
        public static final long MILLIS_DAY = SECONDS_DAY * MILLIS_SECOND;

        public static final long HOURS_TIMEZONE = 8;
        public static final long SECONDS_TIMEZONE = HOURS_TIMEZONE * 3600;
        public static final long MILLIS_TIMEZONE = SECONDS_TIMEZONE * MILLIS_SECOND;
    }

    /**
     * 日期格式常量
     *
     * @author yahets
     */
    public interface FMT {
        public static final String YYYY_MM_DD_HH_MM_SS = "yyyy-MM-dd HH:mm:ss";
        public static final String YYYY_SALASH_MM_SLASH_DD_HH_MM_SS = "yyyy/MM/dd HH:mm:ss";
        public static final String YYYY_MM_DD = "yyyy-MM-dd";
        public static final String YYYYMMDDHH_MM_SS = "yyyyMMdd HH:mm:ss";
        public static final String YYYYMMDD = "yyyyMMdd";
        public static final String HH_MM_SS = "HH:mm:ss";
        public static final String YYYYMMDDHHMMSS = "yyyyMMddHHmmss";
        public static final String YYMMDDHHMMSS = "yyMMddHHmmss";
        public static final String SALASH_ALL = "yyyy/MM/dd/HH/mm/ss/";
    }

    public static Integer wbDateToUnixTimestampS(String wbDate) {
        return Integer.parseInt(String.valueOf(DateUtils.dateToUnixTimestamp(wbDate, FMT.YYYY_MM_DD_HH_MM_SS) / 1000));
    }

    /**
     * 将指定的日期转换成Unix时间戳
     *
     * @return long 时间戳
     */
    public static long dateToUnixTimestamp(String date, String dateFormat) {
        long timestamp = 0;
        try {
            timestamp = new SimpleDateFormat(dateFormat).parse(date).getTime();
        } catch (ParseException e) {
            e.printStackTrace();
        }
        return timestamp;
    }

    /**
     * 将当前日期转换成Unix时间戳
     *
     * @return long 时间戳
     */
    public static long dateToUnixTimestamp() {
        long timestamp = new Date().getTime();
        return timestamp;
    }

    /**
     * 字符串转化成date
     *
     * @param str
     * @param format
     * @return
     */
    public static Date strToDate(String str, String format) {
        Date theDate = null;
        try {
            if (str != null) {
                SimpleDateFormat dateFormatter = new SimpleDateFormat(format);
                theDate = dateFormatter.parse(str);
            } else {
                theDate = null;
            }
        } catch (ParseException pe) {
            theDate = null;
        }
        return theDate;

    }

    public static String dateToStr(Date date, String format) {
        try {
            SimpleDateFormat df = new SimpleDateFormat(format);
            return df.format(date);
        } catch (Exception e) {
            LOGGER.error("转义日期格式异常:", e);
        }
        return null;

    }

    /**
     * 获取当前的[毫]秒数：绝对时间、时区时间
     */
    public static long currTimestampMs() {
        return System.currentTimeMillis();
    }

    /**
     * 获取精确到秒的时间戳
     *
     * @return
     */
    public static int currTimestampS() {
        String timestamp = String.valueOf(currTimestampMs() / 1000);
        return Integer.valueOf(timestamp);
    }

    public static Integer dateToTimestampS(Date date) {
        String timestamp = String.valueOf(date.getTime() / 1000);
        return Integer.valueOf(timestamp);
    }

    public static Date timestampSToDate(Integer timestampS) {
        return new Date(timestampS * 1000L);
    }

    public static void main(String[] args) {
        String str = dateToStr(new Date(), DateUtils.FMT.YYMMDDHHMMSS);
        System.out.println(str);
    }

}