package com.demo;

import org.springframework.stereotype.Component;

//@Component
public class Student {

    private String name;
    private String school;
    private Double grade;

    public Student(){

    }

    public Student(String name, String school, Double grade) {
        this.name = name;
        this.school = school;
        this.grade = grade;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSchool() {
        return school;
    }

    public void setSchool(String school) {
        this.school = school;
    }

    public Double getGrade() {
        return grade;
    }

    public void setGrade(Double grade) {
        this.grade = grade;
    }
}
