package com.yeepay.dao.merProductFeeUpdate.mapper;

import com.yeepay.dao.merProductFeeUpdate.domain.MerProductFeeUpdate;
import com.yeepay.dao.merProductFeeUpdate.domain.MerProductFeeUpdateExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface MerProductFeeUpdateMapper {
    long countByExample(MerProductFeeUpdateExample example);

    int deleteByExample(MerProductFeeUpdateExample example);

    int insert(MerProductFeeUpdate record);

    int insertSelective(MerProductFeeUpdate record);

    List<MerProductFeeUpdate> selectByExample(MerProductFeeUpdateExample example);

    int updateByExampleSelective(@Param("record") MerProductFeeUpdate record, @Param("example") MerProductFeeUpdateExample example);

    int updateByExample(@Param("record") MerProductFeeUpdate record, @Param("example") MerProductFeeUpdateExample example);
}