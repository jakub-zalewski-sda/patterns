package structural.decorator;

public abstract class Addition implements Drink {

    protected Drink drink;
    protected String description;
    protected float price;

    public Addition(Drink drink, String description, float price) {
        this.drink = drink;
        this.description = description;
        this.price = price;
    }

    @Override
    public String description() {
        return drink.description() + " + " + description;
    }

    @Override
    public float price() {
        return drink.price() + price;
    }
}
