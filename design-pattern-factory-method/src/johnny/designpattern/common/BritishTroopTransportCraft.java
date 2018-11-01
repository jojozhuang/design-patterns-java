package johnny.designpattern.common;

public class BritishTroopTransportCraft implements Aircraft {
    // constructor
    public BritishTroopTransportCraft() {
        System.out.println("BritishTroopTransportCraft is constructed.");
    }
    
    public void load() {
        System.out.println("BritishTroopTransportCraft is loading.");
    }
    public void takeoff() {
        System.out.println("BritishTroopTransportCraft is taking off.");
    }
    public String getType() {
        return "BritishTroopTransportCraft";
    }
}
