package johnny.designpattern.prototype;

import java.util.HashMap;
import java.util.Map;

public class ShapeCache {
    private static Map<String, Shape> mapShape = new HashMap<>();

    public static Shape getShape(String shapeId) {
        Shape cachedShape = mapShape.get(shapeId);
        return (Shape) cachedShape.clone();
    }

    public static void loadCache() {
        Circle circle = new Circle();
        circle.setId("1");
        mapShape.put(circle.getId(), circle);

        Square square = new Square();
        square.setId("2");
        mapShape.put(square.getId(), square);

        Rectangle rectangle = new Rectangle();
        rectangle.setId("3");
        mapShape.put(rectangle.getId(), rectangle);
    }
}
