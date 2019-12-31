package johnny.designpattern.command;

public class Buy implements Command {
    public void execute() {
        System.out.println("Buy stock");
    }
}