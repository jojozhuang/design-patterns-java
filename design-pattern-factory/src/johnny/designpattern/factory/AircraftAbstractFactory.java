package johnny.designpattern.factory;

import johnny.designpattern.common.Aircraft;
import johnny.designpattern.common.BomberCraft;
import johnny.designpattern.common.CargoCraft;
import johnny.designpattern.common.FighterCraft;
import johnny.designpattern.common.PassengerCraft;

/*
 * Abstract Factory Pattern
 */
public class AircraftAbstractFactory {
    // declare a private constructor, so only itself can instantiate an object.
    private AircraftAbstractFactory() {}
    
    // use a static method to get object with the given type
    public Aircraft createAircraft(String type) {
        if (type.equals("PassengerCraft")) {
            return new PassengerCraft();
        } else if (type.equals("CargoCraft")) {
            return new CargoCraft();
        } else if (type.equals("FighterCraft")) {
            return new FighterCraft();
        } else if (type.equals("Bomber")) {
             return new BomberCraft();
        } else { 
            return null;
        }
    }
}
