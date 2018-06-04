package com.yeepay.common.base;

import com.yeepay.common.JsonResult;
import com.yeepay.common.enums.ResultEnums;
import com.yeepay.common.exception.PayException;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public abstract class BaseController {

//    private static final Logger LOGGER = Logger.getLogger(BaseController.class);

    public HttpServletRequest request;
    public HttpServletResponse response;

    @ModelAttribute
    public void getRequestResponse(HttpServletRequest request, HttpServletResponse response) {
        this.request = request;
        this.response = response;
    }

//    @ExceptionHandler(Exception.class)
//    public JsonResult exception(Exception e) {
//        LOGGER.error(e.getMessage(), e);
//        if (e instanceof PayException) {
//            PayException exception = (PayException) e;
//            if (exception.getCode() != null) {
//                return JsonResult.setReturn(exception.getCode(), exception.getMessage());
//            }
//        }
//        return JsonResult.setReturn(ResultEnums.EXCEPTION);
//    }

    public JsonResult checkBindingResult(BindingResult bindingResult) {
        if (bindingResult.hasErrors()) {
            throw new PayException(ResultEnums.PARAMS_ERROR.getCode(), bindingResult.getFieldError().getDefaultMessage());
        }
        return JsonResult.setReturn(ResultEnums.OK);
    }

}
