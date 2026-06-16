// Last updated: 6/16/2026, 8:53:19 AM
class Solution {
    public int reverse(int x) {
        long reversed = 0;
        int sign = 1;

        if (x < 0) {
            sign = -1;
            x = -x;
        }

        while (x > 0) {
            reversed = reversed * 10 + x % 10;
            x /= 10;
        }

        reversed *= sign;

        if (reversed < Integer.MIN_VALUE || reversed > Integer.MAX_VALUE) {
            return 0;
        }

        return (int) reversed;
    }
}