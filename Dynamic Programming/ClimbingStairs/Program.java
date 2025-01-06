

public class Program {
    static int climbStairs(int n){
        if(n <= 1) return n;
        int first = 1;
        int second = 1; 
        int curr = 0;

        for(int i = 2; i <= n; i++){
           curr = first + second;
           second = first;
           first = curr;
        }
        return first;
    }
    public static void main(String[] args) {
        int n = 2;
        System.out.println(climbStairs(n));
    }
}
