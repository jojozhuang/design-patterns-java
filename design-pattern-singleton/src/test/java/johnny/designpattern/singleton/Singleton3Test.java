package johnny.designpattern.singleton;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

public class Singleton3Test {

    @Test
    public void testSingleton3() {
        System.out.println("testSingleton3");

        Singleton3 instance = Singleton3.getInstance();
        assertNotNull(instance);
        assertEquals("hello", instance.getDummyString());
    }
}
