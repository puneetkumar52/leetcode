// Last updated: 6/16/2026, 8:52:12 AM
class Solution {
    public boolean isPowerOfTwo(int n) {
        if (n<=0){
            return false;
        }
        else if(n==1){
            return true;
        }
        else{
            while(n%2==0){
                n=n/2;
            }
            if (n==1){
                return true;
            }
            else{
                return false;
            }
        }
    }
}