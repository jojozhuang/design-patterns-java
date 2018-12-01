package johnny.designpattern.interpreter;

public class IntToHex implements Expression {

    @Override
    public String interpret(int num) {
        String result = Integer.toHexString(num);
        System.out.println(num + " in Hexadecimal = " + result);
        return result;
    }
}
