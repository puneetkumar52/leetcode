// Last updated: 6/16/2026, 8:51:50 AM
class Solution {
    public boolean checkPerfectNumber(int n) {
        int sum=0;
        if (n<1) {
            return false;
        }
        for(int i=1;i<n;i++){
            if (n%i==0){
                sum+=i;
            }
        }
        if (sum==n){
            return true;
        }
        else{
            return false;
        }
    }
}