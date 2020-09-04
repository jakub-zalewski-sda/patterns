package creational.prototype;

public class Prototype implements Cloneable {

    private String name;
    private String type;

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

    @Override
    public Prototype clone() {
        try {
            return (Prototype) super.clone();
        } catch (CloneNotSupportedException exception) {
            throw new RuntimeException();
        }
    }
}
