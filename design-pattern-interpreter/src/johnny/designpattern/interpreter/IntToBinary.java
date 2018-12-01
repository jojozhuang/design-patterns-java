package johnny.designpattern.interpreter;

public class IntToBinary implements Expression {

    @Override
    public String interpret(int num) {
        String result = Integer.toBinaryString(num);
        System.out.println(num + " in Binary = " + result);
        return result;
    }
}
