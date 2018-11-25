package johnny.designpattern.templatemethod.test;

import johnny.designpattern.templatemethod.InStoreOrder;
import johnny.designpattern.templatemethod.OnlineOrder;
import johnny.designpattern.templatemethod.Order;
import org.junit.jupiter.api.Test;

public class ClientTest {

    @Test
    public void testClient() {
        Order order = new InStoreOrder();
        order.processOrder();
        System.out.println();
        order = new OnlineOrder();
        order.processOrder();
    }
}
