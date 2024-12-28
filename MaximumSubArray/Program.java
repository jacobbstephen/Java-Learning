class Solution{
    int maxSum = Integer.MIN_VALUE;
    public int MaximumSumBruteForce(int arr[]){
        for(int i = 0; i < arr.length; i++){
            int sum = 0;
            for(int j = i; j < arr.length; j++){
                sum += arr[j];
                maxSum = Math.max(sum, maxSum);
                // display(arr, i, j);
            }
        }
        return maxSum;
    }

    public int MaximumSumOptimal(int arr[]){
        int currSum = 0;
        int maxSum = Integer.MIN_VALUE;
        int ansStart = -1;
        int ansEnd = -1;
        int start = -1;
        for(int i = 0; i < arr.length; i++){
            if(currSum == 0) start = i;
            currSum += arr[i];
            if(currSum > maxSum){
                maxSum = currSum;
                ansStart = start;
                ansEnd = i;
            }
            if(currSum < 0) currSum = 0;

        }
        display(arr, ansStart, ansEnd);
        return maxSum;
    }
    public void display(int arr[], int start, int end){
        System.out.print("[ ");
    
        for(int i = start; i < end; i++){
            System.out.print(arr[i] + ", ");
        }
        System.out.print(arr[end]);
        System.out.println(" ]");
    }
   
}
public class Program {
    public static void main(String[] args) {
        Solution obj = new Solution();
        int arr[] = {-2,1,-3,4,-1,2,1,-5,4};
        System.out.println(obj.MaximumSumBruteForce(arr));
        System.out.println(obj.MaximumSumOptimal(arr));

    }
}
