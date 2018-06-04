package com.yeepay.dao.csNotify.mapper;

import com.yeepay.dao.csNotify.domain.CsNotify;
import com.yeepay.dao.csNotify.domain.CsNotifyExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface CsNotifyMapper {
    long countByExample(CsNotifyExample example);

    int deleteByExample(CsNotifyExample example);

    int insert(CsNotify record);

    int insertSelective(CsNotify record);

    List<CsNotify> selectByExample(CsNotifyExample example);

    int updateByExampleSelective(@Param("record") CsNotify record, @Param("example") CsNotifyExample example);

    int updateByExample(@Param("record") CsNotify record, @Param("example") CsNotifyExample example);
}