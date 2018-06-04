package com.yeepay.dao.settlementsQuery.mapper;

import com.yeepay.dao.settlementsQuery.domain.SettlementsQuery;
import com.yeepay.dao.settlementsQuery.domain.SettlementsQueryExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SettlementsQueryMapper {
    long countByExample(SettlementsQueryExample example);

    int deleteByExample(SettlementsQueryExample example);

    int insert(SettlementsQuery record);

    int insertSelective(SettlementsQuery record);

    List<SettlementsQuery> selectByExample(SettlementsQueryExample example);

    int updateByExampleSelective(@Param("record") SettlementsQuery record, @Param("example") SettlementsQueryExample example);

    int updateByExample(@Param("record") SettlementsQuery record, @Param("example") SettlementsQueryExample example);
}