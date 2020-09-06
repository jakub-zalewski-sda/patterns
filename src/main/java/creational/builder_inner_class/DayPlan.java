package creational.builder_inner_class;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class DayPlan {

    private final LocalDate date;
    private final List<String> meal;
    private final List<String> activities;

    private DayPlan(LocalDate date, List<String> meal, List<String> activities) {
        this.date = date;
        this.meal = meal;
        this.activities = activities;
    }

    public LocalDate getDate() {
        return date;
    }

    public List<String> getMeal() {
        return meal;
    }

    public List<String> getActivities() {
        return activities;
    }


    public static Builder builder() {
        return new Builder(new ArrayList<>(), new ArrayList<>());
    }

    public static class Builder {

        private LocalDate date;
        private final List<String> meals;
        private final List<String> activities;

        Builder(List<String> meals, List<String> activities) {
            this.meals = meals;
            this.activities = activities;
        }

        public Builder forDate(LocalDate date) {
            this.date = date;
            return this;
        }

        public Builder addMeal(String meal) {
            this.meals.add(meal);
            return this;
        }

        public Builder addActivity(String activity) {
            activities.add(activity);
            return this;
        }

        public DayPlan build() {
            return new DayPlan(date, new ArrayList<>(meals), new ArrayList<>(activities));
        }
    }
}
