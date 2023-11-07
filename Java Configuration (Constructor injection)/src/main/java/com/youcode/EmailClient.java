package com.youcode;

public class EmailClient {
    private SpellChecker spellChecker;
    public EmailClient () {}

    public void setSpellChecker(SpellChecker spellChecker) {
        this.spellChecker = spellChecker;
    }

    public void sendEmail(String message) {
        this.spellChecker.checkSpelling(message);
        System.out.println("email sent successfully");
    }
}
