package johnny.designpattern.interpreter.test;

import johnny.designpattern.interpreter.Expression;
import johnny.designpattern.interpreter.IntToBinaryExpression;
import johnny.designpattern.interpreter.IntToHexExpression;
import org.junit.jupiter.api.Test;

public class ClientTest {

    @Test
    public void testClient() {
        Expression expIntToBinary = new IntToBinaryExpression();
        Expression expIntToHex = new IntToHexExpression();
        expIntToBinary.interpret(28);
        expIntToHex.interpret(28);
    }
}
