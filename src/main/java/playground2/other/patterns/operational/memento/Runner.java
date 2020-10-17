package playground2.other.patterns.operational.memento;

public class Runner {

    public static void main(String[] args) {
        Game game = new Game();

        System.out.println(game.getHealth());
        System.out.println(game.getLevel());

        game.increaseLevel();
        game.increaseLevel();

        game.decreaseHealth();
        game.decreaseHealth();

        System.out.println(game.getHealth());
        System.out.println(game.getLevel());

        GameMemento gameMemento1 = game.save();

        System.out.println("----");
        game.increaseLevel();
        game.increaseLevel();

        game.decreaseHealth();
        game.decreaseHealth();

        System.out.println(game.getHealth());
        System.out.println(game.getLevel());

        GameMemento gameMemento2 = game.save();


        game.restoreStateFromMemento(gameMemento1);
        System.out.println("----");
        System.out.println(game.getHealth());
        System.out.println(game.getLevel());
    }
}
