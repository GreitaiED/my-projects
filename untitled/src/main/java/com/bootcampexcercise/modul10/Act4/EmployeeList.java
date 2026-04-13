package com.bootcampexcercise.modul10.Act4;

import com.bootcampexcercise.modul10.Act1and2.Employee;

import java.util.ArrayList;
import java.util.List;

public class EmployeeList {
    public static void main(String[] args) {
        Employee empl1 = new Employee("Edvards", 30, "Tester", "Google", 8000);
        Employee empl2 = new Employee("Alice", 28, "Developer", "Amazon", 7500);
        Employee empl3 = new Employee("Bob", 35, "Analyst", "Microsoft", 9500);
        Employee empl4 = new Employee("Disha", 26, "Manager", "Meta", 7000);
        Employee empl5 = new Employee("Tom", 40, "Architect", "Apple", 9900);

        List<Employee> empList = new ArrayList<>();
        empList.add(empl1);
        empList.add(empl2);
        empList.add(empl3);
        empList.add(empl4);
        empList.add(empl5);

        System.out.println("The employee with the highest salary: "
                + Employee.getHighestPaidEmp(empList));
    }
}
