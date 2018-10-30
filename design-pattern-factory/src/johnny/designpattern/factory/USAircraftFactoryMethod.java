package johnny.designpattern.factory;

import johnny.designpattern.common.Aircraft;
import johnny.designpattern.common.BomberCraft;
import johnny.designpattern.common.FighterCraft;
import johnny.designpattern.common.GunshipCraft;
import johnny.designpattern.common.MedicHelicopterCraft;
import johnny.designpattern.common.TroopTransportCraft;

public class USAircraftFactoryMethod extends AircraftFactoryMethod {
    public Aircraft createAircraft(String type) {
        if (type.equals("Troop")) {
            return new TroopTransportCraft();
        } else if (type.equals("Fighter")) {
            return new FighterCraft();
        } else if (type.equals("Bomber")) {
            return new BomberCraft();
        } else if (type.equals("Gunship")) {
            return new GunshipCraft();
        } else if (type.equals("Medic")) {
            return new MedicHelicopterCraft();
        } else {
            return null;
        }
    }

}
