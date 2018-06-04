package com.yeepay.dao.refundQuery.mapper;

import com.yeepay.dao.refundQuery.domain.RefundQuery;
import com.yeepay.dao.refundQuery.domain.RefundQueryExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface RefundQueryMapper {
    long countByExample(RefundQueryExample example);

    int deleteByExample(RefundQueryExample example);

    int insert(RefundQuery record);

    int insertSelective(RefundQuery record);

    List<RefundQuery> selectByExample(RefundQueryExample example);

    int updateByExampleSelective(@Param("record") RefundQuery record, @Param("example") RefundQueryExample example);

    int updateByExample(@Param("record") RefundQuery record, @Param("example") RefundQueryExample example);
}