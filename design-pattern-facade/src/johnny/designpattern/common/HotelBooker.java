package johnny.designpattern.common;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class HotelBooker {  
    // return hotels available in the particular date range
	public List<Bookable> book(Date from, Date to) {
        List<Bookable> list = new ArrayList<Bookable>();
        list.add(new Hotel("Trump Tower", 346.84, new Date(), new Date()));
        list.add(new Hotel("Hilton SF", 468.00, new Date(), new Date()));
        list.add(new Hotel("Four Seasons Hotel Shanghai", 173.00, new Date(), new Date()));
        return list;
    }
}
