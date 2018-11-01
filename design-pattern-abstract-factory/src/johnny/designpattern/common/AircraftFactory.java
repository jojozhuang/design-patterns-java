package johnny.designpattern.common;

public interface AircraftFactory {
    public Aircraft createAircraft(String type); 
    public Aircraft repairAircraft(String type); 
    public Aircraft decommissionAircraft(String type);
}
