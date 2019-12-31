package johnny.designpattern.factory;

import johnny.designpattern.common.*;

public class BritishAircraftFactory implements AircraftFactory {
    public Aircraft createAircraft(String type) {
        if (type.equals("Bomber")) {
            return new BritishBomberCraft();
        } else if (type.equals("Fighter")) {
            return new BritishFighterCraft();
        } else if (type.equals("Gunship")) {
            return new BritishGunshipCraft();
        } else if (type.equals("Troop")) {
            return new BritishTroopTransportCraft();
        } else {
            return null;
        }
    }
}
