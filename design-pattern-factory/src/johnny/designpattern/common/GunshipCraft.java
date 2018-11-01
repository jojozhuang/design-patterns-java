package johnny.designpattern.common;

public class GunshipCraft implements Aircraft {
    // constructor
    public GunshipCraft() {
        System.out.println("GunshipCraft is constructed.");
    }
    
    public void load() {
        System.out.println("GunshipCraft is loading.");
    }
    public void takeoff() {
        System.out.println("GunshipCraft is taking off.");
    }
    public String getType() {
        return "GunshipCraft";
    }
}
