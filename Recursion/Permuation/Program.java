import java.util.ArrayList;
import java.util.List;
public class Program {

    static void permuationWithExtraSpace(int[] arr, List<List<Integer>> res, ArrayList<Integer> curr, boolean[] freq){
        if(curr.size() == arr.length){
            res.add(new ArrayList<>(curr));
            return;
        }

        for(int i = 0; i < arr.length; i++){
            if(freq[i]) continue;
            freq[i] = true;
            curr.add(arr[i]);
            permuationWithExtraSpace(arr, res, curr, freq);
            curr.remove(curr.size() - 1);
            freq[i] = false;
        }
    }
    static void swap(int i, int j, int[] arr){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
    static void permuationUsingSwappingMethod(int index, List<List<Integer>> res, int[] arr){
        if(arr.length == index){
            List<Integer> ds = new ArrayList<>();
            for(int i = 0; i < arr.length; i++){
                ds.add(arr[i]);
            }
            res.add(ds);
            return;

        }
        for(int i = index; i < arr.length; i++){
            swap(index, i, arr);
            permuationUsingSwappingMethod(index + 1, res, arr);
            swap(index, i, arr);
        }
    }
    public static void main(String[] args) {
        int arr[] = {1, 2, 3};
        List<List<Integer>> res = new ArrayList<>();
        boolean freq[] = new boolean[arr.length];
        permuationWithExtraSpace(arr, res, new ArrayList<>(), freq);
        System.out.println(res);
        res.clear();
        permuationUsingSwappingMethod(0,res,arr);
        System.out.println(res);
    }
}
