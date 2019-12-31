package johnny.designpattern.singleton;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

public class SingletonTest {

    @Test
    public void testSingleton() {
        System.out.println("testSingleton");

        Singleton instance = Singleton.getInstance();
        assertNotNull(instance);
        assertEquals("hello", instance.getDummyString());
    }
}
