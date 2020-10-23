package lecture4;

public class int_child implements interface1 {
    public static void main(String [] args){
        child c = new child();
        c.print3();
        c.print10();
        parent.hello();
    }

    @Override
    public void print() {
        System.out.println(interface1.hello);
    }
}
