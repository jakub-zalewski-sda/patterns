package playground2.other.patterns.creational.builder;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;

public class Runner {
    public static void main(String[] args) {
//        DayPlan dayPlan0 = new DayPlan(LocalDate.now(), null, new ArrayList<>());
//        DayPlan dayPlan1 = new DayPlan(LocalDate.parse("2020-09-28"), Arrays.asList("breakfast"), Arrays.asList("walk"));

        DayPlan dayPlan0ByBuilder = DayPlan.DayPlanBuilder
            .forDate(LocalDate.now())
            .build();

        DayPlan dayPlan1ByBuilder = DayPlan.DayPlanBuilder
            .forDate(LocalDate.parse("2020-09-28"))
            .addMeal("breakfast")
            .addActivity("walk")
            .build();

        DayPlan dayPlan2ByBuilder = DayPlan.DayPlanBuilder
            .forDate(LocalDate.parse("2020-09-29"))
            .addMeal("breakfast")
            .addMeal("dinner")
            .addActivity("walk")
            .addActivity("football")
            .addFreeTimeActivity("dance")
            .build();

    }
}
