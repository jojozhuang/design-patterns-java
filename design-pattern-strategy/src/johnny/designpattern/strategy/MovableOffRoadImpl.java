package johnny.designpattern.strategy;

import johnny.designpattern.common.Movable;
import johnny.designpattern.common.Point;

public class MovableOffRoadImpl implements Movable {
    private double speed;
    private Point location;
    
    private double offRoadData; 
    
    public MovableOffRoadImpl () { 
        
    }
    
    public void move(int seconds)
    {
        // Off Road movement code goes here
        offRoadData += seconds;
        System.out.println("Off Road is moving.");
    }
}
