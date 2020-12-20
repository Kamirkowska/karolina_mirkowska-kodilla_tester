package com.kodilla.optional.homework;

import java.util.ArrayList;
import java.util.List;

public class Application {
    public static void main(String[] args) {

        List<Student> students = new ArrayList<>();
        students.add(new Student("Adam", new Teacher("prof. Mackiewicz")));
        students.add(new Student("Liam", null));
        students.add(new Student("Emilia", new Teacher("prof. Kowalski")));
        students.add(new Student("Dawid", new Teacher("prof. Szymanowicz")));
        students.add(new Student("Aneta", null));
        
        for (Student student : students)
            System.out.println("Uczeń: " + student.getName() + ", nauczyciel: " + student.getTeacher().getName());
    }
}
