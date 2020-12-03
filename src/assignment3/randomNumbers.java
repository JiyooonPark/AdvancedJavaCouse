import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class randomNumbers {
    public static void main(String [] args) throws IOException {
        int amount = 30_000;
        Scanner scanner = new Scanner(System.in);

        int list []= new int[amount];
        for(int i=0; i<amount; i++){
            list[i] = (int) (Math.random()*amount);
            System.out.print(list[i]+", ");
        }

        FileWriter out = new FileWriter("30_000_numbers.txt");
        int i=0;
        while(i<amount){
            out.write(list[i++] +", ");
        }
        out.close();
        System.out.println("saved to "+ "30_000_numbers.txt");


    }
}
