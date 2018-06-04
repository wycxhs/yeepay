package com.yeepay.dao.sendAuthorizeNum.mapper;

import com.yeepay.dao.sendAuthorizeNum.domain.SendAuthorizeNum;
import com.yeepay.dao.sendAuthorizeNum.domain.SendAuthorizeNumExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SendAuthorizeNumMapper {
    long countByExample(SendAuthorizeNumExample example);

    int deleteByExample(SendAuthorizeNumExample example);

    int insert(SendAuthorizeNum record);

    int insertSelective(SendAuthorizeNum record);

    List<SendAuthorizeNum> selectByExample(SendAuthorizeNumExample example);

    int updateByExampleSelective(@Param("record") SendAuthorizeNum record, @Param("example") SendAuthorizeNumExample example);

    int updateByExample(@Param("record") SendAuthorizeNum record, @Param("example") SendAuthorizeNumExample example);
}