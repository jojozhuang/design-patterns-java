package johnny.designpattern.common;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class HotelSearchEngine {
    private List<Hotel> hotels;
    
    public HotelSearchEngine() {
        hotels = new ArrayList<Hotel>();
        hotels.add(new Hotel("Trump Tower", 346.84, new Date(), new Date()));
        hotels.add(new Hotel("Hilton SF", 468.00, new Date(), new Date()));
        hotels.add(new Hotel("Four Seasons Hotel Shanghai", 173.00, new Date(), new Date()));
    }
    // return hotels available in the particular date range
    public List<Hotel> search(double price, Date from, Date to) {
        Stream<Hotel> result = hotels.stream().filter(f -> f.price < price);
        return result.collect(Collectors.toList());
    }
}
