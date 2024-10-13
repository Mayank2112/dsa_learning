// Spiral Matrix
// Given an m x n matrix, return all elements of the matrix in spiral order.

class Solution {
  public List<Integer> spiralOrder(int[][] matrix) {
      int up = 0;
      int left = 0;
      int right = matrix[0].length - 1;
      int down = matrix.length - 1;
      int direction = 1;
      int row = 0;
      int col = 0;
      List<Integer> res = new ArrayList<Integer>();
      int total = matrix.length * matrix[0].length;
      for (int i = 0; i < total; i++) {
          res.add(matrix[row][col]);
          switch (direction) {
              case 1:
                  if (col == right) {
                      up++;
                      row++;
                      direction = 2;
                  } else col++;
                  break;
              case 2:
                  if (row == down) {
                      right--;
                      col--;
                      direction = 3;
                  } else row++;
                  break;
              case 3:
                  if (col == left) {
                      down--;
                      row--;
                      direction = 4;
                  } else col--;
                  break;
              case 4:
                  if (row == up) {
                      left++;
                      col++;
                      direction = 1;
                  } else row--;
                  break;
          }
      }
      return res;
  }
}
