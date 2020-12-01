package lecture12;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class FileReaderTest {
    public static void main(String [] args) throws IOException {
        File f=new File("text.txt");
        FileReader in = new FileReader("text.txt");
        //FileReader in = new FileReader(f);
        int ch;
        while((ch = in.read())!=-1){
            System.out.print((char)ch);
        }
    }
}
