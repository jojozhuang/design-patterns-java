package johnny.designpattern.factory;

import johnny.designpattern.common.*;

/*
 * Factory Pattern
 */
public class AircraftFactory {
    // Declare a private constructor to prevent class instances from being created in any other places
    private AircraftFactory() {}
    
    // use a static method to get object with the given type
    public static Aircraft createAircraft(String type) {
        if (type.equals("TroopTransportCraft")) {
            return new TroopTransportCraft();
        } else if (type.equals("FighterCraft")) {
            return new FighterCraft();
        } else if (type.equals("BomberCraft")) {
            return new BomberCraft();
        } else if (type.equals("GunshipCraft")) {
            return new GunshipCraft();
        } else if (type.equals("MedicHelicopterCraft")) {
            return new MedicHelicopterCraft();
        } else {
            return null;
        }
    }
}
