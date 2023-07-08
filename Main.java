package taskmanager;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        TaskManager taskManager = new TaskManagerImpl();
        Scanner scanner = new Scanner(System.in);

        boolean running = true;
        while (running) {
            System.out.println("\nTask Manager Menu:");
            System.out.println("1. Add Task");
            System.out.println("2. Remove Task");
            System.out.println("3. Display Tasks");
            System.out.println("4. Quit");
            System.out.print("Enter your choice: ");

            int choice = scanner.nextInt();
            scanner.nextLine(); // Consume the newline character

            switch (choice) {
                case 1:
                    addTask(scanner, taskManager);
                    break;
                case 2:
                    removeTask(scanner, taskManager);
                    break;
                case 3:
                    taskManager.displayTasks();
                    break;
                case 4:
                    running = false;
                    System.out.println("Task Manager closed.");
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
                    break;
            }
        }

        scanner.close();
    }

    private static void addTask(Scanner scanner, TaskManager taskManager) {
        System.out.print("Enter task name: ");
        String name = scanner.nextLine();
        System.out.print("Enter task priority: ");
        int priority = scanner.nextInt();

        Task task = new Task(name, priority);
        taskManager.addTask(task);
    }

    private static void removeTask(Scanner scanner, TaskManager taskManager) {
        System.out.print("Enter task name: ");
        String name = scanner.nextLine();
        System.out.print("Enter task priority: ");
        int priority = scanner.nextInt();

        Task task = new Task(name, priority);
        taskManager.removeTask(task);
    }
}
