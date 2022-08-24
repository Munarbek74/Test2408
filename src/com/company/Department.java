package com.company;

import java.util.Arrays;

public class Department {
    private String depName;
    private Class[] classes;
    private Professor[] professors;
    private Student[] students;

    public Department(String depName, Class[] classes, Professor[] professors, Student[] students) {
        this.depName = depName;
        this.classes = classes;
        this.professors = professors;
        this.students = students;
    }

    @Override
    public String toString() {
        return '{'+
                "depName='" + depName + '\'' +
                ", classes=" + Arrays.toString(classes) +
                ", professors=" + Arrays.toString(professors) +
                ", students=" + Arrays.toString(students) +
                '}';
    }

    public String getDepName() {
        return depName;
    }

    public void setDepName(String depName) {
        this.depName = depName;
    }

    public Class[] getClasses() {
        return classes;
    }

    public void setClasses(Class[] classes) {
        this.classes = classes;
    }

    public Professor[] getProfessors() {
        return professors;
    }

    public void setProfessors(Professor[] professors) {
        this.professors = professors;
    }

    public Student[] getStudents() {
        return students;
    }

    public void setStudents(Student[] students) {
        this.students = students;
    }
}
