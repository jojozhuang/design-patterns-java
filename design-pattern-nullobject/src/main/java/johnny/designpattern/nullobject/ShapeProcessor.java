package johnny.designpattern.nullobject;

import johnny.designpattern.common.Shape;

public class ShapeProcessor {
    String[] shapeTypes = new String[] { "Circle", "Triangle", "Rectangle", null};
    
    public ShapeProcessor () {
        
    }
    
    public void process() {
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
