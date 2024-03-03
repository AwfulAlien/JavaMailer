package com.awfulalien.mailer;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.event.ApplicationReadyEvent;
import org.springframework.context.event.EventListener;

@SpringBootApplication
public class MailerApplication {

    @Autowired
    private MailerService mailerService;

    public static void main(String[] args) {
        SpringApplication.run(MailerApplication.class, args);
    }

    @EventListener(ApplicationReadyEvent.class)
    public void sendMail() {

        // provide values hardcoded or with Scanner
        String to = "testmail@gmail.com";
        String subject = "test subject";
        String body = "test body";

        mailerService.sendMail(to, subject, body);
    }

}
