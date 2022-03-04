package com.journal.model;

public class Student extends Man {
    String healthGroup;
    String speciality;

    public Student(String name, int age, boolean sex, String healthGroup, String speciality) {
        super(name, age, sex);
        this.healthGroup = healthGroup;
        this.speciality = speciality;
    }
}
