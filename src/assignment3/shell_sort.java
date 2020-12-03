public class shell_sort
{
    static void printArray(int arr[])
    {
        int n = arr.length;
        for (int i=0; i<n; ++i)
            System.out.print(arr[i] + " ");
        System.out.println();
    }

    int sort(int arr[])
    {
        int n = arr.length;

        // 갭은 계속 2로 나누며 업데이트한다
        for (int gap = n/2; gap > 0; gap /= 2)
        {
            for (int i = gap; i < n; i += 1)
            {
                int temp = arr[i];
                int j;
                for (j = i; j >= gap && arr[j - gap] > temp; j -= gap)
                    arr[j] = arr[j - gap];
                arr[j] = temp; //temp를 원래 자리에 넣는다
            }
        }
        return 0;
    }

    public static void main(String args[])
    {
        int arr[] = {12, 34, 54, 2, 3};
        System.out.println("Array before sorting");
        printArray(arr);

        shell_sort ob = new shell_sort();
        ob.sort(arr);

        System.out.println("Array after sorting");
        printArray(arr);
    }
}
