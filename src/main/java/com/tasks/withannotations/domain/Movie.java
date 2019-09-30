package com.tasks.withannotations.domain;

public class Movie {
    Actor actor;

    Movie(Actor actor){
        this.actor = actor;
    }

    Movie(){

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
