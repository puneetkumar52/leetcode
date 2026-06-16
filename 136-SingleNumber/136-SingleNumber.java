// Last updated: 6/16/2026, 8:52:36 AM
class Solution {
    public int singleNumber(int[] nums) {
        int sum=0;
        for(int i=0;i<nums.length ; i++){
            sum=sum^nums[i];
        }
        return sum;
    }
}