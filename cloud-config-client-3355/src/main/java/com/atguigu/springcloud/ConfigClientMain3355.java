package com.atguigu.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * @author ZY152
 * @create 2022/4/13 22:14
 * @description
 */
@SpringBootApplication
@EnableEurekaClient
public class ConfigClientMain3355 {
        public static void main(String[] args) {
                SpringApplication.run(ConfigClientMain3355.class,args);
            }
}
