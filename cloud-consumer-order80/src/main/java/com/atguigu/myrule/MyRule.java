package com.atguigu.myrule;

import com.netflix.loadbalancer.IRule;
import com.netflix.loadbalancer.RandomRule;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author ZY152
 * @create 2022/4/1 22:15
 * @description
 */
@Configuration
public class MyRule {
    @Bean
    public IRule myRandom(){
        return new RandomRule();
    }
}
