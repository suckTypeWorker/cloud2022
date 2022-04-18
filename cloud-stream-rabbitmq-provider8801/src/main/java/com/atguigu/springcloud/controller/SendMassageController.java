package com.atguigu.springcloud.controller;

import com.atguigu.springcloud.service.IMessageProvider;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * @author ZY152
 * @create 2022/4/17 14:52
 * @description
 */
@RestController
public class SendMassageController {
    @Resource
    private IMessageProvider iMessageProvider;

    @GetMapping("/sendMessage")
    public String sendMessage(){
        try {
            iMessageProvider.send();
        }catch (Exception e){
           return e.getMessage();
        }
        return "send successfully";
    }
}
