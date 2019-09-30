package com.tasks.withannotations.domain;

import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

@Component
public class BeanPostProcessorDemoBean {
    @PostConstruct
    public void customInit(){
        System.out.println("Initialized");
    }

    @PreDestroy
    public void customDestory(){
        System.out.println("Destroyed!!!");
    }

}
