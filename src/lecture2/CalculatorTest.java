package lecture2;

public class CalculatorTest {
    public static void main(String [] args){
        Calculator c = new Calculator(10, 20, '+');
        c.calculateResult();;
        c.printResult();
        Calculator c1 = new Calculator(10, 92, '-');
        c1.calculateResult();;
        c1.printResult();
        Calculator c2 = new Calculator(51, 47, '*');
        c2.calculateResult();;
        c2.printResult();
    }
}
