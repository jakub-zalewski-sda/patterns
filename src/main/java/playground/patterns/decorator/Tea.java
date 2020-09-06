package playground.patterns.decorator;

public class Tea implements Drink {
    @Override
    public String description() {
        return "just tea";
    }

    @Override
    public int price() {
        return 4;
    }
}
