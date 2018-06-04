package com.yeepay.dao.payNotify.mapper;

import com.yeepay.dao.payNotify.domain.PayNotify;
import com.yeepay.dao.payNotify.domain.PayNotifyExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface PayNotifyMapper {
    long countByExample(PayNotifyExample example);

    int deleteByExample(PayNotifyExample example);

    int insert(PayNotify record);

    int insertSelective(PayNotify record);

    List<PayNotify> selectByExample(PayNotifyExample example);

    int updateByExampleSelective(@Param("record") PayNotify record, @Param("example") PayNotifyExample example);

    int updateByExample(@Param("record") PayNotify record, @Param("example") PayNotifyExample example);
}