package com.spring.core.spring.dependency.injection.annotation;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpringApplication {

    public static void main(String[] args) {

        //create Spring Container with configuration file
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");

        //Get bean from container
        Coach englishCoach = context.getBean("englishCoach", Coach.class);
        Coach historyCoach = context.getBean("historyCoach", Coach.class);
        Coach scienceCoach = context.getBean("scienceCoach", Coach.class);

        EnglishCoach englishCoachDetail = context.getBean("englishCoach", EnglishCoach.class);
        HistoryCoach historyCoachDetail = context.getBean("historyCoach", HistoryCoach.class);

        //use beans
        System.out.println(englishCoach.getDailyHomeWork());
        System.out.println(englishCoach.getExamination());
        System.out.println(historyCoach.getDailyHomeWork());
        System.out.println(historyCoach.getExamination());
        System.out.println(scienceCoach.getDailyHomeWork());
        System.out.println(scienceCoach.getExamination());

        System.out.println(englishCoachDetail.getTeamEmail());
        System.out.println(historyCoachDetail.getTeamEmail());

        //close container
        context.close();
    }

}