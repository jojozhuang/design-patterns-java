package johnny.designpattern.common;

public class BritishBomberCraft implements Aircraft {
    // constructor
    public BritishBomberCraft() {
        System.out.println("BritishBomberCraft is constructed.");
    }
    
    public void load() {
        System.out.println("BritishBomberCraft is loading.");
    }
    public void takeoff() {
        System.out.println("BritishBomberCraft is taking off.");
    }
    public String getType() {
        return "BritishBomberCraft";
    }
}
