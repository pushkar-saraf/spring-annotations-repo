package com.tasks.withannotations;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("prototype")
public class Movie {
    private Actor actor;

    @Autowired
    Movie(Actor actor){
        this.actor = actor;
    }



    @Override
    public String toString() {
        return "Actor->\n" + this.actor;
    }

    public Actor getActor() {
        return actor;
    }

    public void setActor(Actor actor) {
        this.actor = actor;
    }
}
