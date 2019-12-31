package johnny.designpattern.templatemethod;

public class Client {
    public void run() {
        Order order = new InStoreOrder();
        order.processOrder();
        System.out.println();
        order = new OnlineOrder();
        order.processOrder();
    }
}
