package com.example.mylist;

import org.springframework.scheduling.config.Task;
import org.springframework.web.servlet.view.RedirectView;

import java.util.ArrayList;

public class MylistController {
    private final ArrayList<Task> tasks;

    public ToDoListController() {
        tasks = new ArrayList<>();
    }
    @getMapping("/tasks")
    public ArrayList<Task> showTasks() {
        return tasks;
    }

    @postMapping("/tasks")
    public RedirectView addTask(Task task) {
        tasks.add(task);
        return new RedirectView("/");
    }
}
