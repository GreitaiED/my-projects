package com.bootcampexcercise.modul10.Act1and2;

public class Student extends Person {
    private String schoolName;

    public Student() {
    }

    public Student(String name, int age, String schoolName) {
        super(name, age);
        this.schoolName = schoolName;
    }

    public String getSchoolName() {
        return schoolName;
    }

    public void setSchoolName(String schoolName) {
        this.schoolName = schoolName;
    }

    @Override
    public void introduce() {
        System.out.println("Hello! My name is " + getName() + " and I am " + getAge() + " years old.");
        System.out.println("Currently I am studying in " + schoolName);
    }
}
