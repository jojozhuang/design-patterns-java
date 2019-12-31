package johnny.designpattern.problematic;

import johnny.designpattern.common.Circle;
import johnny.designpattern.common.Rectangle;
import johnny.designpattern.common.Shape;
import johnny.designpattern.common.Triangle;

public class ShapeFactory {
    public static Shape createShape(String shapeType) {
        Shape shape = null;
        if ("Circle".equalsIgnoreCase(shapeType)) {
            shape = new Circle(3);
        } else if ("Rectangle".equalsIgnoreCase(shapeType)) {
            shape = new Rectangle(2, 4);
        } else if ("Triangle".equalsIgnoreCase(shapeType)) {
            shape = new Triangle(3, 4, 5);
        } // else return null
        
        return shape;
    }
}
