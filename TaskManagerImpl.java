package taskmanager;

import java.util.Scanner;

public class TaskManagerImpl implements TaskManager {
    private TaskList taskList;

    public TaskManagerImpl() {
        taskList = new TaskList();
    }

    @Override
    public void addTask(Task task) {
        taskList.add(task);
        System.out.println("Task added successfully.");
    }

    @Override
    public void removeTask(Task task) {
        if (taskList.contains(task)) {
            taskList.remove(task);
            System.out.println("Task removed successfully.");
        } else {
            System.out.println("Task not found.");
        }
    }

    @Override
    public void displayTasks() {
        if (taskList.isEmpty()) {
            System.out.println("No tasks found.");
        } else {
            System.out.println("Task List:");
            for (Task task : taskList) {
                System.out.println(task);
            }
        }
    }
}
