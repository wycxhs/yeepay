package com.yeepay.dao.orderClose.mapper;

import com.yeepay.dao.orderClose.domain.OrderClose;
import com.yeepay.dao.orderClose.domain.OrderCloseExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface OrderCloseMapper {
    long countByExample(OrderCloseExample example);

    int deleteByExample(OrderCloseExample example);

    int insert(OrderClose record);

    int insertSelective(OrderClose record);

    List<OrderClose> selectByExample(OrderCloseExample example);

    int updateByExampleSelective(@Param("record") OrderClose record, @Param("example") OrderCloseExample example);

    int updateByExample(@Param("record") OrderClose record, @Param("example") OrderCloseExample example);
}