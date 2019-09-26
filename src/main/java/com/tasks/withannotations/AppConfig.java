package com.tasks.withannotations;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("com.tasks.withannotations")
public class AppConfig {
    @Bean
    public Actor getActor(){
        return new Actor("Emma Watson","female",27);
    }
//
//    @Bean
//    public Movie getMovie(){
//        return new Movie(new Actor());
//    }
}
