package johnny.designpattern.factory;

import johnny.designpattern.common.Aircraft;
import johnny.designpattern.common.AircraftFactory;
import johnny.designpattern.common.BritishBomberCraft;
import johnny.designpattern.common.BritishFighterCraft;
import johnny.designpattern.common.BritishGunshipCraft;
import johnny.designpattern.common.BritishTroopTransportCraft;

public class BritishAircraftAbstractFactory implements AircraftFactory {
    public Aircraft createAircraft(String type) {
        if (type.equals("Troop")) {
            return new BritishTroopTransportCraft();
        } else if (type.equals("Fighter")) {
            return new BritishFighterCraft();
        } else if (type.equals("Bomber")) {
            return new BritishBomberCraft();
        } else if (type.equals("Gunship")) {
            return new BritishGunshipCraft();
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
