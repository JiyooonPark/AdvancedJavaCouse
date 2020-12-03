import java.io.*;
import java.util.Scanner;

public class bubble_sort
{
    static void bubbleSort(int arr[], int n)
    {
        int i, j, temp;
        boolean swapped;
        for (i = 0; i < n - 1; i++){
            swapped = false;
            for (j = 0; j < n - i - 1; j++){
                if (arr[j] > arr[j + 1]){
                    // swap arr[j] and arr[j+1] 
                    temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                    swapped = true;
                }
            }

            //스왑이 안됬다면 거기서 멈추도록 한다.
            if (swapped == false)
                break;
        }
    }

    static void printArray(int arr[], int size) {
        int i;
        for (i = 0; i < size; i++)
            System.out.print(arr[i] + " ");
        System.out.println();
    }

//    public static void main(String args[]) {
//        int amount = 30_000;
//
//        int list []= new int[amount];
//        for(int i=0; i<amount; i++){
//            list[i] = (int) (Math.random()*amount);
//        }
//        int n = list.length;
//        long start = System.currentTimeMillis();
//        bubbleSort(list, n);
//        long end = System.currentTimeMillis();
//        System.out.println("Sorted array: ");
//        printArray(list, n);
//        long elapsedTime = end - start;
//        System.out.print("time it took : "+ elapsedTime);
//    }
} 
  