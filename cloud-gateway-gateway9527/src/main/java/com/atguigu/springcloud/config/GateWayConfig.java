package com.atguigu.springcloud.config;

import org.springframework.cloud.gateway.route.RouteLocator;
import org.springframework.cloud.gateway.route.builder.RouteLocatorBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author ZY152
 * @create 2022/4/7 22:03
 * @description
 */
@Configuration
public class GateWayConfig {

    @Bean
    public RouteLocator routeLocator(RouteLocatorBuilder routeLocatorBuilder){
        RouteLocatorBuilder.Builder builder = routeLocatorBuilder.routes();
        builder.route("route_path_atguigu_",r->r.path("/guonei").uri("http://news.baidu.com/guonei")).build();
        return builder.build();
    }
}
