package johnny.designpattern.interpreter;

public class IntToBinaryExpression implements Expression {

    @Override
    public String interpret(int num) {
        String result = Integer.toBinaryString(num);
        System.out.println(num + " in Binary = " + result);
        return result;
    }

}
