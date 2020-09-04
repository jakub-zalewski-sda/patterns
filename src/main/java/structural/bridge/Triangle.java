package structural.bridge;

public class Triangle extends Shape {

    public Triangle(Colour colour) {
        super(colour);
    }

    @Override
    String draw() {
        return colour.getName() + " triangle";
    }
}
