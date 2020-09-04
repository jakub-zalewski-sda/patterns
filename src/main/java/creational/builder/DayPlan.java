package creational.builder;

import java.time.LocalDate;
import java.util.List;

public class DayPlan {

    private final LocalDate date;
    private final List<String> meal;
    private final List<String> activities;

    DayPlan(LocalDate date, List<String> meal, List<String> activities) {
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
}
