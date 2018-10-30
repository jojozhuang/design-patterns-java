package johnny.designpattern.common;

public class GunshipCraft implements Aircraft {
    // constructor
    public GunshipCraft() {
        System.out.println("FighterCraft is constructed.");
    }
    
    public void load() {
        System.out.println("FighterCraft is loading.");
    }
    public void takeoff() {
        System.out.println("FighterCraft is taking off.");
    }
    public String getType() {
        return "FighterCraft";
    }
}
