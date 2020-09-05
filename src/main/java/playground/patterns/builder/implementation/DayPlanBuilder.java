package playground.patterns.builder.implementation;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class DayPlanBuilder {
    private LocalDate date;
    private List<String> meals;
    private List<String> activities;

    private DayPlanBuilder() {
        this.meals = new ArrayList<>();
        this.activities = new ArrayList<>();
    }

    public static DayPlanBuilder builder() {
        return new DayPlanBuilder();
    }

    public DayPlanBuilder forDate(LocalDate date) {
        this.date = date;

        return this;
    }

    public DayPlanBuilder addMeal(String meal) {
        meals.add(meal);

        return this;
    }

    public DayPlanBuilder addActivity(String activity) {
        activities.add(activity);

        return this;
    }

    public DayPlan build() {
        return new DayPlan(date, meals, activities);
    }
}
