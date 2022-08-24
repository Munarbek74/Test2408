package com.company;

public class Class {
    public String classes;

    public Class(String classes) {
        this.classes = classes;
    }

    public String getClasses() {
        return classes;
    }

    public void setClasses(String classes) {
        this.classes = classes;
    }

    @Override
    public String toString() {
        return '{' +
                classes  +
                '}';
    }
}
