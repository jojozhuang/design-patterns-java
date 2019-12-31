package johnny.designpattern.prototype;

public class Square extends Shape {

    public Square(){
        type = "Square";
    }

    @Override
    public void draw() {
        System.out.println("Shape: Square");
    }
}

