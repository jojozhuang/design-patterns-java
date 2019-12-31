package johnny.designpattern.common;

public class USFighterCraft implements Aircraft {
    // constructor
    public USFighterCraft() {
        System.out.println("USFighterCraft is constructed.");
    }
    
    public void load() {
        System.out.println("USFighterCraft is loading.");
    }
    public void takeoff() {
        System.out.println("USFighterCraft is taking off.");
    }
    public String getType() {
        return "USFighterCraft";
    }
}
