package com.atguigu.springcloud.service;

import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;

/**
 * @author ZY152
 * @create 2022/4/3 22:34
 * @description
 */

public interface PaymentService {
     String paymentInfo_OK(Integer id);

     String paymentInfo_Timeout(Integer id);

     String paymentCircuitBreaker(@PathVariable("id") Integer id);
}
