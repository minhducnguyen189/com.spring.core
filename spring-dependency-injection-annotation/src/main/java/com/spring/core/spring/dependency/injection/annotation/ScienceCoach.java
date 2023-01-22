package com.spring.core.spring.dependency.injection.annotation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class ScienceCoach implements Coach {

    @Autowired
    @Qualifier("scienceExaminationService")
    private ExaminationService examinationService;

    @Override
    public String getDailyHomeWork() {
        return "Spend 40 minutes to read science books";
    }

    @Override
    public String getExamination() {
        return this.examinationService.getExamination();
    }

}
