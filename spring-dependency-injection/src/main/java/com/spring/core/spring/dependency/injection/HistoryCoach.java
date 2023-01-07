package com.spring.core.spring.dependency.injection;

public class HistoryCoach implements Coach {

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

}
