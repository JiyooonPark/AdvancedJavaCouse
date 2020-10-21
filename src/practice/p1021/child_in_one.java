package practice.p1021;

public class child_in_one extends all_in_one{
    String name_of_exam;
    child_in_one(){
        super();
    }
    child_in_one(int days_left,String feeling){
        super(days_left, feeling);
    }
    child_in_one(int days_left,String feeling, String name_of_exam){
        super(days_left, feeling);
        this.name_of_exam = name_of_exam;
    }
    void printInfo(){
        System.out.println("for "+ name_of_exam+" ");
        super.printInfo();
    }
    public static void main(String [] args){
        child_in_one c = new child_in_one(2, "doomed", "computer architecture");
        c.printInfo();
    }
}
