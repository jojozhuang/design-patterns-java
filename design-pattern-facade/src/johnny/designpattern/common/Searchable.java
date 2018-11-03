package johnny.designpattern.common;

import java.util.Date;
import java.util.List;

public interface Searchable {
    List<Bookable> search(double price, Date from, Date to);
}
