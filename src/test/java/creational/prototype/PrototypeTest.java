package creational.prototype;

import org.junit.Assert;
import org.junit.Test;

public class PrototypeTest {

    @Test
    public void shouldClonePrototype() {
        //given
        Prototype prototype = new Prototype("name", "type");

        //when
        Prototype clonedPrototype = prototype.clone();

        //then
        Assert.assertEquals(prototype.getName(), clonedPrototype.getName());
        Assert.assertEquals(prototype.getType(), clonedPrototype.getType());
        Assert.assertNotSame(prototype, clonedPrototype);
        Assert.assertSame(prototype.getBasket(), clonedPrototype.getBasket());
    }
}
