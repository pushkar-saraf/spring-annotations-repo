package com.tasks.withannotations;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App {
    public static void main(String[] args) {
        System.out.println("Hey!");
        ApplicationContext applicationContext = new AnnotationConfigApplicationContext(AppConfig.class);
        Movie movie = applicationContext.getBean(Movie.class);
        System.out.println(movie);
    }
}
