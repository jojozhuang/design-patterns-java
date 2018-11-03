package johnny.designpattern.common;

import java.util.Date;
import java.util.List;

public interface Booker {
    List<Bookable> book(Date from, Date to);
}
