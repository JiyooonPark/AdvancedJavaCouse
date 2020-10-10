package lecture6;

import java.util.Arrays;

public class ArrayTest {
    public static void main(String [] args){
        int [] arr = {50, 30, 40, 10, 20};
        printArray(arr);
        //System.out.println(Arrays.binarySearch(arr, 50));
        Arrays.sort(arr);
        printArray(arr);
        System.out.println(Arrays.binarySearch(arr, 50));
        Arrays.fill(arr, 100);
        printArray(arr);

    }

    private static void printArray(int arr[]) {
        System.out.print("[ ");
        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println("]");
    }
}
