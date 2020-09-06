package creational.builder_inner_class;

import java.time.LocalDate;

public class Runner {
    public static void main(String[] args) {
        DayPlan dayPlan = DayPlan.builder()
            .forDate(LocalDate.now())
            .addActivity("walk")
            .addActivity("squash")
            .addMeal("breakfast")
            .addMeal("dinner")
            .build();
    }
}
