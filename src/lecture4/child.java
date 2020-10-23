package lecture4;

public class child extends parent{
    void print3(){
        System.out.println("child class 3");
        print1();
    }
    void print10(){
        System.out.println("overrideed");
        super.print1();
    }
    int print10(int i){
        return i;
    }
    public static void main(String [] args){
        child c = new child();
        c.print3();
        c.print10();
        parent.hello();
    }
}
