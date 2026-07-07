// Last updated: 7/7/2026, 10:54:36 PM
class Solution {
    public int[] twoSum(int[] n, int target) {
        int l=0;
        int r=n.length-1;
        int [] nums=new int[2];
        while (l<r){
            int sum = n[l]+ n[r];
            if (target==sum){
                nums[0]=l+1;
                nums[1]=r+1;
                return nums;
            }
            else if (target>sum){
                l++;
            }
            else{
                r--;
            }
        
        }
        return nums;
    }
}