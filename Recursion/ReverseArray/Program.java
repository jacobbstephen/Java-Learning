public class Program {
    
    static void reverse(int l, int r, int arr[]){
        if(l >= r) return;
        int temp = arr[l];
        arr[l] = arr[r];
        arr[r] = temp;
        reverse(l + 1, r - 1, arr);
    }
    public static void main(String[] args) {
        int arr[] = {1,2,3,4,5};
        reverse(0, arr.length - 1, arr);
        for(int i = 0; i < arr.length; i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println();

    }
}
