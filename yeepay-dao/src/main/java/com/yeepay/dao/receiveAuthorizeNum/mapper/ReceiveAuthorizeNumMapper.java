package com.yeepay.dao.receiveAuthorizeNum.mapper;

import com.yeepay.dao.receiveAuthorizeNum.domain.ReceiveAuthorizeNum;
import com.yeepay.dao.receiveAuthorizeNum.domain.ReceiveAuthorizeNumExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ReceiveAuthorizeNumMapper {
    long countByExample(ReceiveAuthorizeNumExample example);

    int deleteByExample(ReceiveAuthorizeNumExample example);

    int insert(ReceiveAuthorizeNum record);

    int insertSelective(ReceiveAuthorizeNum record);

    List<ReceiveAuthorizeNum> selectByExample(ReceiveAuthorizeNumExample example);

    int updateByExampleSelective(@Param("record") ReceiveAuthorizeNum record, @Param("example") ReceiveAuthorizeNumExample example);

    int updateByExample(@Param("record") ReceiveAuthorizeNum record, @Param("example") ReceiveAuthorizeNumExample example);
}