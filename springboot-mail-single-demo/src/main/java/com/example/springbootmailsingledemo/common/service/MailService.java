package com.example.springbootmailsingledemo.common.service;

public interface MailService {

    /**
     * 发送简单的邮件
     * @return
     */
    boolean sendSimpleMail(String from, String to, String subject, String content);
}
