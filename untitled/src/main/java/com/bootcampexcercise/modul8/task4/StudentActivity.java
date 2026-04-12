package com.bootcampexcercise.modul8.task4;

import java.util.ArrayList;

public class StudentActivity {

    public static void main(String[] args) {

        ArrayList<Student> students = new ArrayList<>();

        addStudent(students, new Student(1, "Alice", 85.5));
        addStudent(students, new Student(2, "Bob", 90.0));
        addStudent(students, new Student(3, "Charlie", 78.2));
        addStudent(students, new Student(4, "Disha", 92.8));

        System.out.println("All Students:");
        printAllStudents(students);

        students.removeIf(student -> student.getId() == 3);

        System.out.println("\nAfter Removing ID 3:");
        printAllStudents(students);

        Student top = findHighest(students);
        System.out.println("\nHighest Grade Student:");
        top.printStudent();
    }

    public static void addStudent(ArrayList<Student> list, Student student) {
        for (Student currentStudent : list) {
            if (currentStudent.getId() == student.getId()) {
                System.out.println("Duplicate ID found. Student not added: " + student.getId());
                return;
            }
        }
        list.add(student);
    }

    public static void printAllStudents(ArrayList<Student> list) {
        for (Student student : list) {
            student.printStudent();
        }
    }

    public static Student findHighest(ArrayList<Student> list) {
        Student highest = list.get(0);
        for (Student student : list) {
            if (student.getGrade() > highest.getGrade()) {
                highest = student;
            }
        }
        return highest;
    }
}
