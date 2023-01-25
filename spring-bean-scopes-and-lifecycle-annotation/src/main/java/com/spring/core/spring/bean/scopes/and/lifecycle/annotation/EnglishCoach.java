package com.spring.core.spring.bean.scopes.and.lifecycle.annotation;

import org.springframework.stereotype.Component;

@Component
public class EnglishCoach implements Coach {

    @Override
    public String getDailyHomeWork() {
        return "Spend 1 hour to practise Speaking Skill!";
    }

}
