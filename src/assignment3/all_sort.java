public class all_sort {
    public static int[] copyArray(int arr[]){
        int copy[] = new int[arr.length];
        for(int i=0; i<arr.length; i++) {
            int temp = arr[i];
            copy[i] = temp;
        }
        return copy;
    }
    public static void main(String [] args){

        //데이터를 무작위로 생성합니다.
        int amount = 300_000;

        int list []= new int[amount];
        for(int i=0; i<amount; i++){
            list[i] = (int) (Math.random()*amount);
        }
        int n = list.length;
//        MergeSort.printArray(list);

        int copy [] = copyArray(list);
        long start, end, elapsedTime;

        //merge sort
        System.out.print("before: ");
        merge_sort.printArray(copy);

        start = System.currentTimeMillis();
        bubble_sort.bubbleSort(copy, n);
        end = System.currentTimeMillis();
        elapsedTime = end - start;

        System.out.print("after: ");
        merge_sort.printArray(copy);

        System.out.println("time it took for bubble sort: "+ elapsedTime);

        //selection sort
        copy = copyArray(list);

        System.out.print("before: ");
        merge_sort.printArray(copy);

        selection_sort ob = new selection_sort();
        start = System.currentTimeMillis();
        ob.sort(copy);
        end = System.currentTimeMillis();
        elapsedTime = end - start;

        System.out.print("after: ");
        merge_sort.printArray(copy);

        System.out.println("time it took for selection sort: "+ elapsedTime);

        //radix sort
        copy = copyArray(list);

//        System.out.print("before: ");
//        MergeSort.printArray(copy);

        start = System.currentTimeMillis();
        radix_sort.radixsort(copy, n);
        end = System.currentTimeMillis();
        elapsedTime = end - start;

//        System.out.print("after: ");
//        MergeSort.printArray(copy);

        System.out.println("time it took for radix sort: "+ elapsedTime);

        //merge sort
        copy = copyArray(list);

//        System.out.print("before: ");
//        MergeSort.printArray(copy);

        merge_sort ms = new merge_sort();
        start = System.currentTimeMillis();
        ms.sort(copy, 0, copy.length - 1);
        end = System.currentTimeMillis();
        elapsedTime = end - start;

//        System.out.print("after: ");
//        MergeSort.printArray(copy);

        System.out.println("time it took for merge sort: "+ elapsedTime);

        //heap sort
        copy = copyArray(list);

//        System.out.print("before: ");
//        MergeSort.printArray(copy);

        heap_sort hs = new heap_sort();
        start = System.currentTimeMillis();
        hs.sort(copy);
        end = System.currentTimeMillis();
        elapsedTime = end - start;

//        System.out.print("after: ");
//        MergeSort.printArray(copy);

        System.out.println("time it took for heap sort: "+ elapsedTime);

        //quick sort
        int low = 0;
        int high = copy.length - 1;
        copy = copyArray(list);

//        System.out.print("before: ");
//        MergeSort.printArray(copy);

        start = System.currentTimeMillis();
        quick_sort_2.quickSort(copy, low, high);
        end = System.currentTimeMillis();
        elapsedTime = end - start;

//        System.out.print("after: ");
//        MergeSort.printArray(copy);

        System.out.println("time it took for quick sort: "+ elapsedTime);

//        copy = copyArray(list);
//        QuickSort qs = new QuickSort();
//        start = System.currentTimeMillis();
//        qs.sort(list, 0, n-1);
//        end = System.currentTimeMillis();
//        elapsedTime = end - start;
//        System.out.println("time it took for quick sort: "+ elapsedTime);

        //shell sort
        copy = copyArray(list);

//        System.out.print("before: ");
//        MergeSort.printArray(copy);

        shell_sort ss = new shell_sort();
        start = System.currentTimeMillis();
        ss.sort(copy);
        end = System.currentTimeMillis();
        elapsedTime = end - start;

//        System.out.print("after: ");
//        MergeSort.printArray(copy);

        System.out.println("time it took for shell sort: "+ elapsedTime);
    }
}
