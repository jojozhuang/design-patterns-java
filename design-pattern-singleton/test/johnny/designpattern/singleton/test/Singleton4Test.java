package johnny.designpattern.singleton.test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import johnny.designpattern.singleton.Singleton4;

public class Singleton4Test {

    @Test
    public void testSingleton4() {
        System.out.println("testSingleton4");

        Singleton4 instance = Singleton4.getInstance();
        assertNotNull(instance);
        assertEquals("hello", instance.getDummyString());
    }
}
