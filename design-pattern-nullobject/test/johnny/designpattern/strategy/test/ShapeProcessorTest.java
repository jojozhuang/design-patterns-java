package johnny.designpattern.strategy.test;

import org.junit.Test;

import johnny.designpattern.strategy.ShapeProcessor;

public class ShapeProcessorTest {

    @Test
    public void testMovable() {
        System.out.println("testMovable");

        ShapeProcessor sp = new ShapeProcessor();
        sp.process();
    }
}
