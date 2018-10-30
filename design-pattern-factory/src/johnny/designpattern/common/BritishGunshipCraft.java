package johnny.designpattern.common;

public class BritishGunshipCraft implements Aircraft {
    // constructor
    public BritishGunshipCraft() {
        System.out.println("BritishGunshipCraft is constructed.");
    }
    
    public void load() {
        System.out.println("BritishGunshipCraft is loading.");
    }
    public void takeoff() {
        System.out.println("BritishGunshipCraft is taking off.");
    }
    public String getType() {
        return "BritishGunshipCraft";
    }
}
