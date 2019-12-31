package johnny.designpattern.problematic;

import johnny.designpattern.common.Shape;

public class ShapeProcessor {
    String[] shapeTypes = new String[] { "Circle", "Triangle", "Rectangle", null};
    
    public ShapeProcessor () {
        
    }
    
    public void process() {
        for (String shapeType : shapeTypes) {
            Shape shape = ShapeFactory.createShape(shapeType);
            if (shape != null) { // null-check is required if factory returns null object
                System.out.println("Shape area: " + shape.area());
                System.out.println("Shape Perimeter: " + shape.perimeter());
                shape.draw();
                System.out.println();
            }
        }
    }
}
