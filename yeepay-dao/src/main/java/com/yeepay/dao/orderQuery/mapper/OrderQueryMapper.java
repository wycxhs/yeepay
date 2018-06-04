package com.yeepay.dao.orderQuery.mapper;

import com.yeepay.dao.orderQuery.domain.OrderQuery;
import com.yeepay.dao.orderQuery.domain.OrderQueryExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface OrderQueryMapper {
    long countByExample(OrderQueryExample example);

    int deleteByExample(OrderQueryExample example);

    int insert(OrderQuery record);

    int insertSelective(OrderQuery record);

    List<OrderQuery> selectByExample(OrderQueryExample example);

    int updateByExampleSelective(@Param("record") OrderQuery record, @Param("example") OrderQueryExample example);

    int updateByExample(@Param("record") OrderQuery record, @Param("example") OrderQueryExample example);
}