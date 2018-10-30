package johnny.designpattern.common;

public class MedicHelicopterCraft implements Aircraft {
    // constructor
    public MedicHelicopterCraft() {
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
