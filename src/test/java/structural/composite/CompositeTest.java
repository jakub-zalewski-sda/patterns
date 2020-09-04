package structural.composite;

import org.junit.Assert;
import org.junit.Test;

public class CompositeTest {

    @Test
    public void shouldCorrectlyCreateSoldier() {
        //given
        UnitFactory unitFactory = new UnitFactory();

        //when
        Unit soldier = unitFactory.createSoldier();

        //then
        Assert.assertEquals(soldier.getPower(), 5);
    }


    @Test
    public void shouldCorrectlyCreateArmy() {
        //given
        UnitFactory unitFactory = new UnitFactory();

        //when
        Unit army = unitFactory.createArmy();

        //then
        Assert.assertEquals(army.getPower(), 30);

    }

}
