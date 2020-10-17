package operational.interpreter;

import org.junit.Assert;
import org.junit.Test;

public class InterpreterTest {

    @Test
    public void shouldAdd() {
        //given
        Interpreter interpreter = new NaturalStyleInterpreter(new Calculator());

        //when
        double result = interpreter.interpret("1 + 2");

        //then
        Assert.assertEquals(result, 3, 0);
    }

    @Test
    public void shouldSubtract() {
        //given
        Interpreter interpreter = new NaturalStyleInterpreter(new Calculator());

        //when
        double result = interpreter.interpret("1 - 2");

        //then
        Assert.assertEquals(result, -1, 0);
    }

}
