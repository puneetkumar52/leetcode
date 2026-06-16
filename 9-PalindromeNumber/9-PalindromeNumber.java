// Last updated: 6/16/2026, 8:53:17 AM
class Solution {
    public boolean isPalindrome(int x) {
        int rev=0;
        int org=x;
        if (x<0 || (x%10==0 && x!=0)){
            return false;
        }
        while(x!=0){
            int rem=x%10;
            rev=rev*10+rem;
            x=x/10;
        }
        return org==rev;
    }
}