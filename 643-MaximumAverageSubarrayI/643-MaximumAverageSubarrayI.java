// Last updated: 7/18/2026, 3:24:54 PM
class Solution {
    public double findMaxAverage(int[] nums, int k) {
        int wSum = 0;

        // First window
        for (int i = 0; i < k; i++) {
            wSum += nums[i];
        }

        int maxSum = wSum;

        // Slide the window
        for (int i = k; i < nums.length; i++) {
            wSum += nums[i];
            wSum -= nums[i - k];
            maxSum = Math.max(maxSum, wSum);
        }

        return (double) maxSum / k;
    }
}