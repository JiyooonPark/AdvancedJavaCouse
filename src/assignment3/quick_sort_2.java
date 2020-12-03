import java.util.Arrays;

public class quick_sort_2 {
    public static void main(String[] args) {
        int[] x = { 9, 2, 4, 7, 3, 7, 10 };
        System.out.println(Arrays.toString(x));

        int low = 0;
        int high = x.length - 1;

        quickSort(x, low, high);
        System.out.println(Arrays.toString(x));
    }

    public static void quickSort(int[] arr, int low, int high) {
        if (arr == null || arr.length == 0)
            return;

        if (low >= high)
            return;

        // 피벗은  low + (high - low) / 2 로 정한다
        int middle = low + (high - low) / 2;
        int pivot = arr[middle];

        // 피벗보다 작은건 왼쪽에 큰건 오른쪽에 넣는다 
        int i = low, j = high;
        while (i <= j) {
            while (arr[i] < pivot) {
                i++;
            }

            while (arr[j] > pivot) {
                j--;
            }

            if (i <= j) {
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
                i++;
                j--;
            }
        }
        // 재귀적으로 함수를 다시 부른다
        if (low < j)
            quickSort(arr, low, j);

        if (high > i)
            quickSort(arr, i, high);
    }
}