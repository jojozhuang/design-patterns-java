package johnny.designpattern.common;

public class USGunshipCraft implements Aircraft {
    // constructor
    public USGunshipCraft() {
        System.out.println("USGunshipCraft is constructed.");
    }
    
    public void load() {
        System.out.println("USGunshipCraft is loading.");
    }
    public void takeoff() {
        System.out.println("USGunshipCraft is taking off.");
    }
    public String getType() {
        return "USGunshipCraft";
    }
}
