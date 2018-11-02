package johnny.designpattern.strategy.test;

import org.junit.Test;

import johnny.designpattern.common.Shape;
import johnny.designpattern.strategy.ShapeFactory;

public class ShapeProcessorTest {

    @Test
    public void testMovable() {
        System.out.println("testMovable");

        String[] shapeTypes = new String[] { "Circle", "Triangle", "Rectangle", null};
        for (String shapeType : shapeTypes) {
            Shape shape = ShapeFactory.createShape(shapeType);
            // no null-check required since shape factory always creates shape objects
            System.out.println("Shape area: " + shape.area());
            System.out.println("Shape Perimeter: " + shape.perimeter());
            shape.draw();
            System.out.println();
        }
    }
}
