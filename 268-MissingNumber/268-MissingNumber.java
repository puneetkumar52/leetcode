// Last updated: 6/16/2026, 8:52:04 AM
class Solution {
    public int missingNumber(int[] nums) {
        int n=nums.length;
        int sum=n*(n+1)/2;
        int arr_sum=0;
        for(int i=0;i<n;i++){
            arr_sum+=nums[i];
        }
        return sum-arr_sum;
    }
}