package johnny.designpattern.singleton.test;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import johnny.designpattern.singleton.Singleton3;

public class Singleton3Test {

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
    public void testSingleton3() {
        System.out.println("testSingleton");

        Singleton3 instance = Singleton3.getInstance();
        assertNotNull(instance);
        assertEquals("hello", instance.getDummyString());
    }
}
