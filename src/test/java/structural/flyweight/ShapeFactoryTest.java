package structural.flyweight;

import org.junit.Assert;
import org.junit.Test;

public class ShapeFactoryTest {

    @Test
    public void shouldReturnTheSameObject() {
        //given
        ShapeFactory shapeFactory = new ShapeFactory();
        Shape shape = shapeFactory.createShape("triangle");

        //when
        Shape shape2 = shapeFactory.createShape("triangle");

        //then
        Assert.assertSame(shape, shape2);
    }
}
