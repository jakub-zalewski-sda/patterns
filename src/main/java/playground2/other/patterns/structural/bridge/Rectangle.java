package playground2.other.patterns.structural.bridge;

public class Rectangle extends Shape {

    public Rectangle(Colour colour) {
        super(colour);
    }

    @Override
    void draw() {
        System.out.println(colour.getName() + " rectangle");
    }
}
