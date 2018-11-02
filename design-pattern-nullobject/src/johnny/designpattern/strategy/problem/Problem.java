package johnny.designpattern.strategy.problem;

import johnny.designpattern.common.Shape;
import johnny.designpattern.strategy.problem.ShapeFactory;

public class Problem {
    
    public Problem () {
        
    }
    
    public void process() {
        String[] shapeTypes = new String[] { "Circle", null, "Triangle", "Pentagon", "Rectangle", "Trapezoid"};
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
