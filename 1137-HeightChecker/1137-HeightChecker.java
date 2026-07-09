// Last updated: 7/9/2026, 1:43:40 PM
class Solution {
    public int heightChecker(int[] heights) {
        int res=0;
        int[] expect = new int[heights.length];
        for(int i = 0; i < expect.length; i++){
            expect[i] = heights[i];
        }
        Arrays.sort(expect);
        for(int i = 0; i < expect.length; i++){
            if(expect[i] != heights[i]){
                res++;
            }
        }
        return res;
    }
}