package com.journal.model;

public class Teacher extends Man {
    String educationalSubject;

    public Teacher(String name, int age, boolean sex, String educationalSubject) {
        super(name, age, sex);
        this.educationalSubject = educationalSubject;
    }
}
