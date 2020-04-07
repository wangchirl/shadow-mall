package com.shadow.mall.product.exception;

import com.shadow.common.exception.BizCode;
import com.shadow.common.utils.R;
import lombok.extern.slf4j.Slf4j;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.Map;

/**
 * 统一异常处理类
 */
//@ResponseBody
//@ControllerAdvice(basePackages = "com.shadow.mall.product.controller")
@Slf4j
@RestControllerAdvice(basePackages = "com.shadow.mall.product.controller")
public class ShadowGlobalExceptionHandler {

    /**
     * 数据校验异常处理
     * @param e
     * @return
     */
    @ExceptionHandler(value = MethodArgumentNotValidException.class)
    public R handlerValidException(MethodArgumentNotValidException e){
        log.error("数据校验异常{},异常类型{}", e.getMessage(),e.getClass());
        BindingResult bindingResult = e.getBindingResult();
        Map<String,String> error = new HashMap<>();
        bindingResult.getFieldErrors().forEach((fieldError -> {
            error.put(fieldError.getField(),fieldError.getDefaultMessage());
        }));
        return R.error(BizCode.VALID_EXCEPTION.getCode(),BizCode.VALID_EXCEPTION.getMessage()).put("data",error);
    }


    @ExceptionHandler(value = Throwable.class)
    public R handlerException(Throwable e){
        log.error("通用异常{}", e.getMessage());
        return R.error(BizCode.UNKNOW_EXCEPTION.getCode(),BizCode.UNKNOW_EXCEPTION.getMessage());
    }

}
