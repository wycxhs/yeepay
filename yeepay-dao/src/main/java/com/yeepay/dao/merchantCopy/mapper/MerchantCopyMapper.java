package com.yeepay.dao.merchantCopy.mapper;

import com.yeepay.dao.merchantCopy.domain.MerchantCopy;
import com.yeepay.dao.merchantCopy.domain.MerchantCopyExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface MerchantCopyMapper {
    long countByExample(MerchantCopyExample example);

    int deleteByExample(MerchantCopyExample example);

    int insert(MerchantCopy record);

    int insertSelective(MerchantCopy record);

    List<MerchantCopy> selectByExample(MerchantCopyExample example);

    int updateByExampleSelective(@Param("record") MerchantCopy record, @Param("example") MerchantCopyExample example);

    int updateByExample(@Param("record") MerchantCopy record, @Param("example") MerchantCopyExample example);
}