package com.atguigu.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @author ZY152
 * @create 2022/4/20 22:47
 * @description
 */
@SpringBootApplication
@EnableDiscoveryClient
public class PaymentMain9002 {
        public static void main(String[] args) {
                SpringApplication.run(PaymentMain9002.class,args);
            }
}
