package johnny.designpattern.factory;

import johnny.designpattern.common.Aircraft;

public class AircraftProcessor {
    private AircraftFactory aircraftFactory = null;
    
    public AircraftProcessor(AircraftFactory af) {
        aircraftFactory = af;
    }
    
    public void process(String type) {
        Aircraft acft = aircraftFactory.createAircraft(type);
        acft.load();
        acft.takeoff();
    }
}
