import java.util.ArrayList;
import java.util.HashSet;
public class Program{
    public static void main(String[] args) {
        HashSet<Integer> hm = new HashSet<>();
        int arr[] = {2, 7, 11, 15};
        int target = 18;
        for(int i = 0; i < arr.length; i++){
            hm.add(arr[i]);
        }

        ArrayList<Integer> res = new ArrayList<>();
        for(int i = 0; i < arr.length; i++){
            if(hm.contains(target - arr[i])){
                res.add(arr[i]);
                res.add(target - arr[i]);
                break;
            }
        }
        System.out.println(res);

    }
}