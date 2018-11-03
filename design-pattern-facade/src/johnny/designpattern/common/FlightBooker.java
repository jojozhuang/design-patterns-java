package johnny.designpattern.common;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class FlightBooker implements Booker{
    // return flights available in the particular date range
    public List<Bookable> book(Date from, Date to) {
        List<Bookable> list = new ArrayList<Bookable>();
        list.add(new Flight("UA890", 699.00, new Date(), new Date()));
        list.add(new Flight("MU589", 549.00, new Date(), new Date()));
        list.add(new Flight("AA345", 217.00, new Date(), new Date()));
        return list;
    }
}