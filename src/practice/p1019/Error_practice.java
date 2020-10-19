package practice.p1019;

public class Error_practice {
    public static void main(String [] args){
        for(int i=0; i<10; i++){
            try{
                System.out.println((double)6/i);
            }
            catch(ArithmeticException e){
                System.out.println("cannot be divided by 0");
            }
            finally {
                System.out.println("done");
            }
        }

    }
}
