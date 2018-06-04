package com.yeepay.dao.fileUpload.mapper;

import com.yeepay.dao.fileUpload.domain.FileUpload;
import com.yeepay.dao.fileUpload.domain.FileUploadExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface FileUploadMapper {
    long countByExample(FileUploadExample example);

    int deleteByExample(FileUploadExample example);

    int insert(FileUpload record);

    int insertSelective(FileUpload record);

    List<FileUpload> selectByExampleWithBLOBs(FileUploadExample example);

    List<FileUpload> selectByExample(FileUploadExample example);

    int updateByExampleSelective(@Param("record") FileUpload record, @Param("example") FileUploadExample example);

    int updateByExampleWithBLOBs(@Param("record") FileUpload record, @Param("example") FileUploadExample example);

    int updateByExample(@Param("record") FileUpload record, @Param("example") FileUploadExample example);
}