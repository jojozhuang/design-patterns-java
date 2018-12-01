package johnny.designpattern.common;

public class Circle implements Shape {
    private final double radius;
    
    public Circle (double radius) { 
        this.radius = radius;
    }
    
    @Override
    public double area() {
        // Area = πr^2
        return Math.PI * Math.pow(radius, 2);
    }
    
    @Override
    public double perimeter() {
        // Perimeter = 2πr
        return 2 * Math.PI * radius;
    }
    @Override 
    public void draw() {
        System.out.println("Drawing Circle with area: " + area() + " and perimeter: " + perimeter());
    }
}
