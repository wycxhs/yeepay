package com.yeepay.web.controller;

import com.yeepay.common.utils.JsonUtils;
import com.yeepay.dao.agreeInfoQuery.AgreeInfoQueryRequest;
import com.yeepay.dao.authorizeUrlQuery.AuthorizeUrlQueryRequest;
import com.yeepay.dao.balanceQuery.BalanceQueryRequest;
import com.yeepay.dao.bankBranchInfo.BankBranchInfoRequest;
import com.yeepay.dao.dealResult.DealResultFalse;
import com.yeepay.dao.enterprise.EnterprisePost;
import com.yeepay.dao.enterprise.EnterpriseRequest;
import com.yeepay.dao.fileUpload.FileUploadRequest;
import com.yeepay.dao.hmackeyQuery.HmackeyQueryRequest;
import com.yeepay.dao.individual.IndividualPost;
import com.yeepay.dao.individual.IndividualRequest;
import com.yeepay.dao.individualBussiness.IndividualBusinessPost;
import com.yeepay.dao.individualBussiness.IndividualBusinessRequest;
import com.yeepay.dao.merProductFeeUpdate.MerProductFeeUpdateRequest;
import com.yeepay.dao.merSettleInfoUpdate.MerSettleInfoUpdateRequest;
import com.yeepay.dao.receiveAuthorizeNum.ReceiveAuthorizeNumRequest;
import com.yeepay.dao.regStatusQuery.RegStatusQueryRequest;
import com.yeepay.dao.sendAuthorizeNum.SendAuthorizeNumRequest;
import com.yeepay.dao.sendMerSmsNotify.SendMerSmsNotifyRequest;
import com.yeepay.service.agreeInfoQuery.AgreeInfoQuery;
import com.yeepay.service.authorizeUrlQuery.AuthorizeUrlQuery;
import com.yeepay.service.balanceQuery.BalanceQuery;
import com.yeepay.service.bankBranchInfo.BankBranchInfo;
import com.yeepay.service.enterprise.Enterprise;
import com.yeepay.service.fileUpload.FileUpload;
import com.yeepay.service.hmackeyQuery.HmackeyQuery;
import com.yeepay.service.individual.Individual;
import com.yeepay.service.individualBusiness.IndividualBusiness;
import com.yeepay.service.merProductFeeUpdate.MerProductFeeUpdate;
import com.yeepay.service.merSettleInfoUpdate.MerSettleInfoUpdate;
import com.yeepay.service.merchantNoDb.MerchantNoDb;
import com.yeepay.service.receiveAuthorizeNum.ReceiveAuthorizeNum;
import com.yeepay.service.regStatusQuery.RegStatusQuery;
import com.yeepay.service.sendAuthorizeNum.SendAuthorizeNum;
import com.yeepay.service.sendMerSmsNotify.SendMerSmsNotify;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.validation.ObjectError;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import javax.validation.Valid;
import java.io.IOException;
import java.util.List;

@Controller
@RequestMapping("provider/yeepay")
public class CallController {
    @Autowired
    DealResultFalse dealResultFalse;
    @Autowired
    MerchantNoDb merchantNoDb;
    @Autowired
    AgreeInfoQuery agreeInfoQuery;
    @Autowired
    Individual individual;
    @Autowired
    IndividualBusiness individualBusiness;
    @Autowired
    Enterprise enterprise;
    @Autowired
    SendAuthorizeNum sendAuthorizeNum;
    @Autowired
    BankBranchInfo bankBranchInfo;
    @Autowired
    MerProductFeeUpdate merProductFeeUpdate;
    @Autowired
    SendMerSmsNotify sendMerSmsNotify;
    @Autowired
    MerSettleInfoUpdate merSettleInfoUpdate;
    @Autowired
    RegStatusQuery regStatusQuery;
    @Autowired
    BalanceQuery balanceQuery;
    @Autowired
    HmackeyQuery hmackeyQuery;
    @Autowired
    FileUpload fileUpload;
    @Autowired
    AuthorizeUrlQuery authorizeUrlQuery;
    @Autowired
    ReceiveAuthorizeNum receiveAuthorizeNum;


    @RequestMapping("agreeInfoQuery")
    @ResponseBody
    public String agreeInQueryCall(@Valid AgreeInfoQueryRequest request, BindingResult bindingResult) throws IOException {
        if(bindingResult.hasErrors()){
            List<ObjectError> errorList = bindingResult.getAllErrors();
            dealResultFalse.setReturnCode("请求失败");
            dealResultFalse.setReturnMsg(errorList.get(0).getDefaultMessage());
            return JsonUtils.toJson(dealResultFalse);
        }
        return agreeInfoQuery.agreeInfoQuery(request);
    }

    @RequestMapping("individual")
    @ResponseBody
    public String individualCall(@Valid IndividualPost request, BindingResult bindingResult) throws IOException {
        if(bindingResult.hasErrors()){
            List<ObjectError> errorList = bindingResult.getAllErrors();
            dealResultFalse.setReturnCode("请求失败");
            dealResultFalse.setReturnMsg(errorList.get(0).getDefaultMessage());
            return JsonUtils.toJson(dealResultFalse);
        }
        return individual.individual(request);
    }

    @RequestMapping("individualBusiness")
    @ResponseBody
    public String individualBusinessCall(@Valid IndividualBusinessPost request, BindingResult bindingResult) throws IOException {
        if(bindingResult.hasErrors()){
            List<ObjectError> errorList = bindingResult.getAllErrors();
            dealResultFalse.setReturnCode("请求失败");
            dealResultFalse.setReturnMsg(errorList.get(0).getDefaultMessage());
            return JsonUtils.toJson(dealResultFalse);
        }
        return individualBusiness.individualBusiness(request);
    }
    @RequestMapping("enterprise")
    @ResponseBody
    public String enterpriseCall(@Valid EnterprisePost request, BindingResult bindingResult) throws IOException {
        if(bindingResult.hasErrors()){
            List<ObjectError> errorList = bindingResult.getAllErrors();
            dealResultFalse.setReturnCode("请求失败");
            dealResultFalse.setReturnMsg(errorList.get(0).getDefaultMessage());
            return JsonUtils.toJson(dealResultFalse);
        }
        return enterprise.enterprise(request);
    }

    @RequestMapping("sendAuthorizeNum")
    @ResponseBody
    public String sendAuthorizeNumCall(@Valid SendAuthorizeNumRequest request, BindingResult bindingResult) throws IOException {
        if(bindingResult.hasErrors()){
            List<ObjectError> errorList = bindingResult.getAllErrors();
            dealResultFalse.setReturnCode("请求失败");
            dealResultFalse.setReturnMsg(errorList.get(0).getDefaultMessage());
            return JsonUtils.toJson(dealResultFalse);
        }
        return sendAuthorizeNum.sendAuthorizeNum(request);
    }

    @RequestMapping("bankBranchInfo")
    @ResponseBody
    public String bankBranchInfoCall(@Valid BankBranchInfoRequest request, BindingResult bindingResult) throws IOException {
        if(bindingResult.hasErrors()){
            List<ObjectError> errorList = bindingResult.getAllErrors();
            dealResultFalse.setReturnCode("请求失败");
            dealResultFalse.setReturnMsg(errorList.get(0).getDefaultMessage());
            return JsonUtils.toJson(dealResultFalse);
        }
        return bankBranchInfo.bankBranchInfo(request);
    }

    @RequestMapping("merProductFeeUpdate")
    @ResponseBody
    public String merProductFeeUpdateCall(@Valid MerProductFeeUpdateRequest request, BindingResult bindingResult) throws IOException {
        if(bindingResult.hasErrors()){
            List<ObjectError> errorList = bindingResult.getAllErrors();
            dealResultFalse.setReturnCode("请求失败");
            dealResultFalse.setReturnMsg(errorList.get(0).getDefaultMessage());
            return JsonUtils.toJson(dealResultFalse);
        }
        return merProductFeeUpdate.merProductFeeUpdate(request);
    }

    @RequestMapping("sendMerSmsNotify")
    @ResponseBody
    public String sendMerSmsNotifyCall(@Valid SendMerSmsNotifyRequest request, BindingResult bindingResult) throws IOException {
        if(bindingResult.hasErrors()){
            List<ObjectError> errorList = bindingResult.getAllErrors();
            dealResultFalse.setReturnCode("请求失败");
            dealResultFalse.setReturnMsg(errorList.get(0).getDefaultMessage());
            return JsonUtils.toJson(dealResultFalse);
        }
        return sendMerSmsNotify.sendMerSmsNotify(request);
    }

    @RequestMapping("merSettleInfoUpdate")
    @ResponseBody
    public String merSettleInfoUpdateCall(@Valid MerSettleInfoUpdateRequest request, BindingResult bindingResult) throws IOException {
        if(bindingResult.hasErrors()){
            List<ObjectError> errorList = bindingResult.getAllErrors();
            dealResultFalse.setReturnCode("请求失败");
            dealResultFalse.setReturnMsg(errorList.get(0).getDefaultMessage());
            return JsonUtils.toJson(dealResultFalse);
        }
        return merSettleInfoUpdate.merSettleInfoUpdate(request);
    }

    @RequestMapping("regStatusQuery")
    @ResponseBody
    public String regStatusQueryCall(@Valid RegStatusQueryRequest request, BindingResult bindingResult) throws IOException {
        if(bindingResult.hasErrors()){
            List<ObjectError> errorList = bindingResult.getAllErrors();
            dealResultFalse.setReturnCode("请求失败");
            dealResultFalse.setReturnMsg(errorList.get(0).getDefaultMessage());
            return JsonUtils.toJson(dealResultFalse);
        }
        return regStatusQuery.regStatusQuery(request);
    }

    @RequestMapping("balanceQuery")
    @ResponseBody
    public String balanceQueryCall(@Valid BalanceQueryRequest request, BindingResult bindingResult) throws IOException {
        if(bindingResult.hasErrors()){
            List<ObjectError> errorList = bindingResult.getAllErrors();
            dealResultFalse.setReturnCode("请求失败");
            dealResultFalse.setReturnMsg(errorList.get(0).getDefaultMessage());
            return JsonUtils.toJson(dealResultFalse);
        }
        return balanceQuery.balanceQuery(request);
    }

    @RequestMapping("hmackeyQuery")
    @ResponseBody
    public String hmackeyQueryCall(@Valid HmackeyQueryRequest request, BindingResult bindingResult) throws IOException {
        if(bindingResult.hasErrors()){
            List<ObjectError> errorList = bindingResult.getAllErrors();
            dealResultFalse.setReturnCode("请求失败");
            dealResultFalse.setReturnMsg(errorList.get(0).getDefaultMessage());
            return JsonUtils.toJson(dealResultFalse);
        }
        return hmackeyQuery.hmackeyQuery(request);
    }

    @RequestMapping("fileUpload")
    @ResponseBody
    public String fileUploadCall(@Valid FileUploadRequest request, BindingResult bindingResult) throws IOException {
        if(bindingResult.hasErrors()){
            List<ObjectError> errorList = bindingResult.getAllErrors();
            dealResultFalse.setReturnCode("请求失败");
            dealResultFalse.setReturnMsg(errorList.get(0).getDefaultMessage());
            return JsonUtils.toJson(dealResultFalse);
        }
        return fileUpload.fileUpload(request);
    }

    @RequestMapping("authorizeUrlQuery")
    @ResponseBody
    public String authorizeUrlQueryCall(@Valid AuthorizeUrlQueryRequest request, BindingResult bindingResult) throws IOException {
        if(bindingResult.hasErrors()){
            List<ObjectError> errorList = bindingResult.getAllErrors();
            dealResultFalse.setReturnCode("请求失败");
            dealResultFalse.setReturnMsg(errorList.get(0).getDefaultMessage());
            return JsonUtils.toJson(dealResultFalse);
        }
        return authorizeUrlQuery.authorizeUrlQuery(request);
    }

    @RequestMapping("receiveAuthorizeNum")
    @ResponseBody
    public String receiveAuthorizeNumCall(@Valid ReceiveAuthorizeNumRequest request, BindingResult bindingResult) throws IOException {
        if(bindingResult.hasErrors()){
            List<ObjectError> errorList = bindingResult.getAllErrors();
            dealResultFalse.setReturnCode("请求失败");
            dealResultFalse.setReturnMsg(errorList.get(0).getDefaultMessage());
            return JsonUtils.toJson(dealResultFalse);
        }
        return receiveAuthorizeNum.receiveAuthorizeNum(request);
    }
}
