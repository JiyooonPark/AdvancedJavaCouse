package lecture11;

import java.util.Vector;

public class VectorTest {
    public static void main(String [] args){
        Vector<Integer> v = new Vector<>();
        Vector<String> s = new Vector<>();
        //Vector<Integer> v = new Vector<Integer>();

        //v.add(new Integer(100));
        v.add(11);//automatic boxing
        v.add(90);
        v.add(12);

        s.add("str");
        s.add("hello");

        System.out.println(v);

        v.add(1, 100);
        System.out.println(v);
        int sum=0;
        for(int i=0; i<v.size(); i++){
            int n=v.get(i); //automatic unboxing
            sum += n;
        }
        System.out.println("sum of all elements in v: "+sum);
    }
}
