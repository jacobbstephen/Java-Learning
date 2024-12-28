
class Solution{
    
    public int[] productOfArrayExceptSelf(int arr[]){
        int len = arr.length;
        int answer[] = new int[len];
        int prefix = 1;
        int postfix = 1;

        for(int i = 0; i < len; i++){
            answer[i] = prefix;
            prefix = prefix * arr[i];
        }

        for(int i = len - 1; i >= 0; i--){
            answer[i] =  answer[i] * postfix;
            postfix = postfix * arr[i];
        }
        return answer;
    }
    public void display(int arr[]){
        System.out.print("[ ");
        int len = arr.length;
        for(int i = 0; i < len - 1; i++){
            System.out.print(arr[i] + ", ");
        }
        System.out.println( arr[len - 1] + "]");
    }

   
}
public class Program {
    public static void main(String[] args) {
        Solution obj = new Solution();
        int arr[] = {-1,1,0,-3,3};
        int answer[] = obj.productOfArrayExceptSelf(arr);
        obj.display(answer);
    }
}
