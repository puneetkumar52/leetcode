// Last updated: 6/22/2026, 11:18:36 AM
class Solution {
    public int maxProfit(int[] prices) {
        int profit=0;
        for(int i=1;i<prices.length;i++){
            if (prices[i]>prices[i-1]){
                profit=profit+(prices[i]-prices[i-1]);
            }
            
        }
        return profit;
    }
}