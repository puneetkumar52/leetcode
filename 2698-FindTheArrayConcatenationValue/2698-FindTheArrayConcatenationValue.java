// Last updated: 6/16/2026, 8:51:13 AM
class Solution {
    public long findTheArrayConcVal(int[] nums) {
        int i = 0;
        int j = nums.length - 1;
        long total = 0;

        while (i <= j) {
            if (i == j) {
                total += nums[i];
            } else {
                String concat = String.valueOf(nums[i]) + String.valueOf(nums[j]);
                total += Long.parseLong(concat);
            }
            i++;
            j--;
        }

        return total;
    }
}
