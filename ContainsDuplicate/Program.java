import java.util.HashSet;
class Solution{
    
    public boolean checkDuplicates(int arr[]){
        HashSet<Integer> set = new HashSet<>();

        for(int i = 0; i < arr.length; i++){
            if(set.contains(arr[i])) return true;
            set.add(arr[i]);
        }
        return false;
    }

   
}
public class Program {
    public static void main(String[] args) {
        Solution obj = new Solution();
        int arr[] = {1,2,3,3};
        System.out.println(obj.checkDuplicates(arr));
    }
}
