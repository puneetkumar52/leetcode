// Last updated: 6/16/2026, 8:51:36 AM
class Solution {
    public String removeDuplicates(String s) {
        int n=s.length();
        Stack<Character> st=new Stack<>();
        for (int i=0;i<n;i++) {
            if (!st.isEmpty() && s.charAt(i)==st.peek()) {
                st.pop();
            } else {
                st.push(s.charAt(i));
            }
        } 
        String ans="";
        while(!st.isEmpty()){
            ans=st.pop()+ans;
        }
        return ans;
    }
}