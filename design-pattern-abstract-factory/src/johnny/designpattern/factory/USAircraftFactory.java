package johnny.designpattern.factory;

import johnny.designpattern.common.Aircraft;
import johnny.designpattern.common.AircraftFactory;
import johnny.designpattern.common.USBomberCraft;
import johnny.designpattern.common.USFighterCraft;
import johnny.designpattern.common.USGunshipCraft;
import johnny.designpattern.common.USTroopTransportCraft;

public class USAircraftFactory implements AircraftFactory {
    @Override
    public  Aircraft createAircraft(String type) {
        if (type.equals("Bomber")) {
            return new USBomberCraft();
        } else if (type.equals("Fighter")) {
            return new USFighterCraft();
        } else if (type.equals("Gunship")) {
            return new USGunshipCraft();
        } else if (type.equals("Troop")) {
            return new USTroopTransportCraft();
        } else {
            return null;
        }
    }

    @Override
    public Aircraft repairAircraft(String type) {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public Aircraft decommissionAircraft(String type) {
        // TODO Auto-generated method stub
        return null;
    }
}
