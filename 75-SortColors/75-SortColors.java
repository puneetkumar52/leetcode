// Last updated: 7/7/2026, 10:53:34 AM
class Solution {
    public void sortColors(int[] nums) {
        int temp;
        for (int i=0;i<nums.length-1;i++){
            for (int j=i+1;j<nums.length;j++){
                if (nums[i]>nums[j]){
                    temp=nums[j];
                    nums[j]=nums[i];
                    nums[i]=temp;

                }
            }
        }
    }
}