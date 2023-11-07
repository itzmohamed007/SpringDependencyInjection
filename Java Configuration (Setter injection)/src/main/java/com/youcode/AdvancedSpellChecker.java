package com.youcode;

public class AdvancedSpellChecker implements SpellChecker{
    @Override
    public void checkSpelling(String message) {
        System.out.println("message spelling checked by advanced spell checker");
    }
}
