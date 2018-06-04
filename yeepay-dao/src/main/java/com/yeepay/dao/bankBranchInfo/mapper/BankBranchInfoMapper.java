package com.yeepay.dao.bankBranchInfo.mapper;

import com.yeepay.dao.bankBranchInfo.domain.BankBranchInfo;
import com.yeepay.dao.bankBranchInfo.domain.BankBranchInfoExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface BankBranchInfoMapper {
    long countByExample(BankBranchInfoExample example);

    int deleteByExample(BankBranchInfoExample example);

    int insert(BankBranchInfo record);

    int insertSelective(BankBranchInfo record);

    List<BankBranchInfo> selectByExample(BankBranchInfoExample example);

    int updateByExampleSelective(@Param("record") BankBranchInfo record, @Param("example") BankBranchInfoExample example);

    int updateByExample(@Param("record") BankBranchInfo record, @Param("example") BankBranchInfoExample example);
}