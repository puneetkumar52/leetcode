// Last updated: 6/16/2026, 8:51:23 AM
class Solution {
    public int maxProductDifference(int[] arr) {
        Arrays.sort(arr);
        int p=arr[0]*arr[1];
        int q=arr[arr.length-1]*arr[arr.length-2];
        return (q-p);
    }
}