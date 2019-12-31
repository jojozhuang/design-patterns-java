package johnny.designpattern.common;

public class BritishFighterCraft implements Aircraft {
    // constructor
    public BritishFighterCraft() {
        System.out.println("BritishFighterCraft is constructed.");
    }
    
    public void load() {
        System.out.println("BritishFighterCraft is loading.");
    }
    public void takeoff() {
        System.out.println("BritishFighterCraft is taking off.");
    }
    public String getType() {
        return "BritishFighterCraft";
    }
}
