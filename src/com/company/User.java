package com.company;

import java.util.Date;

public class User extends Person {
//    private String firstName;
//    private String secondName;
//    private String dateOfBirth;
//    private int age;
//    private String gender;
    private int id;
    private static int id_gen = 0;
    private String password;

    public User(){
        id = id_gen++; // auto-increment
    }

    public User(String firstName, String secondName){
        this();
        setFirstName(firstName);
        setSecondName(secondName);
    }

    public User(String firstName, String secondName, int age, String dateOfBirth, String password){
        this(firstName, secondName);
        setAge(age);
        setDateOfBirth(dateOfBirth);
        setPassword(password);
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public int getId() {
        return id;
    }

}
