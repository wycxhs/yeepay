package com.yeepay.dao.reconciliation.mapper;

import com.yeepay.dao.reconciliation.domain.Reconciliation;
import com.yeepay.dao.reconciliation.domain.ReconciliationExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ReconciliationMapper {
    long countByExample(ReconciliationExample example);

    int deleteByExample(ReconciliationExample example);

    int insert(Reconciliation record);

    int insertSelective(Reconciliation record);

    List<Reconciliation> selectByExample(ReconciliationExample example);

    int updateByExampleSelective(@Param("record") Reconciliation record, @Param("example") ReconciliationExample example);

    int updateByExample(@Param("record") Reconciliation record, @Param("example") ReconciliationExample example);
}