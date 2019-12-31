package johnny.designpattern.prototype;

public class Circle extends Shape {
    public Circle(){
        type = "Circle";
    }

    @Override
    public void draw() {
        System.out.println("Shape: Circle");
    }
}
