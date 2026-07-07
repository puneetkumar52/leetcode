// Last updated: 7/7/2026, 10:54:30 PM
class Solution {
    public boolean isHappy(int n) {
        if (n==1 || n==7){
            return true;
        }
        else if (n<10) {
            return false;
        }
        else{
            int sum=0;
            while (n>0){
                int temp=n%10;
                sum+=temp*temp;
                n=n/10;
            }
            return isHappy(sum);
        }
    }
}