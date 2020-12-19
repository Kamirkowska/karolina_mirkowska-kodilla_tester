package com.kodilla.stream.homework;

import com.kodilla.stream.UsersRepository;

import java.time.LocalDate;
import java.util.List;
import java.util.stream.Collectors;

public class TaskManager {
    public static void main(String[] args) {

        LocalDate currentDate = LocalDate.now();

        List<String> tasks = TaskRepository.getTasks()
                .stream()
                .filter(t -> t.getDeadline().isAfter(currentDate))
                .map(TaskManager::getTaskName)
                .collect(Collectors.toList());
        System.out.println(tasks);

        List<LocalDate> deadlines = TaskRepository.getTasks()
                .stream()
                .filter(t -> t.getDeadline().isAfter(currentDate))
                .map(TaskManager::getDeadline)
                .collect(Collectors.toList());
        System.out.println(deadlines);
    }

    public static String getTaskName(Task task) {
        return task.getName();
    }

    public static LocalDate getDeadline(Task task) {
        return task.getDeadline();
    }
}
