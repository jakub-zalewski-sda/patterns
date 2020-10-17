package playground2.other.patterns.operational.command_with_composite;

import java.util.Arrays;

public class Runner {

    public static void main(String[] args) {
        Task task1 = new SendEmailTask();
        Task task2 = new SendSmsTask();

        Task multipleTask = new MultipleTask(Arrays.asList(task1, task2));

        Scheduler scheduler = new Scheduler();

        scheduler.run(multipleTask);
    }

}
