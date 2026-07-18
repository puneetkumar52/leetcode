// Last updated: 7/18/2026, 3:25:09 PM
import java.util.Arrays;

class Solution {
    public int hIndex(int[] citations) {

        Arrays.sort(citations);

        // Reverse the array
        int left = 0;
        int right = citations.length - 1;

        while (left < right) {
            int temp = citations[left];
            citations[left] = citations[right];
            citations[right] = temp;

            left++;
            right--;
        }

        int count = 0;

        for (int i = 0; i < citations.length; i++) {
            if (citations[i] >= i + 1) {
                count++;
            } else {
                break;
            }
        }

        return count;
    }
}