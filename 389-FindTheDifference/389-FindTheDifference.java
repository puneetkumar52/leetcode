// Last updated: 6/16/2026, 8:51:57 AM
class Solution {
    public char findTheDifference(String s, String t) {
        char result = 0;

        for (char c : s.toCharArray()) {
            result ^= c;
        }

        for (char c : t.toCharArray()) {
            result ^= c;
        }

        return result;
    }
}
