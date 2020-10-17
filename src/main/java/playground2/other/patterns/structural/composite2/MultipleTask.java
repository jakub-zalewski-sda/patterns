package playground2.other.patterns.structural.composite2;

import java.util.List;

public class MultipleTask implements Task {

    private List<Task> tasks;

    public MultipleTask(List<Task> tasks) {
        this.tasks = tasks;
    }

    @Override
    public void doSomething() {
        tasks.forEach(task -> task.doSomething());
    }
}
