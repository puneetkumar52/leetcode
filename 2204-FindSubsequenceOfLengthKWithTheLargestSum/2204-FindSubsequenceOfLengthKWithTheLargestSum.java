// Last updated: 6/16/2026, 8:51:17 AM
import java.util.*;

public class Solution  {
    public static int[] maxSubsequence(int[] nums, int k) {
        int n = nums.length;
        
        // Store elements with their indices
        int[][] pairs = new int[n][2]; // [value, index]
        for (int i = 0; i < n; i++) {
            pairs[i][0] = nums[i];
            pairs[i][1] = i;
        }

        // Sort by value descending
        Arrays.sort(pairs, (a, b) -> Integer.compare(b[0], a[0]));

        // Pick top k elements (value + index)
        Arrays.sort(pairs, 0, k, (a, b) -> Integer.compare(a[1], b[1])); // sort by index to preserve order

        // Extract the values
        int[] result = new int[k];
        for (int i = 0; i < k; i++) {
            result[i] = pairs[i][0];
        }

        return result;
    }
}
