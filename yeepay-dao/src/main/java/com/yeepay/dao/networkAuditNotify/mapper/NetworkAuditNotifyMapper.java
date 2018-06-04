package com.yeepay.dao.networkAuditNotify.mapper;

import com.yeepay.dao.networkAuditNotify.domain.NetworkAuditNotify;
import com.yeepay.dao.networkAuditNotify.domain.NetworkAuditNotifyExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface NetworkAuditNotifyMapper {
    long countByExample(NetworkAuditNotifyExample example);

    int deleteByExample(NetworkAuditNotifyExample example);

    int insert(NetworkAuditNotify record);

    int insertSelective(NetworkAuditNotify record);

    List<NetworkAuditNotify> selectByExample(NetworkAuditNotifyExample example);

    int updateByExampleSelective(@Param("record") NetworkAuditNotify record, @Param("example") NetworkAuditNotifyExample example);

    int updateByExample(@Param("record") NetworkAuditNotify record, @Param("example") NetworkAuditNotifyExample example);
}