package com.atguigu.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

/**
 * @author ZY152
 * @create 2022/4/3 15:59
 * @description
 */
@SpringBootApplication
@EnableFeignClients
public class OrderFeignMain80 {
        public static void main(String[] args) {
                SpringApplication.run(OrderFeignMain80.class,args);
            }
}
