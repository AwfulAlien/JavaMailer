package com.awfulalien.mailer;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Service;

@Service
public class MailerService {

    @Autowired
    private JavaMailSender mailSender;

    void sendMail(String to, String subject, String body) {

        //mail id which you have provided in the application.properties file
        String fromMailID = "";

        SimpleMailMessage mailMessage = new SimpleMailMessage();

        mailMessage.setFrom(fromMailID);
        mailMessage.setTo(to);
        mailMessage.setSubject(subject);
        mailMessage.setText(body);

        mailSender.send(mailMessage);

        System.out.println("E-Mail with the Subject :" + " '" + subject + "' " + "has been sent to " + to );

    }

}
