package lecture11;

import java.util.ArrayList;
import java.util.Scanner;

public class ArrayTest {
    public static void main(String [] args){
        ArrayList<String> list = new ArrayList<>();
        String str;
        Scanner scanner = new Scanner(System.in);
        for(int i=0; i<4; i++){
            System.out.print("string : ");
            str = scanner.next();
            list.add(str);
            //System.out.println();
        }
        for(int i=0; i<4; i++){
            //printing out all elements in list.
            System.out.print(list.get(i) + " , ");
        }
        System.out.println();
        while(true){
            System.out.print("trying to find :");
            str = scanner.next();

            int index = list.indexOf(str);
            if(index == -1) System.out.println("failed search");
            else {
                System.out.println("index of "+str +" is : "+index);
                break;
            }
        }

    }
}
