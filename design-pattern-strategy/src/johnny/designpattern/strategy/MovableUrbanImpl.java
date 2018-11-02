package johnny.designpattern.strategy;

import johnny.designpattern.common.Movable;
import johnny.designpattern.common.Point;

public class MovableUrbanImpl implements Movable {
    private double speed;
    private Point location;
    
    private double urbanData; 
    
    public MovableUrbanImpl () { 
        
    }
    
    public void move(int seconds)
    {
        // Urban movement code goes here
        urbanData += 2.3;
        System.out.println("Urban is moving.");
    }
}
