import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

//1876166 박지윤 자료구조 과제 2 파일에서 읽어오기

public class FileReader {
    static int size = 100;
    static String[] words = new String[size];
    static int[] count = new int[size];
    static int[] rank = new int[size];

    public static void main(String[] args) {
        String order;
        int i=0;
        try {
            File myObj = new File("text.txt");
            Scanner myReader = new Scanner(myObj);
            order = myReader.nextLine();

            while (myReader.hasNextLine()) {
                rank[i] = Integer.parseInt(myReader.next());
                count[i] = Integer.parseInt(myReader.next());
                words[i++] = myReader.next();
            }
            myReader.close();
        } catch (FileNotFoundException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
        for(i=0; i<size; i++){

            System.out.print(count[i]+" ,");

        }
        System.out.println();
        for(i=0; i<size; i++){
            System.out.print("\""+words[i]+"\" ,");

        }
    }
}
