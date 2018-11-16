package johnny.designpattern.command;

public class SellStock implements Order {
    public void execute() {
        System.out.println("Sell stock");
    }
}