package structural.bridge;

import org.junit.Assert;
import org.junit.Test;

public class RectangleTest {

    @Test
    public void shouldCreateRedRectangle() {
        //given
        Rectangle rectangle = new Rectangle(new Red());

        //when
        String drawResult = rectangle.draw();

        //then
        Assert.assertEquals(drawResult, "red rectangle");
    }

    @Test
    public void shouldCreateBlueRectangle() {
        //given
        Rectangle rectangle = new Rectangle(new Blue());

        //when
        String drawResult = rectangle.draw();

        //then
        Assert.assertEquals(drawResult, "blue rectangle");
    }
}
