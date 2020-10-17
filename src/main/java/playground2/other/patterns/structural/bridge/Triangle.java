package playground2.other.patterns.structural.bridge;

public class Triangle extends Shape {
    public Triangle(Colour colour) {
        super(colour);
    }

    @Override
    void draw() {
        System.out.println(colour.getName() + " triangle");
    }
}
