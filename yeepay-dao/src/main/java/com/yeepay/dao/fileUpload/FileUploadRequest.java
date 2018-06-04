package com.yeepay.dao.fileUpload;

import org.hibernate.validator.constraints.NotEmpty;

import javax.validation.constraints.Size;

public class FileUploadRequest {
    @NotEmpty(message = "fileType不能为空")
    @Size(max = 128,message = "fileType数据异常")
    private String fileType;

    private String _file;

    public String getFileType() {
        return fileType;
    }

    public void setFileType(String fileType) {
        this.fileType = fileType;
    }

    public String get_file() {
        return _file;
    }

    public void set_file(String _file) {
        this._file = _file;
    }
}
