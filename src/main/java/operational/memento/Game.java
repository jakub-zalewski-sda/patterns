package operational.memento;

import java.util.ArrayList;
import java.util.List;

public class Game {
    private int level;
    private int health;
    private List<String> items;

    public Game() {
        level = 0;
        health = 100;
        items = new ArrayList<>();
    }

    public void addLevel() {
        level++;
    }

    public void decreaseHealth() {
        health--;
    }

    public void addItem(String item) {
        items.add(item);
    }

    public boolean hasLevel(int level) {
        return this.level == level;
    }

    public boolean hasHealth(int health) {
        return this.health == health;
    }

    public boolean containsItem(String item) {
        return items.contains(item);
    }

    public GameMemento createMemento() {
        return new GameMemento(level, health, new ArrayList<>(items));
    }

    public void restoreStateFromMemento(GameMemento gameMemento) {
        level = gameMemento.getLevel();
        health = gameMemento.getHealth();
        items = new ArrayList<>(gameMemento.getItems());
    }
}
