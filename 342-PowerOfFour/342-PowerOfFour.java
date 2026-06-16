// Last updated: 6/16/2026, 8:51:58 AM
class Solution {
    public boolean isPowerOfFour(int n) {
        if (n <= 0) return false;
        if (n == 1) return true;
        while (n % 4 == 0) n /= 4;
        return n == 1;
    }
}