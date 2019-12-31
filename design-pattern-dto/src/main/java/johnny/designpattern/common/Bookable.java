package johnny.designpattern.common;

import java.util.Date;

public class Bookable {
    protected String name = "";
    protected double price = 0.0;
    protected Date from;
    protected Date to;

    @Override
    public String toString() {
        return name + ", " + price + ", " + from + ", " + to; 
    }
}
