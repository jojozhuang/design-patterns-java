package johnny.designpattern.common;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class FlightSearchEngine {
    private List<Flight> flights;
    
    public FlightSearchEngine() {
        flights = new ArrayList<Flight>();
        flights.add(new Flight("UA890", 699.00, new Date(), new Date()));
        flights.add(new Flight("MU589", 549.00, new Date(), new Date()));
        flights.add(new Flight("AA345", 217.00, new Date(), new Date()));
    }
    // return flights available in the particular date range
    public List<Flight> search(double price, Date from, Date to) {
        Stream<Flight> result = flights.stream().filter(f -> f.price < price);
        return result.collect(Collectors.toList());
    }
}