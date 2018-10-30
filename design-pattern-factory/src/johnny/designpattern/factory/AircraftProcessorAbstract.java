package johnny.designpattern.factory;

import johnny.designpattern.common.Aircraft;

public class AircraftProcessorAbstract {
	private AircraftAbstractFactory aircraftFactory = null;
	
	public AircraftProcessorAbstract(AircraftAbstractFactory af) {
		aircraftFactory = af;
	}
    public void process(String type) {
    	Aircraft acft = aircraftFactory.createAircraft(type);
        acft.load();
        acft.takeoff();
    }
}
