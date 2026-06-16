// Last updated: 6/16/2026, 8:51:54 AM
class Solution {
    public boolean repeatedSubstringPattern(String s) {
        return (s + s).substring(1, 2 * s.length() - 1).contains(s);
    }
}