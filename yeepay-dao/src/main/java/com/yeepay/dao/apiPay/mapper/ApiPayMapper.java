package com.yeepay.dao.apiPay.mapper;

import com.yeepay.dao.apiPay.domain.ApiPay;
import com.yeepay.dao.apiPay.domain.ApiPayExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ApiPayMapper {
    long countByExample(ApiPayExample example);

    int deleteByExample(ApiPayExample example);

    int insert(ApiPay record);

    int insertSelective(ApiPay record);

    List<ApiPay> selectByExample(ApiPayExample example);

    int updateByExampleSelective(@Param("record") ApiPay record, @Param("example") ApiPayExample example);

    int updateByExample(@Param("record") ApiPay record, @Param("example") ApiPayExample example);
}