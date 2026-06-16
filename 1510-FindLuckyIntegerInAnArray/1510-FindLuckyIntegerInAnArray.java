// Last updated: 6/16/2026, 8:51:29 AM
class Solution {
    public int findLucky(int[] arr) {
        int[] freq = new int[501];
        for (int i = 0; i < arr.length; i++) {
            freq[arr[i]]++;
        }
        int result = -1;
        for (int i = 1; i < freq.length; i++) {
            if (freq[i] == i) {
                if (i > result) {
                    result = i;
                }
            }
        }

        return result;
    }
}
