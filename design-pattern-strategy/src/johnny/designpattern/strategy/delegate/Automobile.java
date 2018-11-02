package johnny.designpattern.strategy.delegate;

import johnny.designpattern.common.Movable;
import johnny.designpattern.common.Point;

public class Automobile implements Movable {
    private Movable movable;
    
    public Automobile () {
        
    }
    
    public void move(int seconds)
    {
        // Automobile movement code goes here
    }
}
