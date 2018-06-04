package com.yeepay.dao.individualBussiness.mapper;

import com.yeepay.dao.individualBussiness.domain.IndividualBussiness;
import com.yeepay.dao.individualBussiness.domain.IndividualBussinessExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface IndividualBussinessMapper {
    long countByExample(IndividualBussinessExample example);

    int deleteByExample(IndividualBussinessExample example);

    int insert(IndividualBussiness record);

    int insertSelective(IndividualBussiness record);

    List<IndividualBussiness> selectByExample(IndividualBussinessExample example);

    int updateByExampleSelective(@Param("record") IndividualBussiness record, @Param("example") IndividualBussinessExample example);

    int updateByExample(@Param("record") IndividualBussiness record, @Param("example") IndividualBussinessExample example);
}