package johnny.designpattern.factory;

import johnny.designpattern.common.Aircraft;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

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
