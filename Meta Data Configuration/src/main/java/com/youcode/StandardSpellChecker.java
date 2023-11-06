package com.youcode;

public class StandardSpellChecker implements SpellChecker{
    @Override
    public void checkSpelling(String message) {
        System.out.println("message spelling checked by standard spell checker");
    }
}
