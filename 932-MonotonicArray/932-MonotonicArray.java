// Last updated: 6/18/2026, 12:10:35 PM
class Solution {
    public boolean isMonotonic(int[] nums) {
        int n = nums.length;

        if (n == 1) return true;

        boolean inc = true;
        boolean dec = true;

        for (int i = 1; i < n; i++) {
            if (nums[i] < nums[i - 1]) {
                inc = false;
            }
            if (nums[i] > nums[i - 1]) {
                dec = false;
            }
        }

        return inc || dec;
    }
}