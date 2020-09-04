package creational.singleton;

import org.junit.Test;

import static org.junit.Assert.assertSame;

public class SimpleSingletonTest {

    @Test
    public void shouldReturnSameInstance() {
        //given
        SimpleSingleton singleton1 = SimpleSingleton.getInstance();

        //when
        SimpleSingleton singleton2 = SimpleSingleton.getInstance();

        //then
        assertSame(singleton1, singleton2);
    }
}
