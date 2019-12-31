package johnny.designpattern.interpreter;

import java.util.ArrayList;
import java.util.List;

public class Client {
    public void run() {
        List<Expression> list = new ArrayList<>();
        list.add(new IntToBinary());
        list.add(new IntToHex());
        list.add(new IntToRoman());

        for (Expression exp : list) {
            exp.interpret(28);
        }
    }
}
