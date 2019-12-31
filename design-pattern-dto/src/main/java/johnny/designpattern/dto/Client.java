package johnny.designpattern.dto;

import johnny.designpattern.common.FlightSearchEngine;
import johnny.designpattern.common.HotelSearchEngine;

import java.util.Date;

public class Client {
    private FlightSearchEngine flightSE;
    private HotelSearchEngine hotelSE;
    
    public Client() {
        flightSE = new FlightSearchEngine();
        hotelSE = new HotelSearchEngine();
    }
    
    public BookableDTO process() {
        Date from = new Date();
        Date to = new Date();
        
        BookableDTO dto = new BookableDTO();
        
        dto.flights = flightSE.search(600, from, to);
        dto.hotels = hotelSE.search(400, from, to);
        
        return dto;
    }
}
