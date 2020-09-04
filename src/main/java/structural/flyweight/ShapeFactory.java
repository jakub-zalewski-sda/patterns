package structural.flyweight;

import java.util.HashMap;
import java.util.Map;

public class ShapeFactory {

    private final Map<String, Shape> shapes = new HashMap<>();

    public Shape createShape(String shapeName) {
        if (!shapes.containsKey(shapeName)) {
            return createAndStoreShape(shapeName);
        }

        return shapes.get(shapeName);
    }

    private Shape createAndStoreShape(String shapeName) {
        switch (shapeName) {
            case "rectangle":
                Rectangle rectangle = new Rectangle();
                shapes.put(shapeName, rectangle);
                return rectangle;
            case "triangle":
                Triangle triangle = new Triangle();
                shapes.put(shapeName, triangle);
                return triangle;
            default:
                throw new IllegalArgumentException("unknown shape name");
        }
    }
}
