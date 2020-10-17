package playground2.other.patterns.operational.memento;

public class Game {

    private int health;
    private int level;

    private Level levelObject;


    public Game() {
        health = 100;
        level = 1;
    }

    public GameMemento save() {
        return new GameMemento(health, levelObject.getLevel());
    }

    public void restoreStateFromMemento(GameMemento gameMemento) {
        this.level = gameMemento.getLevel();
        this.health = gameMemento.getHealth();
    }


    public void increaseLevel() {
        level ++;
    }

    public void decreaseHealth() {
        health --;
    }

    public int getHealth() {
        return health;
    }

    public int getLevel() {
        return level;
    }
}
