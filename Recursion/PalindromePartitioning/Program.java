import java.util.ArrayList;
import java.util.List;
public class Program {
    static void findPartition(int index, String str, List<String> path, List<List<String>> res){
        if(index == str.length()){
            res.add(new ArrayList<>(path));
            return;
        }

        for(int i = index; i < str.length(); i++){
            if(isPalindrome(str, index, i)){
                path.add(str.substring(index, i + 1));
                findPartition(i + 1, str, path, res);
                path.remove(path.size() - 1);
            }
        }
    }

    static boolean isPalindrome(String str, int start, int end){
        while(start <= end){
            if(str.charAt(start++)!= str.charAt(end--) ){
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        String str = "aabb";
        List<List<String>> res = new ArrayList<>();
        findPartition(0, str, new ArrayList<>(), res);
        System.out.println(res);

    }
}
