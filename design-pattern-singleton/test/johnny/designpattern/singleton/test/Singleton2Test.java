package johnny.designpattern.singleton.test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import johnny.designpattern.singleton.Singleton2;

public class Singleton2Test {

    @Test
    public void testSingleton2() {
        System.out.println("testSingleton2");

        Singleton2 instance = Singleton2.getInstance();
        assertNotNull(instance);
        assertEquals("hello", instance.getDummyString());
    }
}
