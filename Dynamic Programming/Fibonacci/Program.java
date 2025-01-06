public class Program{
    static int fiboUsingMemoization(int n, int[] dp){
        if(n <= 1) return n;
        if(dp[n] != -1) return dp[n];
        dp[n] = fiboUsingMemoization(n - 1, dp) +  fiboUsingMemoization(n - 2, dp);
        return dp[n];
    }
    static int fiboUsingTabulation(int n, int[] dp){
        if(n <= 1) return n;
        dp[0] = 0;
        dp[1] = 1;
        for(int i = 2; i <= n; i++){
            dp[i] = dp[i - 1] + dp[i - 2];
        }
        return dp[n];
    }
    static int fiboUsingTabulationOptimized(int n){
        if(n <= 1) return n;
        int prev = 1;
        int prev2 = 0; 
        int curr = 0;

        for(int i = 2; i <= n; i++){
           curr = prev + prev2;
           prev2 = prev;
           prev = curr;
        }
        return prev;
    }

    public static void main(String[] args) {
        int n = 0;
        int dp[] = new int[n + 1];
        for(int i = 0; i < dp.length; i++){
            dp[i] = -1;
        }
        System.out.println(fiboUsingMemoization(n, dp));
        System.out.println(fiboUsingTabulation(n, dp));
        System.out.println(fiboUsingTabulationOptimized(n));
        
    }
}