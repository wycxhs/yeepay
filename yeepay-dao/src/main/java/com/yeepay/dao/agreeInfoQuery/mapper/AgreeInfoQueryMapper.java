package com.yeepay.dao.agreeInfoQuery.mapper;

import com.yeepay.dao.agreeInfoQuery.domain.AgreeInfoQuery;
import com.yeepay.dao.agreeInfoQuery.domain.AgreeInfoQueryExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface AgreeInfoQueryMapper {
    long countByExample(AgreeInfoQueryExample example);

    int deleteByExample(AgreeInfoQueryExample example);

    int insert(AgreeInfoQuery record);

    int insertSelective(AgreeInfoQuery record);

    List<AgreeInfoQuery> selectByExample(AgreeInfoQueryExample example);

    int updateByExampleSelective(@Param("record") AgreeInfoQuery record, @Param("example") AgreeInfoQueryExample example);

    int updateByExample(@Param("record") AgreeInfoQuery record, @Param("example") AgreeInfoQueryExample example);
}