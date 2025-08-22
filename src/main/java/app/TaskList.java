package app;

import lombok.Data;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.stream.Collectors;

@Data
public class TaskList<T extends Task> implements Iterable<T> {
    private final List<T> tasks = new ArrayList<>();

    // Add a task to list
    public void addTask(T task) {
        tasks.add(task);
    }

    // Remove a task from list
    public void removeTaskByTitle(String title) {
        tasks.removeIf(task -> task.getTitle().equalsIgnoreCase(title));
    }

    // Filter task based on keyword in the title or description
    public List<T> filterByKeyword(String keyword) {
        String lowerCaseKeyword = keyword.toLowerCase();
        return tasks.stream()
                .filter(task -> task.getTitle().toLowerCase().contains(lowerCaseKeyword)
                        || task.getDescription().toLowerCase().contains(lowerCaseKeyword))
                .collect(Collectors.toList());
    }

    // Sort tasks by due date (Sæt reverse hvis den skal være omvendt)
    public List<T> sortTasksDueDate() {
        return tasks.stream()
                .sorted(Comparator.comparing(T::getDueDate))
                .collect(Collectors.toList());
    }

    // Get tasks that are due today
    public List<T> getTasksDueToday() {
        LocalDate today = LocalDate.now();
        return tasks.stream()
                .filter(task -> task.getDueDate().isEqual(today))
                .collect(Collectors.toList());
    }

    // Get tasks that are overdue
    public List<T> getOverdueTasks() {
        LocalDate today = LocalDate.now();
        return tasks.stream()
                .filter(task -> task.getDueDate().isBefore(today))
                .collect(Collectors.toList());
    }

    // Print the list of tasks
    public void printTasks() {
        tasks.forEach(System.out::println);
    }


    @Override
    public Iterator<T> iterator() {
        return tasks.iterator();
    }
}
