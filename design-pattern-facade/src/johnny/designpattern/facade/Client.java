package johnny.designpattern.facade;

import java.util.Date;
import java.util.List;

import johnny.designpattern.common.Bookable;

public class Client {
    public void search(double flightPrice, double hotelPrice, Date from, Date to) {
        TravelFacade facade = new TravelFacade();
        List<Bookable> list = facade.searchFlightsAndHotels(flightPrice, hotelPrice, from, to);
        for (Bookable item : list) {
            System.out.println(item);
        }
    }
}
