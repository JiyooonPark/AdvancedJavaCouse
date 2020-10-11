package lecture3;

public class ArrayTest {
    public static void main(String [] args){
        Array a = new Array(new int[]{100, 99, 98, 95, 100});
        System.out.println(a.maxArray());
        System.out.println(a.minArray());

    }
}
