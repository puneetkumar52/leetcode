// Last updated: 6/16/2026, 8:51:38 AM
class Solution {
    public int fib(int n) {
        int result=0;
        if(n>1){
            result=fib(n-1)+fib(n-2);
        }
        else{
            return n;
        }
        return result;
    }
}