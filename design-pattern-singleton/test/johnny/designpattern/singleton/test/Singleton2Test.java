package johnny.designpattern.singleton.test;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import johnny.designpattern.singleton.Singleton2;

public class Singleton2Test {

    @BeforeClass
    public static void setUpBeforeClass() throws Exception {
    }

    @AfterClass
    public static void tearDownAfterClass() throws Exception {
    }

    @Before
    public void setUp() throws Exception {
    }

    @After
    public void tearDown() throws Exception {
    }

    @Test
    public void testSingleton2() {
        System.out.println("Singleton2");

        Singleton2 instance = Singleton2.getInstance();
        assertNotNull(instance);
        assertEquals("hello", instance.getDummyString());
    }
}
