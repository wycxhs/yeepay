package com.yeepay.service.fileUpload.impl;

import com.yeepay.common.swith.ReturnCode;
import com.yeepay.common.utils.Base64Utils;
import com.yeepay.common.utils.JsonUtils;
import com.yeepay.dao.dealResult.DealResultFalse;
import com.yeepay.dao.fileUpload.FileUploadRequest;
import com.yeepay.dao.fileUpload.FileUploadResult;
import com.yeepay.service.file.StringToFile;
import com.yeepay.service.fileUpload.FileUpload;
import com.yeepay.service.fileUpload.db.FileUploadDb;
import com.yeepay.service.merchantNoDb.MerchantNoDb;
import com.yeepay.service.yeepay.YeepayService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.io.File;
import java.io.IOException;
import java.util.Map;

@Service
public class FileUploadImpl implements FileUpload {
    @Autowired
    MerchantNoDb merchantNoDb;

    @Autowired
    FileUploadDb fileUploadDb;

    @Autowired
    DealResultFalse dealResultFalse;

    @Autowired
    ReturnCode returnCode;

    @Override
    public String fileUpload(FileUploadRequest request) throws IOException {
        String decode = Base64Utils.decode(request.get_file());
        String path = "C:\\save";
        File fileFromBytes = StringToFile.getFileFromBytes(decode, path);
        request.set_file(path);
        Map<String,String> map = JsonUtils.toMap(request);
        String url = YeepayService.getUrl(YeepayService.UPLOAD_URL);
        Map<String, String> resultMap = YeepayService.requestYOP(map, url, YeepayService.UPLOAD);
        if(resultMap.get("returnCode").equals("REG00000")){
            FileUploadResult result = JsonUtils.toObj(JsonUtils.toJson(resultMap),FileUploadResult.class);
            fileUploadDb.fileUploadDb(request,result);
            return JsonUtils.toJson(result);
        }else{
            dealResultFalse.setReturnCode(returnCode.code(resultMap.get("returnCode")));
            dealResultFalse.setReturnMsg(resultMap.get("returnMsg"));
            return JsonUtils.toJson(dealResultFalse);
        }
    }
}
