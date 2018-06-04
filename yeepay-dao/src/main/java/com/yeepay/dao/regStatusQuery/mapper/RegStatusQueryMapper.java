package com.yeepay.dao.regStatusQuery.mapper;

import com.yeepay.dao.regStatusQuery.domain.RegStatusQuery;
import com.yeepay.dao.regStatusQuery.domain.RegStatusQueryExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface RegStatusQueryMapper {
    long countByExample(RegStatusQueryExample example);

    int deleteByExample(RegStatusQueryExample example);

    int insert(RegStatusQuery record);

    int insertSelective(RegStatusQuery record);

    List<RegStatusQuery> selectByExample(RegStatusQueryExample example);

    int updateByExampleSelective(@Param("record") RegStatusQuery record, @Param("example") RegStatusQueryExample example);

    int updateByExample(@Param("record") RegStatusQuery record, @Param("example") RegStatusQueryExample example);
}