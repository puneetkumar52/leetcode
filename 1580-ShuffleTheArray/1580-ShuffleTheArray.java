// Last updated: 6/16/2026, 8:51:28 AM
class Solution {
    public int[] shuffle(int[] nums, int n) {
        int[] result = new int[2 * n];
        int index = 0;

        for (int i = 0; i < n; i++) {
            result[index] = nums[i];
            index++;
            result[index] = nums[i + n];
            index++;
        }

        return result;
    }
}