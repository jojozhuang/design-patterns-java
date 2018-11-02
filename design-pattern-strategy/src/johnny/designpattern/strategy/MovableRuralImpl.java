package johnny.designpattern.strategy;

import johnny.designpattern.common.Movable;
import johnny.designpattern.common.Point;

public class MovableRuralImpl implements Movable {
    private double speed;
    private Point location;
    
    private double ruralData; 
    
    public MovableRuralImpl () { 
        
    }
    
    public void move(int seconds)
    {
        // Rural movement code goes here
        ruralData += 1.2;
        System.out.println("Rural is moving.");
    }
}
