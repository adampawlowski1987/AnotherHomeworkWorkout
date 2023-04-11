package com.isa.bootcamp;

public class Student {

    private String name;

    private String surname;

    private String login;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public Student(String name, String surname) {
        this.name = name;
        this.surname = surname;
    }
}
