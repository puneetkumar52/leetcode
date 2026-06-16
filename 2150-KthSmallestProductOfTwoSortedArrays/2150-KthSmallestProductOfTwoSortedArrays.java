// Last updated: 6/16/2026, 8:51:19 AM
import java.util.*;

class Solution {
    public long kthSmallestProduct(int[] nums1, int[] nums2, long k) {
        Arrays.sort(nums1);
        Arrays.sort(nums2);

        long left = -10_000_000_000L;
        long right = 10_000_000_000L;

        while (left < right) {
            long mid = left + (right - left) / 2;
            if (countPairs(nums1, nums2, mid) >= k) {
                right = mid;
            } else {
                left = mid + 1;
            }
        }

        return left;
    }

    private long countPairs(int[] A, int[] B, long x) {
        long count = 0;
        int m = A.length, n = B.length;

        for (int i = 0; i < m; i++) {
            int a = A[i];
            if (a == 0) {
                if (x >= 0) count += n;
            } else if (a > 0) {
                // Count how many j in B where a * B[j] <= x
                int l = 0, r = n;
                while (l < r) {
                    int mid = (l + r) / 2;
                    if ((long) a * B[mid] <= x) l = mid + 1;
                    else r = mid;
                }
                count += l;
            } else {
                // a < 0, look from right side
                int l = 0, r = n;
                while (l < r) {
                    int mid = (l + r) / 2;
                    if ((long) a * B[mid] <= x) r = mid;
                    else l = mid + 1;
                }
                count += n - l;
            }
        }

        return count;
    }
}
