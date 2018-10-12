package com.example.springbootmailsingledemo.common.service.impl;

import com.example.springbootmailsingledemo.common.service.MailService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import javax.annotation.Resource;

import static org.junit.Assert.*;

@RunWith(SpringRunner.class)
@SpringBootTest
public class MailServiceImplTest {
    @Resource
    MailService mailService;
    @Test
    public void sendSimpleMail() {

        mailService.sendSimpleMail("xxxxxx@xxxxxx.com.cn", "xxxxx@xxxxx.com.cn",
                "测试", "测试");
    }
}