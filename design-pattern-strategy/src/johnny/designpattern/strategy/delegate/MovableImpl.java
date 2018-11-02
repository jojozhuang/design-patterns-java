package johnny.designpattern.strategy.delegate;

import johnny.designpattern.common.Movable;
import johnny.designpattern.common.Point;

public class MovableImpl implements Movable {
	private int indicator;
    private double speed;
    private Point location;
    
    private double ruralData; 
    private double urbanData; 
    private double offRoadData;
    
    public MovableImpl (int indicator) {
        this.indicator = indicator;
    }
    
    public void move(int seconds)
    {
        switch(indicator)
        {
            case 0: // "Rural" movement algorithm 
            {
                // Rural movement code goes here
                ruralData += 1.2;
            }
            case 1: // "Urban" movement algorithm 
            {
                // Urban movement code goes here 
                urbanData += 2.3;
            }
            case 2: // "Off Road" movement algorithm 
            {
                // Off Road movement code goes here
                offRoadData += 4.5;
            }
        }
    }
}
