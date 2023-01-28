package com.spring.core.spring.dependency.injection.java.source.code.config;

import com.spring.core.spring.dependency.injection.java.source.code.*;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ApplicationConfig {

    @Bean
    public ExaminationService englishExaminationService() {
        return new EnglishExaminationService();
    }

    @Bean
    public ExaminationService historyExaminationService() {
        return new HistoryExaminationService();
    }

    @Bean
    public EnglishCoach englishCoach() {
        return new EnglishCoach(englishExaminationService());
    }

    @Bean
    public HistoryCoach historyCoach() {
       HistoryCoach historyCoach = new HistoryCoach();
       historyCoach.setExaminationService(historyExaminationService());
       return historyCoach;
    }

}
