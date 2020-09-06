package playground.decorator;

public class Addition implements Drink {

    private final Drink drink;
    private String description;
    private int price;

    public Addition(Drink drink, String description, int price) {
        this.drink = drink;
        this.description = description;
        this.price = price;
    }

    @Override
    public String description() {
        return drink.description() + ", " + description;
    }

    @Override
    public int price() {
        return drink.price() + price;
    }
}
