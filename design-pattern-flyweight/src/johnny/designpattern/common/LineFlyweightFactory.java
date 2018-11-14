package johnny.designpattern.common;

import java.util.HashMap;
import java.util.Map;

public class LineFlyweightFactory {
    private Map<Color, LineFlyweight> pool;
    public LineFlyweightFactory() {
        pool = new HashMap();
    }
    public LineFlyweight getLine(Color c) {
        //check if we've already created a line with this color
        if (pool.containsKey(c)) {
            return pool.get(c);
        }

        //if not, create one and save it to the pool
        LineFlyweight line = new Line(c);
        pool.put(c, line);
        return line;
    }
}
