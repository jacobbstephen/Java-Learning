import java.util.ArrayList;
import java.util.List;

public class Program {
    static List<List<Integer>> res = new ArrayList<>();
    static int arr[] = {1,2, 1};
    static void subSequence(int idx, int n, int sum, int target,List<Integer> curr ){
        if(idx >= n){
            if(sum == target){
                res.add(new ArrayList<>(curr));
            }
            return;
        }
        curr.add(arr[idx]);
        sum += arr[idx];
        subSequence(idx + 1,n, sum, target, curr);
        sum -= arr[idx];
        curr.remove(curr.size() - 1);
        subSequence(idx + 1,n,  sum, target, curr);
    }
    static boolean OneSubSequence(int idx, int n, int sum, int target,List<Integer> curr ){
        if(idx >= n){
            if(sum == target){
                res.add(new ArrayList<>(curr));
                return true;
            }
            return false;
        }
        curr.add(arr[idx]);
        sum += arr[idx];
        if(OneSubSequence(idx + 1,n, sum, target, curr)) return true;
        sum -= arr[idx];
        curr.remove(curr.size() - 1);
        if(OneSubSequence(idx + 1,n, sum, target, curr)) return true;
        return false;
    }
    static int countSubSequence(int idx, int n, int sum, int target){
        if(sum > target) return 0;
        if(idx == n){
            if(sum == target){
                return 1;
            }
            return 0;
        }
        sum += arr[idx];
        int l = countSubSequence(idx + 1,n, sum, target);
        sum -= arr[idx];
        int r = countSubSequence(idx + 1,n,  sum, target);
        return l + r;
    }
    public static void main(String[] args) {
        int n = 3;
        int target = 3;
        int sum = 0;
        List<Integer> curr = new ArrayList<>();
        int count = countSubSequence(0, n, sum,target);
        System.out.println(count);

    }
}
