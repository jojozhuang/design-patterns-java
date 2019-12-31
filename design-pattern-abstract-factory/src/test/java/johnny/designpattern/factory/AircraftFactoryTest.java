package johnny.designpattern.factory;

import org.junit.jupiter.api.Test;

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
