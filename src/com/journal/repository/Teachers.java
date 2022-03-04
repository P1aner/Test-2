package com.journal.repository;

import com.journal.model.Teacher;

import java.util.ArrayList;
import java.util.List;

public class Teachers {
    private static Teachers instance;

    public final List<Teacher> teachers = new ArrayList<>();

    public static Teachers getInstance() {
        if (instance == null) {
            instance = new Teachers();
        }
        return instance;
    }

    public void addTeacher(Teacher teacher) {
        teachers.add(teacher);
    }

    public void removeTeacher(Teacher teacher) {
        for (Teacher teacher1 : teachers) {
            if (teacher1.equals(teacher)) {
                teacher1 = null;
            }
        }
    }

    public void setTeacher(int id, Teacher teacher) {
        teachers.set(id, teacher);
    }
}
