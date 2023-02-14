package com.spring.core.spring.dependency.injection.java.source.code;

import org.springframework.beans.factory.annotation.Value;

public class HistoryCoach implements Coach {

    private ExaminationService examinationService;

    @Value("${coach.team.history.email}")
    private String teamEmail;

    @Override
    public String getDailyHomeWork() {
        return "Spend 20 minutes to read history books";
    }

    @Override
    public String getExamination() {
        return this.examinationService.getExamination();
    }

    public void setExaminationService(ExaminationService examinationService) {
        this.examinationService = examinationService;
    }

    public String getTeamEmail() {
        return teamEmail;
    }

}
