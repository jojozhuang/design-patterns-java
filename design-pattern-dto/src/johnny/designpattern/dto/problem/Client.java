package johnny.designpattern.dto.problem;

import java.util.Date;
import java.util.List;

import johnny.designpattern.common.Flight;
import johnny.designpattern.common.FlightSearchEngine;
import johnny.designpattern.common.Hotel;
import johnny.designpattern.common.HotelSearchEngine;

public class Client {
    private FlightSearchEngine flightSE;
    private HotelSearchEngine hotelSE;

    public Client() {
        flightSE = new FlightSearchEngine();
        hotelSE = new HotelSearchEngine();
    }
    
    public List<Flight> processFlight() {
        Date from = new Date();
        Date to = new Date();
        List<Flight> flights = flightSE.search(600, from, to);
        return flights;
    }
    
    public List<Hotel> processHotel() {
        Date from = new Date();
        Date to = new Date();
        List<Hotel> hotels = hotelSE.search(400, from, to);
        return hotels;
    }
}
