package com.yeepay.dao.multiRefundQuery.mapper;

import com.yeepay.dao.multiRefundQuery.domain.MultiRefundQuery;
import com.yeepay.dao.multiRefundQuery.domain.MultiRefundQueryExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface MultiRefundQueryMapper {
    long countByExample(MultiRefundQueryExample example);

    int deleteByExample(MultiRefundQueryExample example);

    int insert(MultiRefundQuery record);

    int insertSelective(MultiRefundQuery record);

    List<MultiRefundQuery> selectByExample(MultiRefundQueryExample example);

    int updateByExampleSelective(@Param("record") MultiRefundQuery record, @Param("example") MultiRefundQueryExample example);

    int updateByExample(@Param("record") MultiRefundQuery record, @Param("example") MultiRefundQueryExample example);
}