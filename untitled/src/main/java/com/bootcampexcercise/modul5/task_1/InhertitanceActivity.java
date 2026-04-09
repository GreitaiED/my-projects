package com.bootcampexcercise.modul5.task_1;

public class InhertitanceActivity {
    public static void main(String[] args) {
        Person_I myPerson = new Person_I();
        myPerson.name = "Sarah Johnson";
        myPerson.age = 21;

        System.out.println("-----------------------------");

        Employee_I myEmployee = new Employee_I();
        myEmployee.name = "Shawn Cun";
        myEmployee.age = 32;
        myEmployee.title = "Developer";
        myEmployee.salary = 70000.00;

        System.out.println("Employee name: " + myEmployee.name);
        System.out.println("Employee age: " + myEmployee.age);
        System.out.println("Employee title: " + myEmployee.title);
        System.out.println("Employee salary: " + myEmployee.salary);

        System.out.println("-----------------------------");

        System.out.println("Person age: " + myPerson.age);
        System.out.println("Person name: " + myPerson.name);

        System.out.println("-----------------------------");
    }
}
