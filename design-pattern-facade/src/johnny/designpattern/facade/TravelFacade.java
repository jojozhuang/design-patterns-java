package johnny.designpattern.facade;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import johnny.designpattern.common.Bookable;
import johnny.designpattern.common.FlightSearchEngine;
import johnny.designpattern.common.HotelSearchEngine;

public class TravelFacade {
    private FlightSearchEngine flightSE;
    private HotelSearchEngine hotelSE;
    
    public TravelFacade() {
        flightSE = new FlightSearchEngine();
        hotelSE = new HotelSearchEngine();
    }
    
    public List<Bookable> searchFlightsAndHotels(double flightPrice, double hotelPrice, Date from, Date to) {
        List<Bookable> list = new ArrayList<Bookable>();
        List<Bookable> flights = flightSE.search(flightPrice, from, to);
        List<Bookable> hotels = hotelSE.search(hotelPrice, from, to);
        list.addAll(flights);
        list.addAll(hotels);
        return list;
    }
}
