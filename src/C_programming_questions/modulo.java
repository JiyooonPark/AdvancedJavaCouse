package C_programming_questions;

public class modulo {
    public static void main(String [] args){
        int size = 8;
        int total=0;
        int arr[] = {1, 2, 15, 14, 13, 12, 11, 10};
        for( int i=0; i<8; i++){
            total += Math.pow(16, i)*arr[i];
        }
        System.out.println(total);

        System.out.println(-1%8);
        for(int i=0; i< 30; i++){
            System.out.printf("%d : %d , %d\n",i, (i-1)%size, (i-1+size)% size);
        }
    }
}
