package com.codekul.Java10FebSpring.mail;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.MailSender;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SendMail {

    @Autowired
    private MailSender mailSender;

    @GetMapping("sendMail")
    public String sendEmail(){

        String from  = "codekul.vaibhav@gmail.com";
        String to = "tejastemghare007@gmail.com";

        SimpleMailMessage mailMessage = new SimpleMailMessage();
        mailMessage.setFrom(from);
        mailMessage.setTo(to);
        mailMessage.setSubject("Hii");
        mailMessage.setText("Hii tejas .......");
        mailSender.send(mailMessage);

        return "mail sent";
    }
}
