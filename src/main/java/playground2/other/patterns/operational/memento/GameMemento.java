package playground2.other.patterns.operational.memento;

public class GameMemento {
    private int health;
    private int level;

    public GameMemento(int health, int level) {
        this.health = health;
        this.level = level;
    }

    public int getHealth() {
        return health;
    }

    public int getLevel() {
        return level;
    }
}
