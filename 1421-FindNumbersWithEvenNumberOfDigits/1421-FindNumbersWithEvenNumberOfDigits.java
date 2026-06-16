// Last updated: 6/16/2026, 8:51:33 AM
class Solution {
    public int findNumbers(int[] nums) {
        int count = 0;
        for (int i = 0; i < nums.length; i++) {
            int num = nums[i];
            int digit = 0;
            while (num > 0) {
                num = num / 10;
                digit++;
            }
            if (digit % 2 == 0) {
                count++;
            }
        }
        return count;
    }
}
