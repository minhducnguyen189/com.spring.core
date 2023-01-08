package com.spring.core.spring.dependency.injection;

public class EnglishCoach implements Coach {

    private final ExaminationService examinationService;
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

    public ExaminationService getExaminationService() {
        return examinationService;
    }

    public String getTeamEmail() {
        return teamEmail;
    }

    public void setTeamEmail(String teamEmail) {
        this.teamEmail = teamEmail;
    }
}
