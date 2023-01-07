package com.spring.core.spring.inversion.of.control;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpringApplication {

    public static void main(String[] args) {

        //Load Spring Configuration File
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");

        //retrieve bean from the spring container
        Coach englishCoach = context.getBean("englishCoach", Coach.class);
        Coach historyCoach = context.getBean("historyCoach", Coach.class);

        //use the bean
        System.out.println(englishCoach.getDailyHomeWork());
        System.out.println(historyCoach.getDailyHomeWork());

        //close the context
        context.close();

    }

}
