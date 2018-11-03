package johnny.designpattern.common;

import java.util.Date;

public class Flight extends Bookable {
    public Flight(String name, double price, Date from, Date to) {
        this.name = name;
        this.price = price;
        this.from = from;
        this.to= to;
    }
}
