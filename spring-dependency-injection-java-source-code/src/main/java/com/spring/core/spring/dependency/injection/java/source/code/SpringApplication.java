package com.spring.core.spring.dependency.injection.java.source.code;

import com.spring.core.spring.dependency.injection.java.source.code.config.ApplicationConfig;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class SpringApplication {
    public static void main(String[] args) {

        //Create a spring container
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(ApplicationConfig.class);

        //Retrieve bean from the spring container
        Coach englishCoach = context.getBean("englishCoach", Coach.class);
        Coach historyCoach = context.getBean("historyCoach", Coach.class);


        EnglishCoach englishCoachDetail = context.getBean("englishCoach", EnglishCoach.class);
        HistoryCoach historyCoachDetail = context.getBean("historyCoach", HistoryCoach.class);

        //Use bean
        System.out.println(englishCoach.getDailyHomeWork());
        System.out.println(englishCoach.getExamination());
        System.out.println(historyCoach.getDailyHomeWork());
        System.out.println(historyCoach.getExamination());
        System.out.println(englishCoachDetail.getTeamEmail());
        System.out.println(historyCoachDetail.getTeamEmail());

        //Close context
        context.close();

    }
}