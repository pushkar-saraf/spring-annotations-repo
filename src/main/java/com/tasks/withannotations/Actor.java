package com.tasks.withannotations;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Scope("prototype")
public class Actor {
    private String name;
    private String gender;
    private int age;

    Actor(String name, String gender, int age){
        this.age = age;
        this.name = name;
        this.gender = gender;
    }

    Actor(){}

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getGender() {
        return gender;
    }

    void setName(String name) {
        this.name = name;
    }

    void setAge(int age) {
        this.age = age;
    }

    void setGender(String gender) {
        this.gender = gender;
    }

    @Override
    public String toString() {
        return "Name: " + this.name+
                "\nAge: " + this.age+
                "\nGender: "+ this.gender;
    }
}
