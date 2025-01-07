import java.util.Arrays;

public class Program {
    static int frogJump(int[] arr, int idx){
        if(idx == 0) return 0;
        int left = frogJump(arr, idx - 1) + Math.abs(arr[idx] - arr[idx - 1]);
        int right = Integer.MAX_VALUE;
        if(idx > 1){
            right = frogJump(arr, idx - 2) + Math.abs(arr[idx] - arr[idx - 2]); 
        }
        return Math.min(left, right);

    }
    static int frogJumpUsingMemoization(int[] arr, int idx, int[] dp){
        if(idx == 0) return 0;
        if(dp[idx] != -1) return dp[idx];
        int left = frogJump(arr, idx - 1) + Math.abs(arr[idx] - arr[idx - 1]);
        int right = Integer.MAX_VALUE;
        if(idx > 1){
            right = frogJump(arr, idx - 2) + Math.abs(arr[idx] - arr[idx - 2]); 
        }
        dp[idx] = Math.min(left, right);
        return dp[idx];

    }
    public static void main(String[] args) {
        int arr[] = {7, 4, 4, 2, 6, 6, 3, 4};
        int ans =  frogJump(arr, arr.length - 1);
        System.out.println("Minimum energy lost using Recursion: " + ans);
        int dp[] = new int[arr.length + 1];
        Arrays.fill(dp, -1);
        ans = frogJumpUsingMemoization(arr, arr.length - 1, dp);
        System.out.println("Minimum energy lost using Memoisation: " + ans);

    }
}
