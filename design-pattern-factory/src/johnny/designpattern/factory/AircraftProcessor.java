package johnny.designpattern.factory;

import johnny.designpattern.common.Aircraft;

public class AircraftProcessor {
    public void process(String type) {
        Aircraft acft = USAircraftFactory.createAircraft(type);
        acft.load();
        acft.takeoff();
    }
}
