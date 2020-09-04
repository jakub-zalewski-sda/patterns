package creational.builder;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class DayPlanBuilder {

    private LocalDate date;
    private final List<String> meals;
    private final List<String> activities;

    DayPlanBuilder(List<String> meals, List<String> activities) {
        this.meals = meals;
        this.activities = activities;
    }

    public static DayPlanBuilder builder() {
        return new DayPlanBuilder(new ArrayList<>(), new ArrayList<>());
    }

    public DayPlanBuilder forDate(LocalDate date) {
        this.date = date;
        return this;
    }

    public DayPlanBuilder addMeal(String meal) {
        this.meals.add(meal);
        return this;
    }

    public DayPlanBuilder addActivity(String activity) {
        activities.add(activity);
        return this;
    }

    public DayPlan build() {
        return new DayPlan(date, new ArrayList<>(meals), new ArrayList<>(activities));
    }
}
