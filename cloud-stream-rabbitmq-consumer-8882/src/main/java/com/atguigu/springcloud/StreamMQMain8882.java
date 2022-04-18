package com.atguigu.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * @author ZY152
 * @create 2022/4/17 15:21
 * @description
 */
@SpringBootApplication
@EnableEurekaClient
public class StreamMQMain8882 {
        public static void main(String[] args) {
                SpringApplication.run(StreamMQMain8882.class,args);
            }
}
