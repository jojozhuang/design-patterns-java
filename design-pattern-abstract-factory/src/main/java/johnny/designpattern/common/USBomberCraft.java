package johnny.designpattern.common;

public class USBomberCraft implements Aircraft {
    // constructor
    public USBomberCraft() {
        System.out.println("USBomberCraft is constructed.");
    }
    
    public void load() {
        System.out.println("USBomberCraft is loading.");
    }
    public void takeoff() {
        System.out.println("USBomberCraft is taking off.");
    }
    public String getType() {
        return "USBomberCraft";
    }
}
