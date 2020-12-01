package lecture12;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class FileWriteTest {
    public static void main(String [] args) throws IOException {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Name of file: ");
        String filename = scanner.next();

        System.out.println("write q on the last line then press enter");
        FileWriter out = new FileWriter(filename);
        String str;
        while(!(str = scanner.nextLine()).equals("q")){
            out.write(str +"\r\n");
        }
        out.close();
        System.out.println("saved to "+ filename );
    }
}
