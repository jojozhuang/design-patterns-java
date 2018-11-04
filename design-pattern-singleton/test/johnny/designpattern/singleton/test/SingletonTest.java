package johnny.designpattern.singleton.test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import johnny.designpattern.singleton.Singleton;

public class SingletonTest {

    @Test
    public void testSingleton() {
        System.out.println("testSingleton");

        Singleton instance = Singleton.getInstance();
        assertNotNull(instance);
        assertEquals("hello", instance.getDummyString());
    }
}
