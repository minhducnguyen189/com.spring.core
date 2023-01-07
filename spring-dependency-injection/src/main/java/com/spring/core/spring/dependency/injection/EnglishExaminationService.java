package com.spring.core.spring.dependency.injection;

public class EnglishExaminationService implements ExaminationService {

    @Override
    public String getExamination() {
        return "Focus and take English examination in 3 hours";
    }
}
