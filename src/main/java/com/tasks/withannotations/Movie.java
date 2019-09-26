package com.tasks.withannotations;

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
