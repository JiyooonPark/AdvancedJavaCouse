package lecture2;

public class ParamTest {
    int a;
    int b;
    int c;

    void printParam(int [] list){
        for(int i=0; i<list.length; i++){
            System.out.print(list[i]+" ");
        }
        System.out.println();
    }
    public static void main(String [] args){
        ParamTest p = new ParamTest();
        //p.printParam(1, 3, 1,2, 1, 1, 23,1, 23,1 ,32, 123,12 );
    }
}
