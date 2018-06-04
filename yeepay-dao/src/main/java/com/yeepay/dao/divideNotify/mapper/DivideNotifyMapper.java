package com.yeepay.dao.divideNotify.mapper;

import com.yeepay.dao.divideNotify.domain.DivideNotify;
import com.yeepay.dao.divideNotify.domain.DivideNotifyExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface DivideNotifyMapper {
    long countByExample(DivideNotifyExample example);

    int deleteByExample(DivideNotifyExample example);

    int insert(DivideNotify record);

    int insertSelective(DivideNotify record);

    List<DivideNotify> selectByExample(DivideNotifyExample example);

    int updateByExampleSelective(@Param("record") DivideNotify record, @Param("example") DivideNotifyExample example);

    int updateByExample(@Param("record") DivideNotify record, @Param("example") DivideNotifyExample example);
}