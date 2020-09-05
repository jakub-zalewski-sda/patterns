package creational.prototype;

public class Prototype implements Cloneable {

    private String name;
    private String type;

    private Basket basket;


    public Prototype(String name, String type) {
        this.name = name;
        this.type = type;
    }

    public String getName() {
        return name;
    }

    public String getType() {
        return type;
    }

    public Basket getBasket() {
        return basket;
    }

    @Override
    public Prototype clone() {
        try {
            return (Prototype) super.clone();
        } catch (CloneNotSupportedException exception) {
            throw new RuntimeException();
        }
    }
}
