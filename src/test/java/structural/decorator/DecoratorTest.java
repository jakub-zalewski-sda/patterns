package structural.decorator;

import org.junit.Assert;
import org.junit.Test;

public class DecoratorTest {

    @Test
    public void shouldDecorateDrink() {
        //given
        Coffee coffee = new Coffee();

        //when
        Drink coffeeWithSugarAndMilk = new Milk(new Sugar(coffee));

        //then
        System.out.println(coffeeWithSugarAndMilk.description());
        Assert.assertEquals(coffeeWithSugarAndMilk.description(), "coffee + sugar + milk");
        Assert.assertEquals(coffeeWithSugarAndMilk.price(), 6.5f, 0);
    }
}
