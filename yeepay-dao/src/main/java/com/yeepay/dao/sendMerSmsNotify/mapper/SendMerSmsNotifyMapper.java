package com.yeepay.dao.sendMerSmsNotify.mapper;

import com.yeepay.dao.sendMerSmsNotify.domain.SendMerSmsNotify;
import com.yeepay.dao.sendMerSmsNotify.domain.SendMerSmsNotifyExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SendMerSmsNotifyMapper {
    long countByExample(SendMerSmsNotifyExample example);

    int deleteByExample(SendMerSmsNotifyExample example);

    int insert(SendMerSmsNotify record);

    int insertSelective(SendMerSmsNotify record);

    List<SendMerSmsNotify> selectByExample(SendMerSmsNotifyExample example);

    int updateByExampleSelective(@Param("record") SendMerSmsNotify record, @Param("example") SendMerSmsNotifyExample example);

    int updateByExample(@Param("record") SendMerSmsNotify record, @Param("example") SendMerSmsNotifyExample example);
}