// Set Matrix Zeroes
// Given an m x n integer matrix matrix, if an element is 0, set its entire row and column to 0's.

class Solution {
    public void setZeroes(int[][] matrix) {
        ArrayList<Integer> zeros = new ArrayList<Integer>();
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                if (matrix[i][j] == 0) {
                    zeros.add(i);
                    zeros.add(j);
                }
            }
        }
        for (int i = 0; i < zeros.size(); i += 2) {
            int r = zeros.get(i);
            int c = zeros.get(i+1);
            for (int col = 0; col < matrix[0].length; col++) {
                matrix[r][col] = 0;
            }
            for (int row = 0; row < matrix.length; row++) {
                matrix[row][c] = 0;
            }
        }
    }
}
