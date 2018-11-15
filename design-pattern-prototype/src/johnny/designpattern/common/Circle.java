package johnny.designpattern.common;

public class Circle extends Shape {
    public Circle(){
        type = "Circle";
    }

    @Override
    public void draw() {
        System.out.println("Shape: Circle");
    }
}
