public class merge_sort
{
    // Merges two subarrays of arr[].
    // First subarray is arr[l..m]
    // Second subarray is arr[m+1..r]
    void merge(int arr[], int l, int m, int r)
    {
        //합칠 두 배열의 크기 계산
        int n1 = m - l + 1;
        int n2 = r - m;

        //임시 배열 두개 생성
        int L[] = new int[n1];
        int R[] = new int[n2];

        for (int i = 0; i < n1; ++i)
            L[i] = arr[l + i];
        for (int j = 0; j < n2; ++j)
            R[j] = arr[m + 1 + j];

        int i = 0, j = 0;

        int k = l;
        while (i < n1 && j < n2) {
            if (L[i] <= R[j]) {
                arr[k] = L[i];
                i++;
            }
            else {
                arr[k] = R[j];
                j++;
            }
            k++;
        }

        //남아있는 수 배열에 넣기 (L)
        while (i < n1) {
            arr[k] = L[i];
            i++;
            k++;
        }

        ////남아있는 수 배열에 넣기 (R)
        while (j < n2) {
            arr[k] = R[j];
            j++;
            k++;
        }
    }

    //머지 함수
    void sort(int arr[], int l, int r)
    {
        if (l < r) {
            // 중간지점 찾기
            int m = (l + r) / 2;

            sort(arr, l, m);
            sort(arr, m + 1, r);

            // 다시 머지하기
            merge(arr, l, m, r);
        }
    }

    static void printArray(int arr[])
    {
        int n = arr.length;
        for (int i = 0; i < n; ++i)
            System.out.print(arr[i] + " ");
        System.out.println();
    }

    public static void main(String args[])
    {
        int arr[] = { 12, 11, 13, 5, 6, 7 };

        System.out.println("Given Array");
        printArray(arr);

        merge_sort ob = new merge_sort();
        ob.sort(arr, 0, arr.length - 1);

        System.out.println("\nSorted array");
        printArray(arr);
    }
}
