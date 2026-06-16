// Last updated: 6/16/2026, 8:51:14 AM
public class Solution {
    public int longestSubsequence(String s, int k) {
        long currentVal = 0;
        int ansLength = 0;
        long power = 1;

        for (int i = s.length() - 1; i >= 0; i--) {
            char ch = s.charAt(i);

            if (ch == '0') {
                ansLength++;
            } else {
                if (currentVal + power <= k) {
                    currentVal += power;
                    ansLength++;
                }
            }

            if (power <= k) {
                power *= 2;
            }
        }

        return ansLength;
    }
}
