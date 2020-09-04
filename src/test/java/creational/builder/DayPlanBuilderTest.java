package creational.builder;

import org.junit.Assert;
import org.junit.Test;

import java.time.LocalDate;
import java.util.Arrays;

public class DayPlanBuilderTest {

    @Test
    public void shouldBuildDayPlan() {
        //given
        DayPlanBuilder dayPlanBuilder = DayPlanBuilder.builder()
            .forDate(LocalDate.now())
            .addActivity("football")
            .addActivity("walk")
            .addMeal("breakfast")
            .addMeal("dinner")
            .addMeal("supper");

        //when
        DayPlan dayPlan = dayPlanBuilder.build();

        //then
        Assert.assertEquals(dayPlan.getDate(), LocalDate.now());
        Assert.assertEquals(dayPlan.getMeal(), Arrays.asList("breakfast", "dinner", "supper"));
        Assert.assertEquals(dayPlan.getActivities(), Arrays.asList("football", "walk"));
    }
}
