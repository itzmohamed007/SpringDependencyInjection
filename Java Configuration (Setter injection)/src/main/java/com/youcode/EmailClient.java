package com.youcode;

public class EmailClient {
    private final SpellChecker spellChecker;
    public EmailClient (SpellChecker spellChecker) {
        this.spellChecker = spellChecker;
    }

    public void sendEmail(String message) {
        this.spellChecker.checkSpelling(message);
        System.out.println("email sent successfully");
    }
}
