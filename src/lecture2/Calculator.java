package lecture2;

public class Calculator {
    int num1, num2;
    double res;
    char op;

    Calculator(int num1, int num2, char op){
        this.num1 = num1;
        this.num2 = num2;
        this.op = op;
    }
    public void calculateResult(){
        switch(op){
            case '+':
                res = num1 + num2;
                break;
            case '-':
                res = num1 - num2;
                break;
            case '*':
                res = num1 * num2;
                break;
            case '/':
                res = num1 / num2;
                break;
        }
    }
    public void printResult(){
        System.out.printf("%d %c %d = %2.1f\n", num1, op, num2, res);
    }
}
