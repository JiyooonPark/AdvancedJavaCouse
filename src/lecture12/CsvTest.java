package lecture12;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class CsvTest {
    public static void main(String [] args) throws IOException {
        FileReader fr = new FileReader("sample.csv");
        String line = null;
        String cvsSplit = ",";

        BufferedReader br = new BufferedReader(fr);
        while((line=br.readLine())!=null){
            String arr[] = line.split(cvsSplit);
            for(String s:arr){
                System.out.print(s);
            }
            System.out.println();
        }
        br.close();
    }
}
