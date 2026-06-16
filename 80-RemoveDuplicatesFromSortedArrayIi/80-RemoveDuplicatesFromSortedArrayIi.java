// Last updated: 6/16/2026, 8:52:48 AM
class Solution {
    public int removeDuplicates(int[] nums) {
        int k = 2;
        for(int i = 2;i<nums.length;i++){
            if(nums[i]!=nums[k-2]){
                nums[k] = nums[i];
                k++;
            }
        }
        return k;
    }
}