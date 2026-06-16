// Last updated: 6/16/2026, 8:51:53 AM
import java.util.*;
class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int count =0;
        int maxCount=0;
        for(int i=0;i<nums.length;i++){
            if (nums[i]==1){
                count++;
                maxCount= Math.max(count,maxCount);
            }
            else{
                count=0;
            }
        }
        return maxCount;
    }
}