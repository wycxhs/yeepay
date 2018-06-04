package com.yeepay.dao.divideQuery.mapper;

import com.yeepay.dao.divideQuery.domain.DivideQuery;
import com.yeepay.dao.divideQuery.domain.DivideQueryExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface DivideQueryMapper {
    long countByExample(DivideQueryExample example);

    int deleteByExample(DivideQueryExample example);

    int insert(DivideQuery record);

    int insertSelective(DivideQuery record);

    List<DivideQuery> selectByExample(DivideQueryExample example);

    int updateByExampleSelective(@Param("record") DivideQuery record, @Param("example") DivideQueryExample example);

    int updateByExample(@Param("record") DivideQuery record, @Param("example") DivideQueryExample example);
}