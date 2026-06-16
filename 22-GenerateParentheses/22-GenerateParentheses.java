// Last updated: 6/16/2026, 8:53:06 AM
import java.util.ArrayList;
import java.util.List;

class Solution {  // The Solution class is essential for online judges

    public List<String> generateParenthesis(int n) { // Correct method name
        List<String> result = new ArrayList<>();
        generate(result, "", n, n);
        return result;
    }

    private void generate(List<String> result, String current, int open, int close) {
        if (open == 0 && close == 0) {
            result.add(current);
            return;
        }

        if (open > 0) {
            generate(result, current + "(", open - 1, close);
        }

        if (close > 0 && close > open) {
            generate(result, current + ")", open, close - 1);
        }
    }
}

//  You might have a Driver class like this (or the online judge provides it)
public class GenerateParentheses {  // Or a different name if needed

    public static void main(String[] args) {
        Solution sol = new Solution(); // Use the Solution class
        int n = 3;
        List<String> output = sol.generateParenthesis(n);
        System.out.println(output);

        n = 1;
        output = sol.generateParenthesis(n);
        System.out.println(output);

        n = 2;
        output = sol.generateParenthesis(n);
        System.out.println(output);

        n = 4;
        output = sol.generateParenthesis(n);
        System.out.println(output);
    }
}