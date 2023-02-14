package com.spring.core.spring.dependency.injection.java.source.code;

import org.springframework.beans.factory.annotation.Value;

public class EnglishCoach implements Coach {

    private ExaminationService examinationService;

    @Value("${coach.team.english.email}")
    private String teamEmail;

    public EnglishCoach(ExaminationService examinationService) {
        this.examinationService = examinationService;
    }

    @Override
    public String getDailyHomeWork() {
        return "Spend 1 hour to practise Speaking Skill!";
    }

    @Override
    public String getExamination() {
        return this.examinationService.getExamination();
    }

    public String getTeamEmail() {
        return teamEmail;
    }

}
