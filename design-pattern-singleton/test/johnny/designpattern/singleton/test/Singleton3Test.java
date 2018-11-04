package johnny.designpattern.singleton.test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import johnny.designpattern.singleton.Singleton3;

public class Singleton3Test {

    @Test
    public void testSingleton3() {
        System.out.println("testSingleton3");

        Singleton3 instance = Singleton3.getInstance();
        assertNotNull(instance);
        assertEquals("hello", instance.getDummyString());
    }
}
