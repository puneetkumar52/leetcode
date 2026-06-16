// Last updated: 6/16/2026, 8:51:09 AM
import java.util.*;

class Solution {
    public List<String> partitionString(String s) {
        Set<String> seen = new HashSet<>();
        List<String> result = new ArrayList<>();

        int i = 0;
        int n = s.length();

        while (i < n) {
            StringBuilder curr = new StringBuilder();
            int j = i;

            while (j < n) {
                curr.append(s.charAt(j));
                String currStr = curr.toString();

                if (!seen.contains(currStr)) {
                    seen.add(currStr);
                    result.add(currStr);
                    break;
                }
                j++;
            }

            i = j + 1; // move to the character after the current segment
        }

        return result;
    }
}
