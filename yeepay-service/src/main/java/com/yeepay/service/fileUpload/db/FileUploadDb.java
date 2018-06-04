package com.yeepay.service.fileUpload.db;

import com.yeepay.dao.fileUpload.FileUploadRequest;
import com.yeepay.dao.fileUpload.FileUploadResult;
import org.springframework.stereotype.Service;

@Service
public interface FileUploadDb {
    void fileUploadDb(FileUploadRequest request, FileUploadResult result);
}
