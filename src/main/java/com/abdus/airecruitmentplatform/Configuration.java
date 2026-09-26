package com.abdus.airecruitmentplatform;

import org.springframework.context.annotation.Bean;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.mail.javamail.JavaMailSenderImpl;

@org.springframework.context.annotation.Configuration
public class Configuration {

    @Bean
    public JavaMailSender message() {

        JavaMailSenderImpl message = new JavaMailSenderImpl();

        message.setPort(1025);
        message.setHost("localhost");

        return message;
    }
}