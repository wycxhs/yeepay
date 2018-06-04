package com.yeepay.dao.balanceQuery.mapper;

import com.yeepay.dao.balanceQuery.domain.BalanceQuery;
import com.yeepay.dao.balanceQuery.domain.BalanceQueryExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface BalanceQueryMapper {
    long countByExample(BalanceQueryExample example);

    int deleteByExample(BalanceQueryExample example);

    int insert(BalanceQuery record);

    int insertSelective(BalanceQuery record);

    List<BalanceQuery> selectByExample(BalanceQueryExample example);

    int updateByExampleSelective(@Param("record") BalanceQuery record, @Param("example") BalanceQueryExample example);

    int updateByExample(@Param("record") BalanceQuery record, @Param("example") BalanceQueryExample example);
}