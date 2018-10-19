package com.example.springbootmailsingledemo.common.service.impl;

import com.example.springbootmailsingledemo.common.service.MailService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
public class MailServiceImpl  implements MailService {

    @Resource
    private JavaMailSender javaMailSender;


    @Override
    public boolean sendSimpleMail(String from, String to, String subject, String content) {
        SimpleMailMessage simpleMailMessage = new SimpleMailMessage();
        simpleMailMessage.setFrom(from);
        simpleMailMessage.setTo(to);
        simpleMailMessage.setSubject(subject);
        simpleMailMessage.setText(content);

        try {
            javaMailSender.send(simpleMailMessage);
            System.out.println("简单邮件已经发送。");
            return true;
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("发送邮件异常");
            return false;
        }
    }
}
