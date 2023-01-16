package com.spring.core.spring.bean.scopes.and.lifecycle;

public class EnglishCoach implements Coach {

    @Override
    public String getDailyHomeWork() {
        return "Spend 1 hour to practise Speaking Skill!";
    }

    public void initAdHocMethod() {
        System.out.println("EnglishCoach: The initAdHocMethod() is called!");
    }

    public void destroyAdHocMethod() {
        System.out.println("EnglishCoach: The destroyAdHocMethod() is called!");
    }

}
