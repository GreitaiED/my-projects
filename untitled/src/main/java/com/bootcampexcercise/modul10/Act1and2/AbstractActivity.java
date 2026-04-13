package com.bootcampexcercise.modul10.Act1and2;

public class AbstractActivity {
    public static void main(String[] args) {
        Employee employee = new Employee("Edvards", 19, "AT Specialist", "Accenture", 228);
        employee.introduce();

        System.out.println("-------------");

        Student student = new Student("Edvards", 19, "Boot-camp");
        student.introduce();
    }
}
