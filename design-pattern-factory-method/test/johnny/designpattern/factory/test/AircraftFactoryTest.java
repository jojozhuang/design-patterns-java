package johnny.designpattern.factory.test;

import org.junit.jupiter.api.Test;

import johnny.designpattern.factory.AircraftProcessor;
import johnny.designpattern.factory.BritishAircraftFactory;
import johnny.designpattern.factory.USAircraftFactory;

public class AircraftFactoryTest {

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
