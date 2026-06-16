// Last updated: 6/16/2026, 8:52:02 AM
class Solution {
    public void moveZeroes(int[] nums) {
        
        int j=0;
        for (int i=0;i<nums.length;i++){
            if(nums[i]!=0){
                int temp=nums[i];
                nums[i]=nums[j];
                nums[j]=temp;
                j++;
            }
        }
    }
}