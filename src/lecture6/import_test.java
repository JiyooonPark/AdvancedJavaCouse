package lecture6;

import java.util.*;
//cannot import java.* or java.util;
public class import_test {
    public static void main(String [] args){
        Scanner scanner = new Scanner(System.in);
        int arr[] = {1, 2, 3, 1, 1, 1, 1, 2, 3, 1, 12, 1, 3};
        Arrays.sort(arr);
        for(int i=0; i<arr.length; i++)
            System.out.print(arr[i]+" ");

    }
}
