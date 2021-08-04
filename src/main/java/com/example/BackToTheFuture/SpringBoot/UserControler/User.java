package com.example.BackToTheFuture.SpringBoot.UserControler;

public class User {
    private String name;
    private String surname;
    private String UrlImage;

    public void setUrlImage(String urlImage) {
        UrlImage = urlImage;
    }

    public User(String s, String surname, String name){
        this.name = name;
    }
    @Override
    public String toString(){
        return name;
    }

    public String getName() {
        return name;
    }
    public void setName(String name){
        this.name = name;
    }
    public String getSurname(){
        return surname;
    }
    public String getUrlImage(){return  UrlImage;}

    public void setSurname(String surname) {
        this.surname = surname;
    }

}
