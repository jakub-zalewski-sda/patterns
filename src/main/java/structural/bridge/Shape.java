package structural.bridge;

abstract class Shape {
    protected Colour colour;

    public Shape(Colour colour) {
        this.colour = colour;
    }

    abstract String draw();
}
