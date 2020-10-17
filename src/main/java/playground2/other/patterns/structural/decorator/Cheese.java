package playground2.other.patterns.structural.decorator;

public class Cheese extends Addition {
    public Cheese(Pizza pizza) {
        super(pizza, "cheese", 3);
    }
}
