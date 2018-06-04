package com.yeepay.dao.cashier.mapper;

import com.yeepay.dao.cashier.domain.Cashier;
import com.yeepay.dao.cashier.domain.CashierExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface CashierMapper {
    long countByExample(CashierExample example);

    int deleteByExample(CashierExample example);

    int insert(Cashier record);

    int insertSelective(Cashier record);

    List<Cashier> selectByExample(CashierExample example);

    int updateByExampleSelective(@Param("record") Cashier record, @Param("example") CashierExample example);

    int updateByExample(@Param("record") Cashier record, @Param("example") CashierExample example);
}