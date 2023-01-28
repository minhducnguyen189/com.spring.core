package com.spring.core.spring.dependency.injection.java.source.code;

public class EnglishCoach implements Coach {

    private ExaminationService examinationService;

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
