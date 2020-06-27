package com.polar.mail.maildemo.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.stereotype.Component;

@Component
@Configuration
public class MailConfig {
    @Bean("templateMessage")
    public SimpleMailMessage template() {
        SimpleMailMessage template = new SimpleMailMessage();
        template.setFrom("FROM_ADDR");
        String[] addrList = {"TO_ADDRS"};
        template.setTo(addrList);
        template.setSubject("test subject");
        template.setText("test body");
        return template;
    }
}