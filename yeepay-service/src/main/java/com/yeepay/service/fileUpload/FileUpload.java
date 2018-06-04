package com.yeepay.service.fileUpload;

import com.yeepay.dao.fileUpload.FileUploadRequest;
import org.springframework.stereotype.Service;

import java.io.IOException;

@Service
public interface FileUpload {
    String fileUpload(FileUploadRequest request) throws IOException;
}
