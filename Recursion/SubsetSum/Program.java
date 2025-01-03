import java.util.ArrayList;
import java.util.List;
public class Program {
    static void subsetSum(int idx, int sum, int[] arr, List<Integer> ans){
        if(idx == arr.length){
            ans.add(sum);
            return;
        }

        sum += arr[idx];
        subsetSum(idx + 1, sum, arr, ans);
        sum -= arr[idx];
        subsetSum(idx + 1, sum, arr, ans);
    }
    public static void main(String[] args) {
        int arr[] = {3, 1, 2};
        List<Integer> ans = new ArrayList<>();
        subsetSum(0, 0, arr, ans);
        ans.sort(null);
        System.out.println(ans);
    }
}
