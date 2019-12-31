package johnny.designpattern.decorator;

import johnny.designpattern.common.Circle;
import johnny.designpattern.common.Rectangle;
import johnny.designpattern.common.Shape;

public class Client {
    public void draw() {
        Shape circle = new Circle();

        Shape redCircle = new RedShapeDecorator(new Circle());

        Shape redRectangle = new RedShapeDecorator(new Rectangle());
        System.out.println("Circle with normal border");
        circle.draw();

        System.out.println("\nCircle of red border");
        redCircle.draw();

        System.out.println("\nRectangle of red border");
        redRectangle.draw();
    }
}
