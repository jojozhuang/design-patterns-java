package johnny.designpattern.singleton.test;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import johnny.designpattern.singleton.Singleton;;

public class SingletonTest {

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
    public void testSearchRecursive() {
        System.out.println("testSearchRecursive");

        Singleton instance = Singleton.getInstance();
        assertNotNull(instance);
        assertEquals("hello", instance.getDummyString());
    }
}
