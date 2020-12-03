public class quick_sort
{
    int partition(int arr[], int low, int high)
    {
        int pivot = arr[high];
        int i = (low-1); 
        for (int j=low; j<high; j++)
        {
            // 지금 요소가 피벗보다 작다면
            if (arr[j] < pivot)
            {
                i++;

                // arr[i]과 arr[j]를 스왑한다 
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }

        // arr[i+1] 과 arr[high]를 스왑한다
        int temp = arr[i+1];
        arr[i+1] = arr[high];
        arr[high] = temp;

        return i+1;
    }

    void sort(int arr[], int low, int high)
    {
        if (low < high)
        { 
            int pi = partition(arr, low, high);
            //다시 재귀함수에 넣는다
            sort(arr, low, pi-1);
            sort(arr, pi+1, high);
        }
    }

    static void printArray(int arr[])
    {
        int n = arr.length;
        for (int i=0; i<n; ++i)
            System.out.print(arr[i]+" ");
        System.out.println();
    }

    public static void main(String args[])
    {
        int amount = 200_000;
        int list []= new int[amount];
        for(int i=0; i<amount; i++){
            list[i] = (int) (Math.random()*amount);
        }
        int n = list.length;
        int arr[] = {10, 7, 8, 9, 1, 5};

        quick_sort qs = new quick_sort();
        qs.sort(list, 0, n-1);

        System.out.println("sorted array");
        printArray(list);
    }
}
