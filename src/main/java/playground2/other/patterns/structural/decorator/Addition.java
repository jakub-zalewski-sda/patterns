package playground2.other.patterns.structural.decorator;

public abstract class Addition implements Pizza {

    private Pizza pizza;
    private String name;
    private int price;

    public Addition(Pizza pizza, String name, int price) {
        this.pizza = pizza;
        this.name = name;
        this.price = price;
    }

    @Override
    public String getName() {
        return pizza.getName() + " " + name;
    }

    @Override
    public int getPrice() {
        return pizza.getPrice() + price;
    }
}
