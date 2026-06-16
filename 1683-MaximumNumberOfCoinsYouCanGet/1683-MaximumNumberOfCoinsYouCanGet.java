// Last updated: 6/16/2026, 8:51:24 AM
class Solution {
    public int maxCoins(int[] piles) {
        Arrays.sort(piles);
        int ans =0;
        int i =0;
        int j = piles.length -1;
        while(i<j){
            ans+= piles[j -1];
            j -= 2;
            i++;
        }
        return ans;
    }
}