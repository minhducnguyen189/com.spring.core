package com.spring.core.spring.dependency.injection.annotation;

import org.springframework.stereotype.Component;

@Component
public class ScienceExaminationService implements ExaminationService {

    @Override
    public String getExamination() {
        return "Focus and take Science examination in 3 hours";
    }
}
