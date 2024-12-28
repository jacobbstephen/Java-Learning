class Solution{
    int buyPrice = Integer.MAX_VALUE;
    int profit = 0;
    // int buyDay = -1;
    // int sellDay = -1;

    public int profitGained(int price[]){
        for(int i = 0; i < price.length; i++){
            // selling condition
            if(buyPrice < price[i]){
                profit = Math.max(profit, price[i] - buyPrice);
            }else{
                buyPrice = price[i];

            }
        }
        return profit;
    }
} 
public class Program{
    public static void main(String[] args) {
        Solution obj = new Solution();
        int price[] = {7,6,4,3,1};
        int profit = obj.profitGained(price);
        System.out.println(profit);

    }
}