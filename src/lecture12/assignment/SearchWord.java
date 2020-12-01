package lecture12.assignment;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Scanner;
import java.util.Vector;

public class SearchWord {
    public static void main(String [] args) throws FileNotFoundException {
        Vector<String> v = new Vector<>();
        FileReader fr = new FileReader("words.txt");
        Scanner fs = new Scanner(fr);
        while(fs.hasNext())
            v.add(fs.next());
        fs.close();

        Scanner s = new Scanner(System.in);
        while(true){
            boolean found = false;
            System.out.print("word: ");
            String search = s.next();
            if(search.equals("q")){
                System.out.println("end search");
                break;
            }

            for(int i=0; i<v.size(); i++){
                String vs = v.get(i);
                if(vs.length() < search.length())
                    continue;
                String a = vs.substring(0, search.length());
                if(search.equals(a)) {
                    System.out.println(vs);
                    found = true;
                    break;
                }
            }
            if(!found)
                System.out.println("Could not find word in list");
        }
    }
}
