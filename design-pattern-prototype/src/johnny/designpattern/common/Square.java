package johnny.designpattern.common;

public class Square extends Shape {

    public Square(){
        type = "Square";
    }

    @Override
    public void draw() {
        System.out.println("Shape: Square");
    }
}

