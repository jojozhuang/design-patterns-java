package johnny.designpattern.strategy;

import johnny.designpattern.common.Movable;

public class MovableProcessor {
    private Movable moveable = null;
    
    public MovableProcessor(Movable moveable) {
        this.moveable = moveable;
    }
    
    public void process() {
        moveable.move(10);
    }
}
