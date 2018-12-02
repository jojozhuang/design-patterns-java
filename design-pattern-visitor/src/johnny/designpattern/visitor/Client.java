package johnny.designpattern.visitor;

public class Client {
    public void run() {
        ComputerPart computer = new Computer();
        computer.accept(new ComputerPartDisplayVisitor());
    }
}
