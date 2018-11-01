package johnny.designpattern.common;

public class MedicHelicopterCraft implements Aircraft {
    // constructor
    public MedicHelicopterCraft() {
        System.out.println("MedicHelicopterCraft is constructed.");
    }
    
    public void load() {
        System.out.println("MedicHelicopterCraft is loading.");
    }
    public void takeoff() {
        System.out.println("MedicHelicopterCraft is taking off.");
    }
    public String getType() {
        return "MedicHelicopterCraft";
    }
}
