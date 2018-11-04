package johnny.designpattern.factory.test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import johnny.designpattern.common.Aircraft;
import johnny.designpattern.factory.AircraftFactory;

public class AircraftFactoryTest {

    @Test
    public void testAircraftFactory() {
        System.out.println("testAircraftFactory");

        String craftType = "TroopTransportCraft";
        Aircraft acft = AircraftFactory.createAircraft(craftType);
        assertNotNull(acft);
        acft.load();
        acft.takeoff();
        assertEquals(craftType, acft.getType());
    }
}
