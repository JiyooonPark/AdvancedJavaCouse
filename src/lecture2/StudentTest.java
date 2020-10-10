package lecture2;

public class StudentTest {
    public static void main(String [] args){
        Student a = new Student("korea", "jiyoo","computer science", 21);
        Student b = new Student("korea", "jihyu","computer science", 25);
        Student c = new Student("korea", "jaewo","medicine", 23);

        a.printInfo();
        b.printInfo();
        c.printInfo();
    }
}
