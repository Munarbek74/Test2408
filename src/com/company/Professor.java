package com.company;

public class Professor {
    public String nameProfessor;

    public Professor(String nameProfessor) {
        this.nameProfessor = nameProfessor;
    }

    public String getNameProfessor() {
        return nameProfessor;
    }

    public void setNameProfessor(String nameProfessor) {
        this.nameProfessor = nameProfessor;
    }

    @Override
    public String toString() {
        return '{' +
                 nameProfessor  +
                '}';
    }
}
