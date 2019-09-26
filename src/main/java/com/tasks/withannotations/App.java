package com.tasks.withannotations;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;

public class App {
    public static void main(String[] args) {
        System.out.println("Hey!");
        AbstractApplicationContext applicationContext = new AnnotationConfigApplicationContext(AppConfig.class);
        applicationContext.registerShutdownHook();
    }
}
