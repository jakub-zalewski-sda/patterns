package playground.patterns.builder;

import playground.patterns.builder.implementation.DayPlan;
import playground.patterns.builder.implementation.DayPlanBuilder;

import java.time.LocalDate;
import java.util.Arrays;

public class Runner {
    public static void main(String[] args) {

        DayPlan dayPlan0 = DayPlanBuilder.builder()
            .forDate(LocalDate.now())
            .addMeal("supper")
            .addMeal("supper1")
            .addMeal("supper2")
            .addMeal("supper3")
            .build();

    }
}
