package com.journal.repository;

import com.journal.model.Student;

import java.util.ArrayList;
import java.util.List;

public class Students {
    private static Students instance;

    public final List<Student> students = new ArrayList<>();

    public static Students getInstance() {
        if (instance == null) {
            instance = new Students();
        }
        return instance;
    }

    public void addStudent(Student student) {
        students.add(student);
    }

    public void removeStudent(Student student) {
        for (Student student1 : students) {
            if (student1.equals(student)) {
                student1 = null;
            }
        }
    }
    public void academicPerformanceOfStudents(){
        System.out.println();
    }


}
