package com.spring.core.spring.bean.scopes.and.lifecycle.annotation;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpringApplication {
    public static void main(String[] args) {

        //Load Spring Configuration File
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");

        //retrieve bean from the spring container
        Coach englishCoach = context.getBean("englishCoach", Coach.class);
        Coach englishCoach2 = context.getBean("englishCoach", Coach.class);
        Coach historyCoach = context.getBean("historyCoach", Coach.class);
        Coach historyCoach2 = context.getBean("historyCoach", Coach.class);

        boolean result = (englishCoach == englishCoach2);
        boolean result2 = (historyCoach == historyCoach2);

        //Check Bean scope result
        System.out.println("Pointing to the same object: " + result);
        System.out.println("Memory location of englishCoach: " + englishCoach);
        System.out.println("Memory location of englishCoach2: " + englishCoach2);

        System.out.println("Pointing to the same object: " + result2);
        System.out.println("Memory location of historyCoach: " + historyCoach);
        System.out.println("Memory location of historyCoach2: " + historyCoach2);

        //close the context
        context.close();
    }
}