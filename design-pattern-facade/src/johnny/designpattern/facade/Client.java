package johnny.designpattern.facade;

import java.util.Date;
import java.util.List;

import johnny.designpattern.common.Bookable;

public class Client {
    public void process() {
        TravelFacade facade = new TravelFacade();
        Date from = new Date();
        Date to = new Date();
        List<Bookable> list = facade.bookFlightsAndHotels(from, to);
        for (Bookable item : list) {
            System.out.println(item);
        }
    }
}
