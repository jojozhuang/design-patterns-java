package johnny.designpattern.common;

public class USTroopTransportCraft implements Aircraft {
    // constructor
    public USTroopTransportCraft() {
        System.out.println("USTroopTransportCraft is constructed.");
    }
    
    public void load() {
        System.out.println("USTroopTransportCraft is loading.");
    }
    public void takeoff() {
        System.out.println("USTroopTransportCraft is taking off.");
    }
    public String getType() {
        return "USTroopTransportCraft";
    }
}
