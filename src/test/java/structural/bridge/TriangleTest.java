package structural.bridge;

import org.junit.Assert;
import org.junit.Test;

public class TriangleTest {

    @Test
    public void shouldCreateRedTriangle() {
        //given
        Triangle triangle = new Triangle(new Red());

        //when
        String drawResult = triangle.draw();

        //then
        Assert.assertEquals(drawResult, "red triangle");
    }

    @Test
    public void shouldCreateBlueTriangle() {
        //given
        Triangle triangle = new Triangle(new Blue());

        //when
        String drawResult = triangle.draw();

        //then
        Assert.assertEquals(drawResult, "blue triangle");
    }
}
