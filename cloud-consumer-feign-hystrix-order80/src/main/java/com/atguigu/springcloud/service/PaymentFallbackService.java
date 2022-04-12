package com.atguigu.springcloud.service;

import org.springframework.stereotype.Component;

/**
 * @author ZY152
 * @create 2022/4/4 17:33
 * @description
 */
@Component
public class PaymentFallbackService implements PaymentHystrixService{
    @Override
    public String paymentInfo_OK(Integer id) {
        return "PaymentFallbackService --- paymentInfo_OK --- exception or error";
    }

    @Override
    public String paymentInfo_Timeout(Integer id) {
        return "PaymentFallbackService --- paymentInfo_Timeout --- exception or error";
    }
}
