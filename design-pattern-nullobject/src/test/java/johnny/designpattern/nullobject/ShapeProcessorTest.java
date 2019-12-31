package johnny.designpattern.nullobject;

import org.junit.jupiter.api.Test;

public class ShapeProcessorTest {

    @Test
    public void testShape() {
        System.out.println("testShape");

        ShapeProcessor sp = new ShapeProcessor();
        sp.process();
    }
}
