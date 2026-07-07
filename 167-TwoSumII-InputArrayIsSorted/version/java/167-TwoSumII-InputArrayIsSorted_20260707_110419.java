// Last updated: 7/7/2026, 11:04:19 AM
1class Solution {
2    public int[] twoSum(int[] n, int target) {
3        int l=0;
4        int r=n.length-1;
5        int [] nums=new int[2];
6        while (l<r){
7            int sum = n[l]+ n[r];
8            if (target==sum){
9                nums[0]=l+1;
10                nums[1]=r+1;
11                return nums;
12            }
13            else if (target>sum){
14                l++;
15            }
16            else{
17                r--;
18            }
19        
20        }
21        return nums;
22    }
23}