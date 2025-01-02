public class Program {
    String str = "jacob";
    boolean checkPal(int i, int n){
        if(i >= n / 2) return true;
        if(str.charAt(i) != str.charAt(n - i - 1)) return false;
        return checkPal(i + 1, n);
    }
    public static void main(String[] args) {
        Program obj = new Program();
        int n = obj.str.length();
        System.out.println(obj.checkPal(0,n));

    }
}
