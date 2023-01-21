package com.spring.core.spring.inversion.of.control.annotation;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpringApplication {
    public static void main(String[] args) {

        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");

        //retrieve bean from the spring container
        Coach englishCoach = context.getBean("englishCoach", Coach.class);

        //use the bean
        System.out.println(englishCoach.getDailyHomeWork());

        context.close();
    }
}
