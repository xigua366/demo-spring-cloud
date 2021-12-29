package com.yx.demo.alibaba.config;

import com.alibaba.csp.sentinel.slots.block.BlockException;
import com.alibaba.csp.sentinel.slots.block.authority.AuthorityException;
import com.alibaba.csp.sentinel.slots.block.degrade.DegradeException;
import com.alibaba.csp.sentinel.slots.block.flow.FlowException;
import com.alibaba.csp.sentinel.slots.block.flow.param.ParamFlowException;
import com.alibaba.csp.sentinel.slots.system.SystemBlockException;
import com.yx.demo.alibaba.utils.JsonData;
import lombok.extern.slf4j.Slf4j;
import org.springframework.core.annotation.Order;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@Slf4j
@RestControllerAdvice
@Order
public class GlobalExceptionHandler {

    // 演示sentinel错误熔断降级，临时注释
    @ExceptionHandler(value = Exception.class)
    public JsonData handle(Exception e) {
        log.error("[ 系统未知错误 ]", e);
        return JsonData.buildError("系统未知异常");
    }

    // 演示sentinel错误熔断降级，临时注释
    @ExceptionHandler(value = BlockException.class)
    public JsonData handle(BlockException e) {
        log.error("[ 流控异常 ]", e);
        if(e instanceof FlowException){
            return JsonData.buildError("限流异常");
        }
        else if(e instanceof DegradeException){
            return JsonData.buildError("降级异常");
        }
        else if(e instanceof ParamFlowException){
            return JsonData.buildError("热点参数异常");
        }
        else if(e instanceof SystemBlockException){
            return JsonData.buildError("系统规则异常");
        }
        else if(e instanceof AuthorityException){
            return JsonData.buildError("授权异常");
        }
        return JsonData.buildError("流控异常");
    }

}