package johnny.designpattern.factory;

import johnny.designpattern.common.Aircraft;
import johnny.designpattern.common.USBomberCraft;
import johnny.designpattern.common.USFighterCraft;
import johnny.designpattern.common.USGunshipCraft;
import johnny.designpattern.common.USTroopTransportCraft;

public class USAircraftFactory extends AircraftFactory {
    public Aircraft createAircraft(String type) {
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

}
