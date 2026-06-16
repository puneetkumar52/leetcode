// Last updated: 6/16/2026, 8:53:14 AM
class Solution {
    public String intToRoman(int num) {
        if (num < 1 || num > 3999) {
            return "Invalid input: Number must be between 1 and 3999";
        }

        StringBuilder result = new StringBuilder();
        int[] values = {1000, 900, 500, 400, 100, 90, 50, 40, 10, 9, 5, 4, 1};
        String[] symbols = {"M", "CM", "D", "CD", "C", "XC", "L", "XL", "X", "IX", "V", "IV", "I"};

        for (int i = 0; i < values.length; i++) {
            while (num >= values[i]) {
                result.append(symbols[i]);
                num -= values[i];
            }
        }

        return result.toString();
    }
}