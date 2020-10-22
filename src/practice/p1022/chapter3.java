package practice.p1022;
import java.util.ArrayList;
public class chapter3 {
    public static void main(String [] args){
        Song list[] = new Song[3];
        int l[] = new int[100];
        for(int i=0; i<3; i++){
            list[i] = new Song("y", "u"+i);
        }
        ArrayList<Integer> list1 = new ArrayList<Integer>();
        list1.add(1);
        list1.add(1);
        list1.add(1);
        list1.add(1);
        for(int i :list1){
            System.out.print(i);
        }
    }
}
