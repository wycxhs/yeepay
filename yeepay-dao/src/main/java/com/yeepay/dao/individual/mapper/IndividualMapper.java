package com.yeepay.dao.individual.mapper;

import com.yeepay.dao.individual.domain.Individual;
import com.yeepay.dao.individual.domain.IndividualExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface IndividualMapper {
    long countByExample(IndividualExample example);

    int deleteByExample(IndividualExample example);

    int insert(Individual record);

    int insertSelective(Individual record);

    List<Individual> selectByExample(IndividualExample example);

    int updateByExampleSelective(@Param("record") Individual record, @Param("example") IndividualExample example);

    int updateByExample(@Param("record") Individual record, @Param("example") IndividualExample example);
}