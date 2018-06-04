package com.yeepay.dao.authorizeUrlQuery.mapper;

import com.yeepay.dao.authorizeUrlQuery.domain.AuthorizeUrlQuery;
import com.yeepay.dao.authorizeUrlQuery.domain.AuthorizeUrlQueryExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface AuthorizeUrlQueryMapper {
    long countByExample(AuthorizeUrlQueryExample example);

    int deleteByExample(AuthorizeUrlQueryExample example);

    int insert(AuthorizeUrlQuery record);

    int insertSelective(AuthorizeUrlQuery record);

    List<AuthorizeUrlQuery> selectByExample(AuthorizeUrlQueryExample example);

    int updateByExampleSelective(@Param("record") AuthorizeUrlQuery record, @Param("example") AuthorizeUrlQueryExample example);

    int updateByExample(@Param("record") AuthorizeUrlQuery record, @Param("example") AuthorizeUrlQueryExample example);
}