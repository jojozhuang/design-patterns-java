package johnny.designpattern.factory;

import johnny.designpattern.common.Aircraft;

/*
 * Factory Method Pattern
 */
public abstract class AircraftFactoryMethod {
    public abstract Aircraft createAircraft(String type);
}
