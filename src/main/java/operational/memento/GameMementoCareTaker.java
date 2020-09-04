package operational.memento;

import java.util.ArrayDeque;
import java.util.Deque;

public class GameMementoCareTaker {

    private final Deque<GameMemento> gameMementos = new ArrayDeque<>();

    public void addMemento(GameMemento gameMemento) {
        gameMementos.add(gameMemento);
    }

    public GameMemento getLast() {
        return gameMementos.getLast();
    }
}
