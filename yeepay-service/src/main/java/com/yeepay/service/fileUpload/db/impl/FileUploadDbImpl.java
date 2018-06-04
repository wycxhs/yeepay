package com.yeepay.service.fileUpload.db.impl;

import com.yeepay.common.utils.JsonUtils;
import com.yeepay.dao.fileUpload.FileUploadRequest;
import com.yeepay.dao.fileUpload.FileUploadResult;
import com.yeepay.dao.fileUpload.domain.FileUpload;
import com.yeepay.dao.fileUpload.mapper.FileUploadMapper;
import com.yeepay.service.fileUpload.db.FileUploadDb;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class FileUploadDbImpl implements FileUploadDb {

    @Autowired
    FileUploadMapper fileUploadMapper;

    @Override
    public void fileUploadDb(FileUploadRequest request, FileUploadResult result) {
        FileUpload fileUpload = new FileUpload();
        fileUpload.setFile(request.get_file());
        fileUpload.setFileType(request.getFileType());
        fileUpload = JsonUtils.toObj(JsonUtils.toJson(result),FileUpload.class);
        fileUploadMapper.insertSelective(fileUpload);
    }
}
