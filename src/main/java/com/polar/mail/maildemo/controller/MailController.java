package com.polar.mail.maildemo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.mail.MailException;
import org.springframework.mail.MailSender;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class MailController {
    @Autowired
    private MailSender mailSender;

    @Autowired
    private SimpleMailMessage templateMessage;

//     @ResponseBody
    @GetMapping("/")
    public ResponseEntity<String> sendmail() {
        System.out.println("a");
        try {
            System.out.println("b");
            mailSender.send(templateMessage);
            System.out.println("c");
        } catch (Exception e) {
            System.out.println("d");
            e.printStackTrace();
        }
        return ResponseEntity.ok().build();
    }
}