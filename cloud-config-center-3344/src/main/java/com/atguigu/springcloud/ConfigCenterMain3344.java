package com.atguigu.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

/**
 * @author ZY152
 * @create 2022/4/12 21:49
 * @description
 */
@SpringBootApplication
@EnableConfigServer
public class ConfigCenterMain3344 {
        public static void main(String[] args) {
                SpringApplication.run(ConfigCenterMain3344.class,args);
            }
}
