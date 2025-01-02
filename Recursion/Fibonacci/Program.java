public class Program {
    static int fibo(int n){
        if(n <= 1) return n;
        return fibo(n - 1) + fibo(n - 2);
    }
    public static void main(String[] args) {
        int arr[] = {1,2,3,4,5};
        
        System.out.println(fibo(8));

    }
}
