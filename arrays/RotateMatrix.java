// Rotate matrix by 90 degree
// You are given an n x n 2D matrix representing an image, rotate the image by 90 degrees (clockwise).
// You have to rotate the image in-place, which means you have to modify the input 2D matrix directly. DO NOT allocate another 2D matrix and do the rotation.

class Solution {
  public void rotate(int[][] matrix) {
      for (int i = 0; i < matrix.length; i++) {
        for (int j = i; j < matrix[0].length; j++) {
            int temp = matrix[i][j];
            matrix[i][j] = matrix[j][i];
            matrix[j][i] = temp;
        }
      }
      for (int[] row: matrix) {
          int i = 0;
          int j = row.length - 1;
          while (i < j) {
              int temp = row[j];
              row[j--] = row[i];
              row[i++] = temp;
          }
      }
  }
}
