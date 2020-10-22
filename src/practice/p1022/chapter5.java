package practice.p1022;

public class chapter5 extends shape implements Remote{
    @Override
    void print() {
        System.out.print(V);
        System.out.print(Remote.V);
    }
    public static void main(String []args){
        chapter5 c = new chapter5();
        c.print();
    }
}
