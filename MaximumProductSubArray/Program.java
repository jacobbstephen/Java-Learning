class Solution{
    int maxProduct = Integer.MIN_VALUE;
    public int MaximumProductBruteForce(int arr[]){
        for(int i = 0; i < arr.length; i++){
            int product = 1;
            for(int j = i; j < arr.length; j++){
                product *= arr[j];
                if(product > maxProduct){
                    maxProduct = product;
                    // display(arr, i, j);
                } 
            }
        }
        return maxProduct;
    }

    public int MaximumProductOptimal(int arr[]){
        int maxProduct = Integer.MIN_VALUE;
        int prefix = 1;
        int suffix = 1;
        int len = arr.length;
        for(int i = 0; i < len; i++){
            if(prefix == 0) prefix = 1;
            if(suffix == 0) suffix = 1;
            prefix = prefix * arr[i];
            suffix = suffix * arr[len - 1 - i];
            maxProduct = Math.max(maxProduct, Math.max(prefix, suffix));
        }
        return maxProduct;
    }
    public void display(int arr[], int start, int end){
        System.out.print("[ ");
    
        for(int i = start; i < end; i++){
            System.out.print(arr[i] + ", ");
        }
        System.out.print(arr[end]);
        System.out.println("]");
    }
   
}
public class Program {
    public static void main(String[] args) {
        Solution obj = new Solution();
        int arr[] = {2,3,-2,4};
        System.out.println(obj.MaximumProductBruteForce(arr));
        System.out.println(obj.MaximumProductOptimal(arr));

    }
}
