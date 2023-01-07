package com.spring.core.spring.inversion.of.control;

public class MyApplication {

    public static void main(String[] args) {

        //Create Objects
        Coach englishCoach = new EnglishCoach();
        Coach historyCoach = new HistoryCoach();

        //User Objects
        System.out.println(englishCoach.getDailyHomeWork());
        System.out.println(historyCoach.getDailyHomeWork());

    }
}