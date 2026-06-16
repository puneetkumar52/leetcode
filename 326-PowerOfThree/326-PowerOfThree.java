// Last updated: 6/16/2026, 8:52:00 AM
class Solution {
    public boolean isPowerOfThree(int n) {
        if (n <= 0) return false;
        if (n == 1) return true;
        while (n % 3 == 0) n /= 3;
        return n == 1;
    }
}