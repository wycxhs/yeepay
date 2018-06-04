package com.yeepay.dao.hmackeyQuery.mapper;

import com.yeepay.dao.hmackeyQuery.domain.HmackeyQuery;
import com.yeepay.dao.hmackeyQuery.domain.HmackeyQueryExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface HmackeyQueryMapper {
    long countByExample(HmackeyQueryExample example);

    int deleteByExample(HmackeyQueryExample example);

    int insert(HmackeyQuery record);

    int insertSelective(HmackeyQuery record);

    List<HmackeyQuery> selectByExample(HmackeyQueryExample example);

    int updateByExampleSelective(@Param("record") HmackeyQuery record, @Param("example") HmackeyQueryExample example);

    int updateByExample(@Param("record") HmackeyQuery record, @Param("example") HmackeyQueryExample example);
}