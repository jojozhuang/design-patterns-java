package johnny.designpattern.common;

public class PassengerCraft implements Aircraft {
    // constructor
    public PassengerCraft() {
        System.out.println("PassengerCraft is constructed.");
    }
    
    public void load() {
        System.out.println("PassengerCraft is loading.");
    }
    public void takeoff() {
        System.out.println("PassengerCraft is taking off.");
    }
    public String getType() {
        return "PassengerCraft";
    }
}
