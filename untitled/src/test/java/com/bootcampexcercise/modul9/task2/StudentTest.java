package com.bootcampexcercise.modul9.task2;

import com.bootcampexcercise.modul8.task4.Student;
import com.bootcampexcercise.modul8.task4.StudentActivity;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class StudentTest {

    @Test
    public void testStudentConstructor() {
        Student student = new Student(1, "Alice", 85.5);

        assertEquals(1, student.getId());
        assertEquals("Alice", student.getName());
        assertEquals(85.5, student.getGrade());
    }

    @Test
    public void testStudentSetters() {
        Student student = new Student(1, "A", 50.0);

        student.setId(2);
        student.setName("Bob");
        student.setGrade(90.0);

        assertEquals(2, student.getId());
        assertEquals("Bob", student.getName());
        assertEquals(90.0, student.getGrade());
    }

    @Test
    public void testAddStudent() {
        ArrayList<Student> list = new ArrayList<>();

        StudentActivity.addStudent(list, new Student(1, "Anna", 80.0));
        StudentActivity.addStudent(list, new Student(2, "John", 70.0));

        assertEquals(2, list.size());
    }

    @Test
    public void testAddStudentDuplicateId() {
        ArrayList<Student> list = new ArrayList<>();

        StudentActivity.addStudent(list, new Student(1, "Anna", 80.0));
        StudentActivity.addStudent(list, new Student(1, "Maria", 95.0));

        assertEquals(1, list.size());
    }

    @Test
    public void testFindHighest() {
        ArrayList<Student> list = new ArrayList<>();

        list.add(new Student(1, "Anna", 80.0));
        list.add(new Student(2, "John", 95.0));
        list.add(new Student(3, "Maria", 75.0));

        Student highest = StudentActivity.findHighest(list);

        assertEquals(2, highest.getId());
        assertEquals("John", highest.getName());
        assertEquals(95.0, highest.getGrade());
    }
}
