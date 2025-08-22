package app;

import java.time.LocalDate;

public class TaskGenerator {

    public static TaskList<Task> createSampleTaskList() {
        TaskList<Task> taskList = new TaskList<>();

        taskList.addTask(Task.builder()
                .title("Buy seeds")
                .description("Buy vegetable seeds for the garden")
                .dueDate(LocalDate.of(2025, 8, 25))
                .build());

        taskList.addTask(GardenTask.builder()
                .title("Water roses")
                .description("Water the rose bushes in the garden")
                .dueDate(LocalDate.of(2025, 8, 20))
                .gardenLocation("Rose Garden")
                .build());

        taskList.addTask(Task.builder()
                .title("Mow lawn")
                .description("Mow the front yard lawn")
                .dueDate(LocalDate.now())
                .build());

        taskList.addTask(GardenTask.builder()
                .title("Trim hedge")
                .description("Trim the front yard hedge")
                .dueDate(LocalDate.of(2025, 8, 22))
                .gardenLocation("Front Yard")
                .build());

        taskList.addTask(Task.builder()
                .title("Buy fertilizer")
                .description("Get fertilizer for vegetable patch")
                .dueDate(LocalDate.of(2025, 8, 23))
                .build());

        taskList.addTask(GardenTask.builder()
                .title("Plant tomatoes")
                .description("Plant tomato seedlings in the garden")
                .dueDate(LocalDate.of(2025, 8, 24))
                .gardenLocation("Vegetable Garden")
                .build());

        taskList.addTask(Task.builder()
                .title("Clean garage")
                .description("Organize and clean the garage")
                .dueDate(LocalDate.of(2025, 8, 26))
                .build());

        taskList.addTask(GardenTask.builder()
                .title("Harvest carrots")
                .description("Harvest ripe carrots from the garden")
                .dueDate(LocalDate.of(2025, 8, 21))
                .gardenLocation("Vegetable Garden")
                .build());

        taskList.addTask(Task.builder()
                .title("Buy watering can")
                .description("Purchase a new watering can for garden tasks")
                .dueDate(LocalDate.of(2025, 8, 27))
                .build());

        taskList.addTask(GardenTask.builder()
                .title("Weed flower beds")
                .description("Remove weeds from flower beds")
                .dueDate(LocalDate.of(2025, 8, 22))
                .gardenLocation("Front Garden")
                .build());

        return taskList;
    }
}

