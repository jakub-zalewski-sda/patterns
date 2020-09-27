package playground2.other.patterns.creational.builder;;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class DayPlan {

    private LocalDate date;
    private List<String> meals;
    private List<String> activities;
    private List<String> freeTimeActivities;

    private DayPlan(LocalDate date, List<String> meals, List<String> activities, List<String> freeTimeActivities) {
        this.date = date;
        this.meals = meals;
        this.activities = activities;
        this.freeTimeActivities = freeTimeActivities;
    }

    public String getMeals() {
        return meals.stream()
            .collect(Collectors.joining(","));
    }

    public static class DayPlanBuilder {

        private LocalDate date;
        private List<String> meals;
        private List<String> activities;
        private List<String> freeTimeActivities;

        public DayPlanBuilder(LocalDate date) {
            this.date = date;
            this.meals = new ArrayList<>();
            this.activities = new ArrayList<>();
        }

        public static DayPlan.DayPlanBuilder forDate(LocalDate localDate) {
            return new DayPlan.DayPlanBuilder(localDate);
        }

        public DayPlan.DayPlanBuilder addMeal(String meal) {
            if (meal == null || meal.length() == 0) {
                throw new IllegalArgumentException("required");
            }
            this.meals.add(meal);
            return this;
        }

        public DayPlan.DayPlanBuilder addActivity(String activity) {
            this.activities.add(activity);
            return this;
        }

        public DayPlan.DayPlanBuilder addFreeTimeActivity(String freeTimeActivity) {
            this.freeTimeActivities.add(freeTimeActivity);
            return this;
        }

        public DayPlan build() {
            return new DayPlan(date, meals, activities, freeTimeActivities);
        }

    }
}
