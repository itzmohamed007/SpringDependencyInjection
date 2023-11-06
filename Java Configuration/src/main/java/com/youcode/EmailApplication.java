package com.youcode;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class EmailApplication {
    public static void main(String[] args) {
        ApplicationContext applicationContext = new AnnotationConfigApplicationContext(AppConfig.class);
        EmailClient emailClient = applicationContext.getBean("emailClient", EmailClient.class);
//        EmailClient emailClient = new EmailClient(new AdvancedSpellChecker());
        String message = "this is my message";
        emailClient.sendEmail(message);
    }
}
