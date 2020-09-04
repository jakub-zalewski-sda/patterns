package structural.decorator;

public class Milk extends Addition {

    public Milk(Drink drink) {
        super(drink, "milk", 1f);
    }
}
