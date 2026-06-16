// Last updated: 6/16/2026, 10:57:24 AM
// solved using two booleans. one for row another for colomn. first traverse entire matrix and get where 0 is then change that row and column
1class Solution {
2    public void setZeroes(int[][] matrix) {
3        int rows = matrix.length;
4        int cols = matrix[0].length;
5
6        boolean[] zeroRows = new boolean[rows];
7        boolean[] zeroCols = new boolean[cols];
8
9        // Step 1: Record rows and columns containing 0
10        for (int i = 0; i < rows; i++) {
11            for (int j = 0; j < cols; j++) {
12                if (matrix[i][j] == 0) {
13                    zeroRows[i] = true;
14                    zeroCols[j] = true;
15                }
16            }
17        }
18
19        // Step 2: Set elements to 0
20        for (int i = 0; i < rows; i++) {
21            for (int j = 0; j < cols; j++) {
22                if (zeroRows[i] || zeroCols[j]) {
23                    matrix[i][j] = 0;
24                }
25            }
26        }
27    }
28}