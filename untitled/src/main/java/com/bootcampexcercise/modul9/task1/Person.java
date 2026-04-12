package com.bootcampexcercise.modul9.task1;

public class Person {
    private int weight;
    private float height;

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public float getHeight() {
        return height;
    }

    public void setHeight(float height) {
        this.height = height;
    }

    public String getBodyMassIndex(float height, int weight) {
        if (height <= 0 || weight <= 0) {
            return "Height and weight must be more than 0";
        }

        if (height > 3) {
            return "Height is too big";
        }

        if (weight > 500) {
            return "Weight is too big";
        }

        float bmi = weight / (height * height);
        return "BMI = " + bmi;
    }
}
