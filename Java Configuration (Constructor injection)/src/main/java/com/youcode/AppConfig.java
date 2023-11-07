package com.youcode;

import org.springframework.context.annotation.Bean;

public class AppConfig {
    @Bean(name = "standardSpellChecker")
    public StandardSpellChecker createStandardSpellChecker() {
        return new StandardSpellChecker();
    }

    @Bean(name = "advancedSpellChecker")
    public AdvancedSpellChecker createAdvancedSpellChecker() {
        return new AdvancedSpellChecker();
    }

    @Bean(name = "emailClient")
    public EmailClient createEmailClient() {
        EmailClient emailClient = new EmailClient();
        emailClient.setSpellChecker(new AdvancedSpellChecker());
        return emailClient;
    }
}
