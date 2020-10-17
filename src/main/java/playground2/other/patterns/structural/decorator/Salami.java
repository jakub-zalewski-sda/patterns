package playground2.other.patterns.structural.decorator;

public class Salami implements Pizza {

    @Override
    public String getName() {
        return "salami";
    }

    @Override
    public int getPrice() {
        return 20;
    }
}
