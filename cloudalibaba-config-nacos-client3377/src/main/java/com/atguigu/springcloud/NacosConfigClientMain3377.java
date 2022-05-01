package com.atguigu.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @author ZY152
 * @create 2022/4/21 21:24
 * @description
 */
@SpringBootApplication
@EnableDiscoveryClient
public class NacosConfigClientMain3377 {
        public static void main(String[] args) {
                SpringApplication.run(NacosConfigClientMain3377.class,args);
            }
}
