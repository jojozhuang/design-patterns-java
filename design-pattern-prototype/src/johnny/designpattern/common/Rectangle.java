package johnny.designpattern.common;

public class Rectangle extends Shape {

    public Rectangle(){
        type = "Rectangle";
    }

    @Override
    public void draw() {
        System.out.println("Shape: Rectangle");
    }
}

