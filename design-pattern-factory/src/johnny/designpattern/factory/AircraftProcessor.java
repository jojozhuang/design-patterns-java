package johnny.designpattern.factory;

import johnny.designpattern.common.Aircraft;
import johnny.designpattern.common.BomberCraft;
import johnny.designpattern.common.CargoCraft;
import johnny.designpattern.common.FighterCraft;
import johnny.designpattern.common.PassengerCraft;

public class AircraftProcessor {
    @Deprecated
    public void process(String type) {
        Aircraft acft = null;
        if (type.equals("PassengerCraft")) {
            acft = new PassengerCraft();
        } else if (type.equals("CargoCraft")) {
            acft = new CargoCraft();
        } else if (type.equals("FighterCraft")) {
            acft = new FighterCraft();
        } else if (type.equals("BomberCraft")) {
            acft = new BomberCraft();
        }
        
        acft.load();
        acft.takeoff();
    }
    public void processNew(String type) {
        Aircraft acft = AircraftFactory.createAircraft(type);
        acft.load();
        acft.takeoff();
    }
}
