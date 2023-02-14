package com.spring.core.spring.dependency.injection.annotation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
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

    @Autowired
    public void setExaminationService(@Qualifier("historyExaminationService") ExaminationService examinationService) {
        this.examinationService = examinationService;
    }

    public String getTeamEmail() {
        return teamEmail;
    }

    public void setTeamEmail(String teamEmail) {
        this.teamEmail = teamEmail;
    }

}
