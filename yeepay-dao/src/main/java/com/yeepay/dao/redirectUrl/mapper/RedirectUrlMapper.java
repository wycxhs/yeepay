package com.yeepay.dao.redirectUrl.mapper;

import com.yeepay.dao.redirectUrl.domain.RedirectUrl;
import com.yeepay.dao.redirectUrl.domain.RedirectUrlExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface RedirectUrlMapper {
    long countByExample(RedirectUrlExample example);

    int deleteByExample(RedirectUrlExample example);

    int insert(RedirectUrl record);

    int insertSelective(RedirectUrl record);

    List<RedirectUrl> selectByExample(RedirectUrlExample example);

    int updateByExampleSelective(@Param("record") RedirectUrl record, @Param("example") RedirectUrlExample example);

    int updateByExample(@Param("record") RedirectUrl record, @Param("example") RedirectUrlExample example);
}