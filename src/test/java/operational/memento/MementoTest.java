package operational.memento;

import org.junit.Assert;
import org.junit.Test;

import java.util.Collections;

public class MementoTest {

    @Test
    public void shouldCreateMemento() {
        //given
        Game game = new Game();
        game.addLevel();
        game.decreaseHealth();
        game.addItem("item1");

        //when
        GameMemento gameMemento = game.createMemento();

        //then
            Assert.assertEquals(gameMemento.getLevel(), 1);
            Assert.assertEquals(gameMemento.getHealth(), 99);
            Assert.assertEquals(gameMemento.getItems(), Collections.singletonList("item1"));
    }

    @Test
    public void shouldRestoreStateFromMemento() {
        //given
        Game game = new Game();
        game.addLevel();
        game.decreaseHealth();
        game.addItem("item1");

        GameMemento gameMemento = game.createMemento();

        Assert.assertEquals(gameMemento.getLevel(), 1);
        Assert.assertEquals(gameMemento.getHealth(), 99);
        Assert.assertEquals(gameMemento.getItems(), Collections.singletonList("item1"));


        game.addLevel();
        game.decreaseHealth();
        game.addItem("item2");

        Assert.assertTrue(game.containsItem("item1"));
        Assert.assertTrue(game.containsItem("item2"));
        Assert.assertTrue(game.hasHealth(98));
        Assert.assertTrue(game.hasLevel(2));

        //when
        game.restoreStateFromMemento(gameMemento);

        //then
        Assert.assertEquals(gameMemento.getLevel(), 1);
        Assert.assertEquals(gameMemento.getHealth(), 99);
        Assert.assertEquals(gameMemento.getItems(), Collections.singletonList("item1"));
    }

}
