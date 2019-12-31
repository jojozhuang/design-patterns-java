package johnny.designpattern.command;

public class Client {
    public void run() {
        Buy buyStock = new Buy();
        Sell sellStock = new Sell();

        Broker broker = new Broker();
        broker.acceptCommand(buyStock);
        broker.acceptCommand(sellStock);

        broker.executeCommand();
    }
}
