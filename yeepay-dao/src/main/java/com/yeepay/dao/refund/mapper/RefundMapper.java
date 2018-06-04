package com.yeepay.dao.refund.mapper;

import com.yeepay.dao.refund.domain.Refund;
import com.yeepay.dao.refund.domain.RefundExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface RefundMapper {
    long countByExample(RefundExample example);

    int deleteByExample(RefundExample example);

    int insert(Refund record);

    int insertSelective(Refund record);

    List<Refund> selectByExample(RefundExample example);

    int updateByExampleSelective(@Param("record") Refund record, @Param("example") RefundExample example);

    int updateByExample(@Param("record") Refund record, @Param("example") RefundExample example);
}