package johnny.designpattern.common;

public class BritishFighterCraft implements Aircraft {
    // constructor
    public BritishFighterCraft() {
        System.out.println("BritishFighterBomberCraft is constructed.");
    }
    
    public void load() {
        System.out.println("BritishFighterBomberCraft is loading.");
    }
    public void takeoff() {
        System.out.println("BritishFighterBomberCraft is taking off.");
    }
    public String getType() {
        return "BritishFighterBomberCraft";
    }
}
