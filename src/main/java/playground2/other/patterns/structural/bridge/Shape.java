package playground2.other.patterns.structural.bridge;

public abstract class Shape {

    public Shape(Colour colour) {
        this.colour = colour;
    }

    protected Colour colour;

    abstract void draw();
}
