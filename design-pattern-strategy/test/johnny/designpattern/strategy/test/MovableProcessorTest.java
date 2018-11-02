package johnny.designpattern.strategy.test;

import org.junit.Test;

import johnny.designpattern.common.Movable;
import johnny.designpattern.strategy.MovableOffRoadImpl;
import johnny.designpattern.strategy.MovableProcessor;
import johnny.designpattern.strategy.MovableRuralImpl;
import johnny.designpattern.strategy.MovableUrbanImpl;

public class MovableProcessorTest {

    @Test
    public void testMovable() {
        System.out.println("testMovable");

        String[] types = new String[] {"Rural", "Urban", "OffRoad"};

        for (String type : types) {
            Movable movable = null;
            if (type.equals("Rural")) {
                movable = new MovableRuralImpl();
            } else if (type.equals("Urban")) {
                movable = new MovableUrbanImpl();
            } else if (type.equals("OffRoad")) {
                movable = new MovableOffRoadImpl();
            }
            MovableProcessor mp = new MovableProcessor(movable);
            mp.process();
        }
    }
}
