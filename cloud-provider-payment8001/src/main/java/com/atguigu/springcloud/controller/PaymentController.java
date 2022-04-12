package com.atguigu.springcloud.controller;

import com.atguigu.springcloud.entities.CommonResult;
import com.atguigu.springcloud.entities.Payment;
import com.atguigu.springcloud.service.PaymentService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.util.ObjectUtils;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.List;
import java.util.concurrent.TimeUnit;

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
    private DiscoveryClient discoveryClient;

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

    @GetMapping(value = "/payment/discovery")
    public Object discovery() {

        List<String> services = discoveryClient.getServices();
        for (String serviceStr : services) {
            log.info("**********services:{}", serviceStr);
        }

        List<ServiceInstance> instances = discoveryClient.getInstances("CLOUD-PAYMENT-SERVICE");
        for (ServiceInstance instance : instances) {
            log.info(instance.getInstanceId()+"---" + instance.getHost()+":"+instance.getPort()+"---" + instance.getUri());
        }
        return discoveryClient;
    }

    @GetMapping("/payment/lb")
    public String paymentLb(){
        return serverPort;
    }

    @GetMapping("/payment/feign/timeout")
    public String paymentFeignTimeout(){
        try {
            TimeUnit.SECONDS.sleep(3);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return serverPort;
    }

}
