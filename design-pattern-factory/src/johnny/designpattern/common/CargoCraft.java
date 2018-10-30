package johnny.designpattern.common;

public class CargoCraft implements Aircraft {
    // constructor
    public CargoCraft() {
        System.out.println("CargoCraft is constructed.");
    }
    
    public void load() {
        System.out.println("CargoCraft is loading.");
    }
    public void takeoff() {
        System.out.println("CargoCraft is taking off.");
    }
    public String getType() {
        return "CargoCraft";
    }
}
