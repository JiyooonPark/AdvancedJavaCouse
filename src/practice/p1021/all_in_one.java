package practice.p1021;

public class all_in_one {
    int days_left;
    String feeling;
    all_in_one(){

    }
    all_in_one(int days_left){
        this.days_left = days_left;
    }
    all_in_one(String feeling){
        this.feeling = feeling;
    }
    all_in_one(int days_left, String feeling){
        this.days_left = days_left;
        this.feeling = feeling;
    }
    all_in_one(String feeling,int days_left ){
        this.days_left = days_left;
        this.feeling = feeling;
    }
    void printInfo(){
        System.out.printf("I only have %d day(s) left for my exam but I am %s\n", days_left, feeling);
    }
    public static void main(String [] args){
        all_in_one a = new all_in_one(1, "surprisingly peaceful");
        a.printInfo();
        all_in_one b = new all_in_one("excited", 1);
        b.printInfo();
    }
}
