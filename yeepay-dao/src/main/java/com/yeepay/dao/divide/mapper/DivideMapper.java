package com.yeepay.dao.divide.mapper;

import com.yeepay.dao.divide.domain.Divide;
import com.yeepay.dao.divide.domain.DivideExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface DivideMapper {
    long countByExample(DivideExample example);

    int deleteByExample(DivideExample example);

    int insert(Divide record);

    int insertSelective(Divide record);

    List<Divide> selectByExampleWithBLOBs(DivideExample example);

    List<Divide> selectByExample(DivideExample example);

    int updateByExampleSelective(@Param("record") Divide record, @Param("example") DivideExample example);

    int updateByExampleWithBLOBs(@Param("record") Divide record, @Param("example") DivideExample example);

    int updateByExample(@Param("record") Divide record, @Param("example") DivideExample example);
}