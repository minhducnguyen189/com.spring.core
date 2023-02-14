package com.spring.core.spring.dependency.injection.annotation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class EnglishCoach implements Coach {

    private final ExaminationService examinationService;

    @Value("${coach.team.english.email}")
    private String teamEmail;

    @Autowired
    public EnglishCoach(@Qualifier("englishExaminationService") ExaminationService examinationService) {
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

    public void setTeamEmail(String teamEmail) {
        this.teamEmail = teamEmail;
    }
}
