package playground.patterns.decorator;

public class Coffee implements Drink {
    @Override
    public String description() {
        return "just coffee";
    }

    @Override
    public int price() {
        return 5;
    }
}
