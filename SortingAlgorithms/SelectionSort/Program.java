import java.util.*;

public class Program {
    static void swap(int[] arr, int start, int end) {
        int temp = arr[start];
        arr[start] = arr[end];
        arr[end] = temp;
    }
    static int findMin(int[] arr, int n, int start){
        int minElement = arr[start];
        int minIndex = start;
        for(int i = start + 1; i < n; i++){
            if(arr[i] < minElement){
                minElement = arr[i];
                minIndex = i;
            }
        }
        return minIndex;
    }
    static void selectionSort(int[] arr, int n) {
        for (int i = 0; i < n; i++) {
            int minIndex = findMin(arr, n, i);
            swap(arr, i, minIndex);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of the array: ");
        int n = sc.nextInt();
        int arr[] = new int[n];

        System.out.println("Enter the elements of the array: ");
        for (int i = 0; i < n; i++) {
            int num = sc.nextInt();
            arr[i] = num;
        }

        selectionSort(arr, n);

        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }

        System.out.println();

    }
}