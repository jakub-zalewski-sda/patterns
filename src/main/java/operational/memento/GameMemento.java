package operational.memento;

import java.util.List;

public class GameMemento {

    private final int level;
    private final int health;
    private final List<String> items;

    public GameMemento(int level, int health, List<String> items) {
        this.level = level;
        this.health = health;
        this.items = items;
    }

    public int getLevel() {
        return level;
    }

    public int getHealth() {
        return health;
    }

    public List<String> getItems() {
        return items;
    }
}
