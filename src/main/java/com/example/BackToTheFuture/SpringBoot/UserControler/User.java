package com.example.BackToTheFuture.SpringBoot.UserControler;

public class User {
    private String name;

    public User(String name){
        this.name = name;
    }
    @Override
    public String toString(){
        return name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
