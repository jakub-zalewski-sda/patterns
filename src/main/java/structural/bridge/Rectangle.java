package structural.bridge;

public class Rectangle extends Shape {

    public Rectangle(Colour colour) {
        super(colour);
    }

    @Override
    public String draw() {
        return colour.getName() + " rectangle";
    }
}
