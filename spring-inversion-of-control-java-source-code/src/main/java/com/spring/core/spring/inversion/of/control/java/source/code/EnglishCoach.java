package com.spring.core.spring.inversion.of.control.java.source.code;

import org.springframework.stereotype.Component;

@Component
public class EnglishCoach implements Coach {

    @Override
    public String getDailyHomeWork() {
        return "Spend 1 hour to practise Speaking Skill!";
    }

}
