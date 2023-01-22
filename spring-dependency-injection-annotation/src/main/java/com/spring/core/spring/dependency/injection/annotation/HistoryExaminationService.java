package com.spring.core.spring.dependency.injection.annotation;

import org.springframework.stereotype.Component;

@Component
public class HistoryExaminationService implements ExaminationService {

    @Override
    public String getExamination() {
        return "Focus and take History examination in 3 hours";
    }

}
