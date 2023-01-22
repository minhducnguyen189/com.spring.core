package com.spring.core.spring.dependency.injection.annotation;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpringApplication {

    public static void main(String[] args) {

        //create Spring Container with configuration file
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");

        //Get bean from container
        Coach englishCoach = context.getBean("englishCoach", Coach.class);
        Coach historyCoach = context.getBean("historyCoach", Coach.class);

        //use beans
        System.out.println(englishCoach.getDailyHomeWork());
        System.out.println(englishCoach.getExamination());
        System.out.println(historyCoach.getDailyHomeWork());
        System.out.println(historyCoach.getExamination());

        //close container
        context.close();
    }

}