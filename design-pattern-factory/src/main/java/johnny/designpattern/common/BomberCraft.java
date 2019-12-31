package johnny.designpattern.common;

public class BomberCraft implements Aircraft {
    // constructor
    public BomberCraft() {
        System.out.println("BomberCraft is constructed.");
    }
    
    public void load() {
        System.out.println("BomberCraft is loading.");
    }
    public void takeoff() {
        System.out.println("BomberCraft is taking off.");
    }
    public String getType() {
        return "BomberCraft";
    }
}
