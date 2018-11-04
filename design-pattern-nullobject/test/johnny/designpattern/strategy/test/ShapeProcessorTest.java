package johnny.designpattern.strategy.test;

import org.junit.jupiter.api.Test;

import johnny.designpattern.strategy.ShapeProcessor;

public class ShapeProcessorTest {

    @Test
    public void testShape() {
        System.out.println("testShape");

        ShapeProcessor sp = new ShapeProcessor();
        sp.process();
    }
}
