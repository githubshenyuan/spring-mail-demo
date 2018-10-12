package com.example.springbootmailsingledemo.common.service;

public interface MailService {

    /**
     * 发送简单的邮件
     * @return
     */
    String sendSimpleMail(String from, String to, String subject, String content);
}
