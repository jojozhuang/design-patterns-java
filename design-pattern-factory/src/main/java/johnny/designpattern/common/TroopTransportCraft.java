package johnny.designpattern.common;

public class TroopTransportCraft implements Aircraft {
    // constructor
    public TroopTransportCraft() {
        System.out.println("TroopTransportCraft is constructed.");
    }
    
    public void load() {
        System.out.println("TroopTransportCraft is loading.");
    }
    public void takeoff() {
        System.out.println("TroopTransportCraft is taking off.");
    }
    public String getType() {
        return "TroopTransportCraft";
    }
}
