// Last updated: 6/16/2026, 8:52:26 AM
class Solution {
    public int findPeakElement(int[] nums) {
        int left = 0;
        int right = nums.length - 1;
        
        while (left < right) {
            int mid = left + (right - left) / 2;
            
            if (nums[mid] > nums[mid + 1]){
                right = mid;
            } 
            else {
                left = mid + 1;
            }
        }
        return left;
    }
}
