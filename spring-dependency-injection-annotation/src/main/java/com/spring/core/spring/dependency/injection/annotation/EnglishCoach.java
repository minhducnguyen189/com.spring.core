package com.spring.core.spring.dependency.injection.annotation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class EnglishCoach implements Coach {

    private final ExaminationService examinationService;

    @Autowired
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

}
