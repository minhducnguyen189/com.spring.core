package com.spring.core.spring.bean.scopes.and.lifecycle.annotation;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("prototype")
public class HistoryCoach implements Coach{

    @Override
    public String getDailyHomeWork() {
        return "Spend 20 minutes to read history books";
    }

}
