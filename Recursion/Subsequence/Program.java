import java.util.ArrayList;
import java.util.List;

public class Program {
    static List<List<Integer>> res = new ArrayList<>();
    static int arr[] = {3,1,2};
    static void subSequence(int idx, int n, List<Integer> curr){
        if(idx >= n){
            res.add(new ArrayList<>(curr));
            return;
        }
        curr.add(arr[idx]);
        subSequence(idx + 1, n, curr);
        curr.remove(curr.size() - 1);
        subSequence(idx + 1, n, curr);
    }
    public static void main(String[] args) {
        int n = 3;
        List<Integer> curr = new ArrayList<>();
        subSequence(0, n, curr);
        System.out.println(res);

    }
}
