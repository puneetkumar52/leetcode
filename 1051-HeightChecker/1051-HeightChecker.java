// Last updated: 7/10/2026, 9:24:45 PM
1class Solution {
2    public int heightChecker(int[] heights) {
3        int res=0;
4        int[] expect = new int[heights.length];
5        for(int i = 0; i < expect.length; i++){
6            expect[i] = heights[i];
7        }
8        Arrays.sort(expect);
9        for(int i = 0; i < expect.length; i++){
10            if(expect[i] != heights[i]){
11                res++;
12            }
13        }
14        return res;
15    }
16}