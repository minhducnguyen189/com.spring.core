package com.spring.core.spring.bean.scopes.and.lifecycle.annotation;

import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

@Component
public class EnglishCoach implements Coach {

    @Override
    public String getDailyHomeWork() {
        return "Spend 1 hour to practise Speaking Skill!";
    }

    @PostConstruct
    public void initAdHocMethod() {
        System.out.println("EnglishCoach: The initAdHocMethod() is called!");
    }

    @PreDestroy
    public void destroyAdHocMethod() {
        System.out.println("EnglishCoach: The destroyAdHocMethod() is called!");
    }

}
