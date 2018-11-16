package johnny.designpattern.command;

public class Client {
    public void run() {
        BuyStock buyStockOrder = new BuyStock();
        SellStock sellStockOrder = new SellStock();

        Broker broker = new Broker();
        broker.takeOrder(buyStockOrder);
        broker.takeOrder(sellStockOrder);

        broker.placeOrders();
    }
}
