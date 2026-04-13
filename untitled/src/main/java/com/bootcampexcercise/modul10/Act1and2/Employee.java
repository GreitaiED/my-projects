package com.bootcampexcercise.modul10.Act1and2;

import java.util.List;

public class Employee extends Person {
    private String jobTitle;
    private String company;
    private double salary;

    public Employee() {
    }

    public Employee(String name, int age, String jobTitle, String company, double salary) {
        super(name, age);
        this.jobTitle = jobTitle;
        this.company = company;
        this.salary = salary;
    }

    public String getJobTitle() {
        return jobTitle;
    }

    public void setJobTitle(String jobTitle) {
        this.jobTitle = jobTitle;
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    @Override
    public void introduce() {
        System.out.println("My name is " + getName() + " and I am " + getAge() + " years old.");
        System.out.println("I work as " + jobTitle + " in " + company + " and my salary is " + salary);
    }

    public static String getHighestPaidEmp(List<Employee> employeeList) {
        if (employeeList == null || employeeList.isEmpty()) {
            return "No employees found";
        }

        Employee highestPaidEmployee = employeeList.get(0);

        for (Employee employee : employeeList) {
            if (employee.getSalary() > highestPaidEmployee.getSalary()) {
                highestPaidEmployee = employee;
            }
        }

        return highestPaidEmployee.getName();
    }
}
