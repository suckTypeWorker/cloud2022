package com.atguigu.springcloud.controller;

import com.atguigu.springcloud.entities.CommonResult;
import com.atguigu.springcloud.entities.Payment;
import com.atguigu.springcloud.service.PaymentService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.util.ObjectUtils;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

/**
 * @author ZY152
 * @create 2022/3/20 21:43
 * @description
 */
@RestController
@Slf4j
public class PaymentController {

    @Value("${server.port}")
    private String serverPort;

    @Resource
    private PaymentService paymentService;

    @PostMapping(value = "/payment/create")
    public CommonResult create(@RequestBody Payment payment) {
        int result = paymentService.create(payment);

        log.info("****插入结果：{}", result);

        if (result > 0) {
            return new CommonResult(200, "插入数据库成功," + serverPort, result);
        } else {
            return new CommonResult(444, "插入数据库失败," + serverPort);
        }
    }

    @GetMapping(value = "/payment/get/{id}")
    public CommonResult<Payment> getPaymentById(@PathVariable("id") Long id) {
        Payment result = paymentService.getPaymentById(id);
        System.out.println(111);
        log.info("****查询结果：{}", !ObjectUtils.isEmpty(result));
        if (!ObjectUtils.isEmpty(result)) {
            return new CommonResult<>(200, "查询成功," + serverPort, result);
        } else {
            return new CommonResult<>(444, "没有对应记录，查询失败。失败id：" + id + "," + serverPort);
        }
    }

    @GetMapping("/payment/lb")
    public String paymentLb(){
        return serverPort;
    }

}
