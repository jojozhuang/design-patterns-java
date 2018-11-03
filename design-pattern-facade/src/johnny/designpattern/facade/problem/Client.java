package johnny.designpattern.facade.problem;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import johnny.designpattern.common.Bookable;
import johnny.designpattern.common.FlightBooker;
import johnny.designpattern.common.HotelBooker;

public class Client {
    private FlightBooker flightBooker;
    private HotelBooker hotelBooker;

    public Client() {
        flightBooker = new FlightBooker();
        hotelBooker = new HotelBooker();
    }
    
    public void process() {
        Date from = new Date();
        Date to = new Date();
        List<Bookable> list = new ArrayList<Bookable>();
        List<Bookable> flights = flightBooker.book(from, to);
        List<Bookable> hotels = hotelBooker.book(from, to);
        list.addAll(flights);
        list.addAll(hotels);

        for (Bookable item : list) {
            System.out.println(item);
        }
    }
}
