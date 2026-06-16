// Last updated: 6/16/2026, 8:51:31 AM
class Solution {
    public int maximum69Number (int num) {
        String s = String.valueOf(num);

        int index = s.indexOf('6');
        

        if (index != -1) {
            s = s.substring(0, index) + "9" + s.substring(index + 1);
        }

        return Integer.parseInt(s);
    }
}