import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Program {
    static void combinationSumII(int idx, int[]candidates, int target,List<List<Integer>> ans, List<Integer> curr){

        if(target == 0){
            ans.add(new ArrayList<>(curr));
            return;
        }
        for(int i = idx; i < candidates.length; i++){
            if(i > idx && candidates[i] == candidates[i - 1]) continue;
            if(candidates[i] > target) break;

            curr.add(candidates[i]);
            combinationSumII(i + 1, candidates, target - candidates[i], ans, curr);
            curr.remove(curr.size() - 1);
        }

        
    }
    public static void main(String[] args) {
        int candidates[] = {1, 1, 1, 2, 2};
        int target = 4;
        List<List<Integer>> ans = new ArrayList<>();
        Arrays.sort(candidates);
        combinationSumII(0,candidates, target,ans, new ArrayList<>());
        System.out.println(ans);

    }
}    