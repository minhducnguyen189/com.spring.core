package com.spring.core.spring.dependency.injection;

public class HistoryCoach implements Coach {

    private String teamEmail;
    private ExaminationService examinationService;

    public void setExaminationService(ExaminationService examinationService) {
        this.examinationService = examinationService;
    }

    @Override
    public String getDailyHomeWork() {
        return "Spend 20 minutes to read history books";
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
