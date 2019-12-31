package johnny.designpattern.singleton;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

public class Singleton2Test {

    @Test
    public void testSingleton2() {
        System.out.println("testSingleton2");

        Singleton2 instance = Singleton2.getInstance();
        assertNotNull(instance);
        assertEquals("hello", instance.getDummyString());
    }
}
