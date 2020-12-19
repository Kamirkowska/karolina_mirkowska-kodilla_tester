package com.kodilla.stream.homework;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class TaskRepository {

    public static List<Task> getTasks() {
        List<Task> tasks = new ArrayList<>();
        tasks.add(new Task("Project X", LocalDate.of(2021,2,12), LocalDate.of(2021,3,11)));
        tasks.add(new Task("Project Y", LocalDate.of(2021,2,18), LocalDate.of(2021,4,21)));
        tasks.add(new Task("Project Z", LocalDate.of(2021,4,1), LocalDate.of(2021,8,31)));
        tasks.add(new Task("Project Q", LocalDate.of(2021,6,1), LocalDate.of(2022,5,30)));
        tasks.add(new Task("Project S", LocalDate.of(2020,7,17), LocalDate.of(2020,11,28)));
        return tasks;
    }
}
