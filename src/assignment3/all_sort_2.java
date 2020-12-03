import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class all_sort_2 {
    //원본 리스트를 계속 수정할 수 없어 복사하여 사용한다.
    public static int[] copyArray(int arr[]){
        int copy[] = new int[arr.length];
        for(int i=0; i<arr.length; i++) {
            int temp = arr[i];
            copy[i] = temp;
        }
        return copy;
    }
    public static void main(String [] args) throws IOException {

        //데이터를 무작위로 생성합니다.
        int amount = 300_000;

        int list []= new int[amount];
        for(int i=0; i<amount; i++){
            list[i] = (int) (Math.random()*amount);
        }
        int n = list.length;
        String output[] = new String[8];

        //랜덤하게 생성된 뎅이터를 파일에 저장한다.
        String filename = "data.txt";
        FileWriter out = new FileWriter(filename);
        int i=0;
        while(i<amount){
            out.write(list[i++] +"\r\n");
        }
        out.close();

        int copy [] = copyArray(list);
        long start, end, elapsedTime;

        //merge sort
        start = System.currentTimeMillis();
        bubble_sort.bubbleSort(copy, n);
        end = System.currentTimeMillis();
        elapsedTime = end - start;
        output[0] = "버블 소트 시간 : "+ elapsedTime;
        System.out.println(output[0]);

        //selection sort
        copy = copyArray(list);
        selection_sort ob = new selection_sort();
        start = System.currentTimeMillis();
        ob.sort(copy);
        end = System.currentTimeMillis();
        elapsedTime = end - start;
        output[1] = "선택 정렬 시간 : "+ elapsedTime;
        System.out.println(output[1]);

        //insertion sort

        copy = copyArray(list);
        insertion_sort is = new insertion_sort();
        start = System.currentTimeMillis();
        is.sort(copy);
        end = System.currentTimeMillis();
        elapsedTime = end - start;
        output[2] = "삽입 정렬 시간 : "+ elapsedTime;
        System.out.println(output[2]);

        //radix sort
        copy = copyArray(list);
        start = System.currentTimeMillis();
        radix_sort.radixsort(copy, n);
        end = System.currentTimeMillis();
        elapsedTime = end - start;
        output[3] = "기수 정렬 시간 : "+ elapsedTime;
        System.out.println(output[3]);

        //merge sort
        copy = copyArray(list);
        merge_sort ms = new merge_sort();
        start = System.currentTimeMillis();
        ms.sort(copy, 0, copy.length - 1);
        end = System.currentTimeMillis();
        elapsedTime = end - start;
        output[4] = "머지 소트 시간 : "+ elapsedTime;
        System.out.println(output[4]);

        //heap sort
        copy = copyArray(list);
        heap_sort hs = new heap_sort();
        start = System.currentTimeMillis();
        hs.sort(copy);
        end = System.currentTimeMillis();
        elapsedTime = end - start;
        output[5]="힙 소트 시간 : "+ elapsedTime;
        System.out.println(output[5]);

        //quick sort
        int low = 0;
        int high = copy.length - 1;
        copy = copyArray(list);
        start = System.currentTimeMillis();
        quick_sort_2.quickSort(copy, low, high);
        end = System.currentTimeMillis();
        elapsedTime = end - start;
        output[6]="퀵 소트 시간 : "+ elapsedTime;
        System.out.println(output[6]);

//        copy = copyArray(list);
//        QuickSort qs = new QuickSort();
//        start = System.currentTimeMillis();
//        qs.sort(list, 0, n-1);
//        end = System.currentTimeMillis();
//        elapsedTime = end - start;
//        System.out.println("time it took for quick sort: "+ elapsedTime);

        //shell sort
        copy = copyArray(list);
        shell_sort ss = new shell_sort();
        start = System.currentTimeMillis();
        ss.sort(copy);
        end = System.currentTimeMillis();
        elapsedTime = end - start;
        output[7] = "쉘 소트 시간 : "+ elapsedTime;
        System.out.println(output[7]);

        //랜덤하게 생성된 뎅이터를 파일에 저장한다.
        String filename_out = "result.txt";
        FileWriter out_result = new FileWriter(filename_out);
        i=0;
        while(i<8){
            out_result.write(output[i++] +"\r\n");
        }
        out_result.close();
    }
}
