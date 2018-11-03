package johnny.designpattern.facade;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import johnny.designpattern.common.Bookable;
import johnny.designpattern.common.FlightBooker;
import johnny.designpattern.common.HotelBooker;

public class TravelFacade {
    private FlightBooker flightBooker;
    private HotelBooker hotelBooker;
    
    public TravelFacade() {
        flightBooker = new FlightBooker();
        hotelBooker = new HotelBooker();
    }
    
    public List<Bookable> bookFlightsAndHotels(Date from, Date to) {
        List<Bookable> list = new ArrayList<Bookable>();
        List<Bookable> flights = flightBooker.book(from, to);
        List<Bookable> hotels = hotelBooker.book(from, to);
        list.addAll(flights);
        list.addAll(hotels);
        return list;
    }
}
