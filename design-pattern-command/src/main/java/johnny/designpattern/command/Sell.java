package johnny.designpattern.command;

public class Sell implements Command {
    public void execute() {
        System.out.println("Sell stock");
    }
}