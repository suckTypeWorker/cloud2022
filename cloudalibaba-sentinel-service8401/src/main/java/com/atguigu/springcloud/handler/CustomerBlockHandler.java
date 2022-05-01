package com.atguigu.springcloud.handler;

import com.alibaba.csp.sentinel.slots.block.BlockException;
import com.atguigu.springcloud.entities.CommonResult;
import com.atguigu.springcloud.entities.Payment;

/**
 * @author ZY152
 * @create 2022/4/30 19:48
 * @description
 */
public class CustomerBlockHandler {
    public static CommonResult handlerException(BlockException exception){
        return new CommonResult(4444, "自定义全局handlerException");
    }
    public static CommonResult handlerException2(BlockException exception){
        return new CommonResult(4444, "自定义全局handlerException2");
    }

}
