package lecture11;

import java.util.HashMap;
import java.util.Scanner;

public class HashMapTest {

    public static void main(String [] args){
        HashMap<String, String> dic = new HashMap<>();
        Scanner scanner = new Scanner(System.in);
        String key;
        dic.put("apple", "사과");
        dic.put("grape", "포도");
        dic.put("pear", "배");
        dic.put("watermelon", "수박");
        dic.put("strawberry", "딸기");

        System.out.println(dic);

        for(String k : dic.keySet()){
            System.out.println(k+" : "+dic.get(k));
        }
        while(true) {
            System.out.print("enter word: ");
            key = scanner.next();
            String value = dic.get(key);
            if (value == null) {
                System.out.println("[ " + key + " ] not found");
            } else {
                System.out.println("[ " + key + " ] is " + dic.get(key));
                break;
            }
        }
        
    }
}
