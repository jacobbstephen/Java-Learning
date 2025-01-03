import java.util.ArrayList;
import java.util.List;

public class Program {
    static void combinationSum(int idx, int[]candidates, int target,List<List<Integer>> ans, List<Integer> curr){

        if(idx == candidates.length){
            if(target == 0){
                ans.add(new ArrayList<>(curr));
            }
            return;
        }

        if(candidates[idx] <= target){
            curr.add(candidates[idx]);
            combinationSum(idx, candidates, target - candidates[idx], ans, curr);
            curr.remove(curr.size() - 1);
        }
        combinationSum(idx + 1, candidates, target, ans, curr);
    }
    public static void main(String[] args) {
        int candidates[] = {2,3,6,7};
        int target = 7;
        List<List<Integer>> ans = new ArrayList<>();

        combinationSum(0,candidates, target,ans, new ArrayList<>());
        System.out.println(ans);

    }
}    