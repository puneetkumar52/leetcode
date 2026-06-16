// Last updated: 6/16/2026, 8:52:38 AM
import java.util.*;
class Solution {
    public int maxProfit(int[] prices) {
      int max=0;
      int min=prices[0];
      for(int i=0;i<prices.length;i++){
        if(prices[i]<min){
            min=prices[i];
        }else{
            max=Math.max(max,prices[i]-min);
        }
      }
      return max;  
    }
}