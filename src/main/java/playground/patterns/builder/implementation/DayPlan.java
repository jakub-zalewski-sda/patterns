package playground.patterns.builder.implementation;

import java.time.LocalDate;
import java.util.List;

public class DayPlan {
    private LocalDate date;
    private List<String> meals;
    private List<String> activities;

    protected DayPlan(LocalDate date, List<String> meals, List<String> activities) {
        this.date = date;
        this.meals = meals;
        this.activities = activities;
    }


}
