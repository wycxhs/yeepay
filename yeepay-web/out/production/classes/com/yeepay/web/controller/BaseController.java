package com.yeepay.web.controller;



import com.yeepay.common.JsonResult;
import com.yeepay.common.enums.ResultEnums;
import com.yeepay.common.exception.PayException;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class BaseController {

    public HttpServletRequest request;
    public HttpServletResponse response;

    @ModelAttribute
    public void getRequestResponse(HttpServletRequest request, HttpServletResponse response) {
        this.request = request;
        this.response = response;
    }


    public JsonResult checkBindingResult(BindingResult bindingResult) {
        if (bindingResult.hasErrors()) {
            throw new PayException(ResultEnums.PARAMS_ERROR.getCode(), bindingResult.getFieldError().getDefaultMessage());
        }
        return JsonResult.setReturn(ResultEnums.OK);
    }
}
