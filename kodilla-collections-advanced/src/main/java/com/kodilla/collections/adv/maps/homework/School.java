package com.kodilla.collections.adv.maps.homework;

import java.util.ArrayList;
import java.util.List;

public class School {
    private String schoolName;

    private List<Double> students = new ArrayList<>();

    public School(String schoolName, double... students) {
        this.schoolName = schoolName;

        for (double student : students)
            this.students.add(student);
    }

    public double getSum() {
        double sum = 0.0;
        for (double student : students)
            sum += student;
        return sum;
    }

    public String getSchoolName() {
        return schoolName;
    }

    @Override
    public String toString() {
        return "School{" +
                "schoolName='" + schoolName + '\'' +
                ", students=" + students +
                '}';
    }
}
