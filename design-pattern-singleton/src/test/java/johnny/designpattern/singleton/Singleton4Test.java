package johnny.designpattern.singleton;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

public class Singleton4Test {

    @Test
    public void testSingleton4() {
        System.out.println("testSingleton4");

        Singleton4 instance = Singleton4.getInstance();
        assertNotNull(instance);
        assertEquals("hello", instance.getDummyString());
    }
}
