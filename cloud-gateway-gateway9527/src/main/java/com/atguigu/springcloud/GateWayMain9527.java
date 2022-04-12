package com.atguigu.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * @author ZY152
 * @create 2022/4/5 22:49
 * @description
 */
@SpringBootApplication
@EnableEurekaClient
public class GateWayMain9527 {
        public static void main(String[] args) {
                SpringApplication.run(GateWayMain9527.class,args);
            }
}
