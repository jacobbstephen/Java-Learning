import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
public class Program{
    public static void main(String[] args) {
        int arr[] = {0,0,0};
        List<List<Integer>> res = new ArrayList<>();
        Arrays.sort(arr);

        for(int i = 0; i < arr.length - 2; i++){
            if(i > 0 && arr[i] == arr[i - 1]) continue;
            int left = i + 1;
            int right = arr.length - 1;
            while(left < right){
                int sum = arr[i] + arr[left] + arr[right];
                if(sum == 0){
                    res.add(Arrays.asList(arr[i],arr[left], arr[right]));
                    while(left < right && arr[left] == arr[left + 1]) left++;
                    while(left< right && arr[right] == arr[right - 1]) right--;
                    left++; right--;

                }else if (sum < 0) left++;
                else right--;
            }
        }
        
        System.out.println(res);

    }
}