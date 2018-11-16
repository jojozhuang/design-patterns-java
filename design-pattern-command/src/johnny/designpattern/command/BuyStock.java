package johnny.designpattern.command;

public class BuyStock implements Order {
    public void execute() {
        System.out.println("Buy stock");
    }
}