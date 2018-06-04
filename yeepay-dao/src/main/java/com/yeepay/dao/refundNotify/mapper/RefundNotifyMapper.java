package com.yeepay.dao.refundNotify.mapper;

import com.yeepay.dao.refundNotify.domain.RefundNotify;
import com.yeepay.dao.refundNotify.domain.RefundNotifyExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface RefundNotifyMapper {
    long countByExample(RefundNotifyExample example);

    int deleteByExample(RefundNotifyExample example);

    int insert(RefundNotify record);

    int insertSelective(RefundNotify record);

    List<RefundNotify> selectByExample(RefundNotifyExample example);

    int updateByExampleSelective(@Param("record") RefundNotify record, @Param("example") RefundNotifyExample example);

    int updateByExample(@Param("record") RefundNotify record, @Param("example") RefundNotifyExample example);
}