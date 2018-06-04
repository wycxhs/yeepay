package com.yeepay.dao.merSettleInfoUpdate.mapper;

import com.yeepay.dao.merSettleInfoUpdate.domain.MerSettleInfoUpdate;
import com.yeepay.dao.merSettleInfoUpdate.domain.MerSettleInfoUpdateExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface MerSettleInfoUpdateMapper {
    long countByExample(MerSettleInfoUpdateExample example);

    int deleteByExample(MerSettleInfoUpdateExample example);

    int insert(MerSettleInfoUpdate record);

    int insertSelective(MerSettleInfoUpdate record);

    List<MerSettleInfoUpdate> selectByExample(MerSettleInfoUpdateExample example);

    int updateByExampleSelective(@Param("record") MerSettleInfoUpdate record, @Param("example") MerSettleInfoUpdateExample example);

    int updateByExample(@Param("record") MerSettleInfoUpdate record, @Param("example") MerSettleInfoUpdateExample example);
}