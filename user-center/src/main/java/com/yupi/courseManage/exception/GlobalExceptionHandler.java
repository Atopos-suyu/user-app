package com.yupi.courseManage.exception;

import com.yupi.courseManage.common.BaseResponse;
import com.yupi.courseManage.common.ErrorCode;
import com.yupi.courseManage.common.ResultUtils;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

/**
 *  全局异常处理器
 *
 * @author suyu
 */
@RestControllerAdvice
@Slf4j
public class GlobalExceptionHandler {

    @ExceptionHandler(BusinessException.class)
    private BaseResponse businessExceptionHandler(BusinessException e){
        log.error("businessException",e.getMessage(), e);
        return ResultUtils.error(e.getCode(), e.getMessage(),e.getDescription());
    }

    @ExceptionHandler(RuntimeException.class)
    private BaseResponse runtimeExceptionHandler(RuntimeException e){
        log.error("runtimeException", e);
        return ResultUtils.error(ErrorCode.SYSTEM_ERROR, e.getMessage(),"");
    }

}
