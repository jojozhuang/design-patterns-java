package johnny.designpattern.dto;

import johnny.designpattern.common.Flight;
import johnny.designpattern.common.FlightSearchEngine;
import johnny.designpattern.common.Hotel;
import johnny.designpattern.common.HotelSearchEngine;

import java.util.Date;
import java.util.List;

public class ClientProblematic {
    private FlightSearchEngine flightSE;
    private HotelSearchEngine hotelSE;

    public ClientProblematic() {
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
