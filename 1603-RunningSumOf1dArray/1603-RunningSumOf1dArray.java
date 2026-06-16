// Last updated: 6/16/2026, 8:51:26 AM
class Solution {
    public int[] runningSum(int[] nums) {
        for (int i=1;i<nums.length;i++){
            nums[i]+=nums[i-1];
        }
        return nums;
    }
}