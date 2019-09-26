package com.tasks.withannotations;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {
    @Bean
    public Actor getActor(){
        Actor a = new Actor();
        a.setName("Emma Watson");
        a.setAge(27);
        a.setGender("female");
        return a;
    }

    @Bean
    public Movie getMovie(){
        Movie movie = new Movie();
        movie.setActor(getActor());
        return movie;
    }
}
