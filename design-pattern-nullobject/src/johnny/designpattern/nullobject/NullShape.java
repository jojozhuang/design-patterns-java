package johnny.designpattern.nullobject;

import johnny.designpattern.common.Shape;

public class NullShape implements Shape {
    
    public NullShape () {}
    
    @Override
    public double area() {
        return 0.0d;
    }
    
    @Override
    public double perimeter() {
        return 0.0d;
    }
    
    @Override
    public void draw() {
        System.out.println("Null object can't be drawn");
    }
}
