package johnny.designpattern.factory.test;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import johnny.designpattern.common.Aircraft;
import johnny.designpattern.factory.USAircraftFactory;
import johnny.designpattern.factory.BritishAircraftFactory;
import johnny.designpattern.factory.AircraftProcessor;

public class AircraftFactoryTest {

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
    public void testAircraftFactory() {
        System.out.println("testAircraftFactory");

        String[] types = new String[] {"Bomber", "Fighter", "Gunship", "Troop"};

        for (String type : types) {
            AircraftProcessor apUS = new AircraftProcessor(new USAircraftFactory());
            apUS.process(type);

            AircraftProcessor apBritish = new AircraftProcessor(new BritishAircraftFactory());
            apBritish.process(type);
        }
        
    }
}
