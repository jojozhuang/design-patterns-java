package johnny.designpattern.flyweight;

import johnny.designpattern.common.Color;
import johnny.designpattern.common.LineFlyweight;
import johnny.designpattern.common.LineFlyweightFactory;

public class Client {
    private LineFlyweightFactory factory ;

    public Client() {
        factory = new LineFlyweightFactory();
    }

    public void draw() {
        LineFlyweight line1 = factory.getLine(Color.RED);
        System.out.println(line1);
        LineFlyweight line2 = factory.getLine(Color.RED); //can use the lines independently
        System.out.println(line2);
        if (line1.equals(line2)){
            System.out.println("same");
        }
        line1.draw(100, 100);
        line2.draw(200, 100);
    }
}
