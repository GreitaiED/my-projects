package com.bootcampexcercise.modul7.task3;

public class CustomExceptionActivityTest {
    public static void main(String[] args) {
        CustomExceptionActivityTest activity = new CustomExceptionActivityTest();

        try {
            activity.validateUser("John");
        } catch (CustomExceptionActivity e) {
            System.out.println(e.getMessage());
        }

        try {
            activity.validateUser("Anna");
        } catch (CustomExceptionActivity e) {
            System.out.println(e.getMessage());
        }

        try {
            activity.validateUser("Mike");
        } catch (CustomExceptionActivity e) {
            System.out.println(e.getMessage());
        }

        try {
            activity.validateUser("Stacie");
        } catch (CustomExceptionActivity e) {
            System.out.println(e.getMessage());
        }
    }

    void validateUser(String name) throws CustomExceptionActivity {
        String[] validUsers = {"John", "Mike", "Shanti", "Stacie", "Edvards"};
        int flag = 0;

        for (int i = 0; i < 4; i++) {
            if (validUsers[i].equals(name)) {
                flag = 1;
            }
        }

        if (flag == 0) {
            throw new CustomExceptionActivity();
        } else if (flag == 1) {
            System.out.println("Welcome to Payroll program");
        }
    }
}
