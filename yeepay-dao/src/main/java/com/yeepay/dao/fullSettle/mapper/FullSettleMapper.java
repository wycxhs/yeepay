package com.yeepay.dao.fullSettle.mapper;

import com.yeepay.dao.fullSettle.domain.FullSettle;
import com.yeepay.dao.fullSettle.domain.FullSettleExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface FullSettleMapper {
    long countByExample(FullSettleExample example);

    int deleteByExample(FullSettleExample example);

    int insert(FullSettle record);

    int insertSelective(FullSettle record);

    List<FullSettle> selectByExample(FullSettleExample example);

    int updateByExampleSelective(@Param("record") FullSettle record, @Param("example") FullSettleExample example);

    int updateByExample(@Param("record") FullSettle record, @Param("example") FullSettleExample example);
}