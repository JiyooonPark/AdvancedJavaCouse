package lecture3;

public class Sales {
    static int sold;

    public static void addSold(int a){
        sold+=a;
    }
    public int getSold(){
        return sold;
    }

}
