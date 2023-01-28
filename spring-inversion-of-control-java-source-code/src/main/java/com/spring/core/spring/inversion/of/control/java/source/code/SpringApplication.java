package com.spring.core.spring.inversion.of.control.java.source.code;

import com.spring.core.spring.inversion.of.control.java.source.code.config.ApplicationConfig;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class SpringApplication {
    public static void main(String[] args) {

        //Create a spring container
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(ApplicationConfig.class);

        //Retrieve bean from the spring container
        Coach englishCoach = context.getBean("englishCoach", Coach.class);

        //Use bean
        System.out.println(englishCoach.getDailyHomeWork());

        //Close context
        context.close();

    }
}