package johnny.designpattern.interpreter;


public class IntToRoman implements Expression {

    @Override
    public String interpret(int num) {
        if (num <= 0) {
            return "";
        }
        // 1000,2000,3000
        String M[] = {"", "M", "MM", "MMM"};
        // 100,200,300,400,500,600,700,800,900,1000
        String C[] = {"", "C", "CC", "CCC", "CD", "D", "DC", "DCC", "DCCC", "CM"};
        // 10,20,30,40,50,60,70,80,90
        String X[] = {"", "X", "XX", "XXX", "XL", "L", "LX", "LXX", "LXXX", "XC"};
        // 1,2,3,4,5,6,7,8,9
        String I[] = {"", "I", "II", "III", "IV", "V", "VI", "VII", "VIII", "IX"};
        String result = M[num/1000] + C[(num%1000)/100] + X[(num%100)/10] + I[num%10];

        System.out.println(num + " in Roman = " + result);
        return result;
    }
}
