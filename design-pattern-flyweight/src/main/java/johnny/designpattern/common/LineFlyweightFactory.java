package johnny.designpattern.common;

import java.util.HashMap;
import java.util.Map;

public class LineFlyweightFactory {
    private Map<Color, LineFlyweight> lineMap;
    public LineFlyweightFactory() {
        lineMap = new HashMap();
    }
    public LineFlyweight getLine(Color c) {
        //check if we've already created a line with this color
        if (lineMap.containsKey(c)) {
            return lineMap.get(c);
        }

        //if not, create one and save it to the pool
        LineFlyweight line = new Line(c);
        lineMap.put(c, line);
        return line;
    }
}
