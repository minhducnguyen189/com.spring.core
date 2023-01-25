package com.spring.core.spring.bean.scopes.and.lifecycle.annotation;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("prototype")
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
