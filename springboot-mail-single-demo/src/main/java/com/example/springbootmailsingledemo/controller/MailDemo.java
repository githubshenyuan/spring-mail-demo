package com.example.springbootmailsingledemo.controller;

import com.example.springbootmailsingledemo.common.service.MailService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@RestController
public class MailDemo {

    @Resource
    MailService mailService;
    @GetMapping("get")
    public String sendMail() {
        mailService.sendSimpleMail("3108065@qq.com", "shenhai@sinosoft.com.cn", "测试主题", "测试内容");
        return "success";
    }
}
