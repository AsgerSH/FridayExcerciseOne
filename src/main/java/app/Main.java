package app;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        // Runs my generator with 10 tasks
        TaskList<Task> taskList = TaskGenerator.createSampleTaskList();

        System.out.println("List of all tasks: ");
        taskList.printTasks();

        System.out.println("\nTasks with keyword 'water': ");
        taskList.filterByKeyword("water").forEach(System.out::println);

        System.out.println("\nSorted by due date:");
        taskList.sortTasksDueDate().forEach(System.out::println);

        System.out.println("\nTasks due today:");
        taskList.getTasksDueToday().forEach(System.out::println);

        System.out.println("\nOverdue tasks:");
        taskList.getOverdueTasks().forEach(System.out::println);


        // Demonstrerer bare iterable
//        System.out.println("\nIterating with for-each:");
//        for (Task task : taskList) {
//            System.out.println(task);
//        }
    }


}