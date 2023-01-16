package com.spring.core.spring.bean.scopes.and.lifecycle;

import org.springframework.beans.factory.DisposableBean;

public class HistoryCoach implements Coach, DisposableBean {

    @Override
    public String getDailyHomeWork() {
        return "Spend 20 minutes to read history books";
    }

    @Override
    public void destroy() throws Exception {
        System.out.println("HistoryCoach: The destroy() method is called!: " + this);
    }
}
