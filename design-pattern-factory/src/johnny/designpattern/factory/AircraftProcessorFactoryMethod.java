package johnny.designpattern.factory;

import johnny.designpattern.common.Aircraft;

public class AircraftProcessorFactoryMethod {
    private AircraftFactory aircraftFactory = null;
    
    public AircraftProcessorFactoryMethod(AircraftFactory af) {
        aircraftFactory = af;
    }
    public void process(String type) {
        Aircraft acft = aircraftFactory.createAircraft(type);
        acft.load();
        acft.takeoff();
    }
}
