
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
public class Program {
    static void subsetSum(int idx, int[] arr, List<List<Integer>> ans, List<Integer> ds){
        ans.add(new ArrayList<>(ds));

        for(int i = idx; i < arr.length; i++){
            if(i != idx && arr[i] == arr[i - 1]) continue;
            ds.add(arr[i]);
            subsetSum(i + 1, arr, ans, ds);
            ds.remove(ds.size() - 1);
        }
    }
    public static void main(String[] args) {
        int arr[] = {1, 2, 2};
        Arrays.sort(arr);
        List<List<Integer>> ans = new ArrayList<>();
        subsetSum(0, arr, ans, new ArrayList<>());
        System.out.println(ans);
    }
}
