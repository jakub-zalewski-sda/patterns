package playground2.other.patterns.structural.bridge;

public class Runner {

    public static void main(String[] args) {
        Shape triangle = new Triangle(new Red());

        Shape rectangle = new Rectangle(new Blue());

        triangle.draw();
        rectangle.draw();
    }
}
