package playground2.other.patterns.structural.decorator;

public class Margeritta implements Pizza {

    @Override
    public String getName() {
        return "margeritta";
    }

    @Override
    public int getPrice() {
        return 15;
    }
}
