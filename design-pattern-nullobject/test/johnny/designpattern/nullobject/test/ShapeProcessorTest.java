package johnny.designpattern.nullobject.test;

import org.junit.jupiter.api.Test;

import johnny.designpattern.nullobject.ShapeProcessor;

public class ShapeProcessorTest {

    @Test
    public void testShape() {
        System.out.println("testShape");

        ShapeProcessor sp = new ShapeProcessor();
        sp.process();
    }
}
